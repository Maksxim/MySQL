package by.tms.myproject;

public class Address {

    private String city;
    private String street;
    private String postIndex;

    public Address(String city, String street, String postIndex) {
        this.city = city;
        this.street = street;
        this.postIndex = postIndex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(String postIndex) {
        this.postIndex = postIndex;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postIndex='" + postIndex + '\'' +
                '}';
    }
}
