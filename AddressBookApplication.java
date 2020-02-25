package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.io.FileNotFoundException;

/** AddressBookApplication Class
 * Creates an instance of AddressBook called ab
 * Main contains Menu loop for menu call options
 * @author AddressBookApplication
 * @author presentMainLoop(ab)
 * @return initAddressBookExercise(AddressBook ab)
 *
 */


public class AddressBookApplication {




    //Main Program
    public static void main(String[] args) throws IOException {


        AddressBook ab = new AddressBook();

         Menu.presentMainLoop(ab);


    }



    //method
    public static void initAddressBookExercise(AddressBook ab){

        //create 2 AddressEntry objects and store in ab and then do a listing on it
        AddressEntry ab1 = new AddressEntry();
        AddressEntry ab2 = new AddressEntry();



    }



}
