package by.tms.myproject;


public class Student {

    private String name;
    private String surname;
    private int phone;

    private Address address;

    public Student(String name, String surname, int phone, Address address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone=" + phone +
                ", address=" + address +
                '}';
    }
}
