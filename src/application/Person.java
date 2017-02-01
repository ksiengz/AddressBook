package application;

/**
 * Created by Konrad on 01.02.2017.
 */
public class Person {

    private String firstName;
    private String lastName;
    private String phone;
    private String city;
    private String postCode;

    public Person(String firstName, String lastName, String phone, String city, String postCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.city = city;
        this.postCode = postCode;
    }

    //getters
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getPhone() {return phone;}
    public String getCity() {return city;}
    public String getPostCode() {return postCode;}

    //setters
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setPhone(String phone) {this.phone = phone;}
    public void setCity(String city) {this.city = city;}
    public void setPostCode(String postCode) {this.postCode = postCode;}
}
