package com.company;


/**
 *This is our class file for AddressEntry which will hold all
 *necessary class files and variables for AddressEntry
 * we also have our setter and getter methods and mutators
 *
 *@author AddressEntry
 *@author AddressEntryList
 *@param Setter methods
 * @param Getter methods
 * @return toString()

**/

java.lang.AddressBook;

import java.util.ArrayList;
import java.util.List;

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

    void addressEntryList() {
        firstName = "";
        lastName = "";
        street = "";
        city = "";
        state = "";
        zip = "";
        phone = "";
        email = "";
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
        return firstName + " " + lastName + ";"
                return  street + " " + city + " " + state + " " + zip + " " + phone + " " + email + " ";

    }

}