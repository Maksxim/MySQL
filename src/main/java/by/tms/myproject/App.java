package by.tms.myproject;

import lombok.extern.slf4j.Slf4j;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class App {

    public static void main( String[] args ) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "root";
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            log.debug("Auto commit enabled: {}",connection.getAutoCommit());

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT s.id, s.firstname, s.surname, s.phone, a.city, a.street, a.post_index from student s join address a on s.address_id = a.id;");
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Student> listStudents = new ArrayList<>();
            while (resultSet.next()) {
                Address address = new Address(resultSet.getString("city"),
                        resultSet.getString("street"),
                        resultSet.getString("post_index"));
                Student student = new Student(resultSet.getString("firstname"),
                        resultSet.getString("surname"), resultSet.getInt("phone"),address);
                listStudents.add(student);
            }
            System.out.println(listStudents);
        } catch (SQLException e) {
            log.error("Exception during DB connection: {}", e.getMessage(), e);
        }
    }
}
