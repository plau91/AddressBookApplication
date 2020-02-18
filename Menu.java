/**
 *This is our menu file which will be called by the main to list prompts for userInput
 *It will then store the data into corresponding fields to be promptly printed on the screen.
 *@author Menu
 *@param Prompts()
 *@return userInput
**/


package com.company;

import java.util.Scanner;

class Menu {
    //Scanner allows for user input
    static Scanner userInput = new Scanner(System.in);






        //This is where the function prompts user input to enter data which will later be stored into there designated locations
        public static void prompt_FirstName() {
            System.out.println("First Name: ");

            String firstName = userInput.next();

            System.out.println("First Name: " + firstName);
        }
    //Function for LastName
    public static void prompt_LastName() {
            System.out.println("Last Name: ");

            String lastName = userInput.next();

            System.out.println("Last Name: " + lastName);

    }
    //Function for Street Name
    public static void prompt_Street() {
            System.out.println("Street Name: ");

            String street = userInput.next();

            System.out.println("Street Name: " + street);

    }
    //Function for city name
    public static void prompt_City() {
            System.out.println("City: ");

            String city = userInput.next();

            System.out.println("City Name: " + city);


    }
    //function for state
    public static void prompt_State() {
        System.out.println("State: ");

        String state = userInput.next();

        System.out.println("State Name: " + state);
    }
    //function for zip
    public static void prompt_Zip() {
        System.out.println("Zip: ");

        String zip = userInput.next();

        System.out.println("Zip Code: " + zip);

    }
    //function for telephone
    public static void prompt_Telephone() {
        System.out.println("Telephone Number: ");

        String telephone = userInput.next();

        System.out.println("Telephone Number: " + telephone);
    }
    //function for email
    public static void prompt_Email() {
        System.out.println("Email: ");

        String email = userInput.next();

        System.out.println("Email: " + email);
    }
}
