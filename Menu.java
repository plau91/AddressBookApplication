package com.company;

import java.util.Scanner;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.File;

/**
 * Class Menu which holds all our prompts and menu calls
 * @author Menu
 * @return prompt_FirstName()
 * @return prompt_LastName()
 * @return prompt_street()
 * @return prompt_city()
 * @return prompt_zip()
 * @return prompt_state()
 * @return prompt_phone()
 * @return prompt_email()
 * @return presentMainLoop()
 * @return find()
 * @return add()
 * @return list()
 * @return readFromFile()
 * @return remove()
 **/

class Menu {
    //Scanner allows for user input
    static Scanner userInput = new Scanner(System.in);






    //This is where the function prompts user input to enter data which will later be stored into there designated locations
    public static String prompt_FirstName() {
        System.out.println("First Name: ");

        String firstName = userInput.next();

        System.out.println("First Name: " + firstName);

        return firstName;
    }
    //Function for LastName
    public static String prompt_LastName() {
        System.out.println("Last Name: ");

        String lastName = userInput.next();

        System.out.println("Last Name: " + lastName);

        return lastName;

    }
    //Function for Street Name
    public static String prompt_Street() {
        System.out.println("Street Name: ");

        String street = userInput.next();

        System.out.println("Street Name: " + street);

        return street;
    }
    //Function for city name
    public static String prompt_City() {
        System.out.println("City: ");

        String city = userInput.next();

        System.out.println("City Name: " + city);

        return city;
    }
    //function for state
    public static String prompt_State() {
        System.out.println("State: ");

        String state = userInput.next();

        System.out.println("State Name: " + state);

        return state;
    }
    //function for zip
    public static String prompt_Zip() {
        System.out.println("Zip: ");

        String zip = userInput.next();

        System.out.println("Zip Code: " + zip);

        return zip;

    }
    //function for telephone
    public static String prompt_Telephone() {
        System.out.println("Telephone Number: ");

        String telephone = userInput.next();

        System.out.println("Telephone Number: " + telephone);

        return telephone;
    }
    //function for email
    public static String prompt_Email() {
        System.out.println("Email: ");

        String email = userInput.next();

        System.out.println("Email: " + email);

        return email;

}


    /**
     * method to represent the main Loop with the options menu
     */
    public static void  presentMainLoop(AddressBook ab) {
        String email, fname, street, city, state, lname, zip, phone;

        char option = 'a';


        String menu = "*****************************\n" +
                "Please enter in your menu selection\n" +
                "a) Loading From File\n" +
                "\n" +
                "b) Addition\n" +
                "\n" +
                "c) Removal\n" +
                "\n" +
                "d) Find\n" +
                "\n" +
                "e) Listing\n" +
                "\n" +
                "f) Quit\n" +

                "*****************************";
        option = 'b';
        while(option!= 'f'){

            System.out.println(menu);
            //read in the user's option for the next menu choiceScanner option = new Scanner(System.in);
            Scanner opt = new Scanner(System.in);

            option = opt.next().charAt(0);


            // option = aslkfadlkalksjdfalsdkfja


           if(option =='a'){





               //see example
             //FileReader file_input = new FileReader("AddressInputDataFile.txt");

             // BufferedReader BR = new BufferedReader(file_input);
               //LOOP to keep reading while more data in the file
             //  while((fName = BR.readLine()) != null)   //reading in Line 1 of the "next AE" in the data file
               // { read in the lName //second line

                   //Line 2= LastName  --> lName
                   //Line 3== Street
                   //Line 4 = City
                   // ....Line 8 = phone
                  //now we are ready to make an AddressEntry object
                  // AddressEntry ae = new AdressEntry(fName, lName,.......);
                  // need to add it to our AddressBook ab
                  // ab.add(ae);
               //END OF LOOP
               //close your open BR and fr
               //BR.close();
               //fr.close();



           }
           else if(option =='b') {

                //prompt user for all the data fields
                fname = prompt_FirstName();
                lname = prompt_LastName();
                street = prompt_Street();
                city = prompt_City();
                state = prompt_State();
                zip = prompt_Zip();
                phone = prompt_Telephone();
                email = prompt_Email();




                //create and AddressEntry object
                AddressEntry addressEntry = new AddressEntry(fname, lname, street, city, state, zip, phone, email);

                //add the newly created AddressEntry Object to our AddressBook instance ab
                ab.add(addressEntry);

                ab.list();


           }

           else if(option == 'c'){
                ab.find();

           }

           else if(option == 'd'){

               ab.find();





           }

            else if(option=='e'){
                    ab.list();
            }

            option ='e';




        }


    }


}
