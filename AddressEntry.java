package com.company;


public class AddressEntry  {
    String firstName;
    String lastName;
    String street;
    String city;
    String state;
    String zip;
    String phone;
    String email;


    AddressEntry(String firstName, String lastName, String street, String city, String state, String zip, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    public AddressEntry(){
        //Default Constructor
    }

    // This is our setter's
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setStreet(String street) {
        this.street = street;
    }

    void setCity(String city) {
        this.city = city;
    }

    void setState(String state) {
        this.state = state;
    }

    void setZip(String zip) {
        this.zip = zip;
    }

    void setPhone(String phone) {
        this.phone = phone;
    }

    void setEmail(String email) {
        this.email = email;
    }

    // This is our getter's
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    // This is our toString function
    public String toString() {
        return firstName + " " + lastName + "\n" + street + " \n " + city + "," + state + " " + zip + " \n " + email + " \n " + phone;

    }
    public String lastname() {
        return lastName;
    }


}
