package by.tms.myproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

    public static void main( String[] args ) throws ClassNotFoundException {
    //    Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "";
        String user = "";
        String password = "";
        try (Connection connection = DriverManager.getConnection(url, user, password)) {

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
