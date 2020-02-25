package com.company;


import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * AddressBook.java
 * contains all the methods required, readFromFile(),add(), remove(), find(), and list().
 * @author AddressBook
 * @return readFromFile()
 * @return add()
 * @return remove()
 * @return find()
 * @return list()
 */
//This is where we store our list methods such as addition, search/find, remove, etc.
public class AddressBook {
   static ArrayList<AddressEntry> addressList = new ArrayList<AddressEntry>();

   Scanner input = new Scanner(System.in);

   public void add(AddressEntry ae){

      //add the instance ae (AddressENtry object) to this AddresBook's addresslist
      addressList.add(ae);


   }



   public void find(){

      //I need to create a separate
      System.out.println("Enter in all or the beginning of the Last Name of the contact you wish to find: \n");
      String removeLastName = input.next() + ".*";
      //works by taking user input and basically ignoring the rest of the string with "*"
      addressList.remove(removeLastName + ".*");

      System.out.println(addressList.toString());


   }


   public void remove(){

   }

   public void readFromFile() throws IOException {




      //see example


      //AddressEntry ae = new AddressEntry(fName, lName, stName, cName, sName, zName, pName, eName);

     // FileReader file_input = new FileReader("AddressInputDataFile.txt");

      //BufferedReader BR = new BufferedReader(file_input);
      //String Line = BR.readLine();
     // String fName = BR.readLine();
      //LOOP to keep reading while more data in the file
      //while(( fName = BR.readLine()) != null) {

                //  String fName = BR.readLine();


         //reading in Line 1 of the "next AE" in the data file
    //  }
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



   public void list(){

      //the length of the addressList
      int length = addressList.size();
      //iterate through all the elements (AddressEntry objects) in our addressList
      // call toString on each one and print out the string
      for (int i = 0; i < length; i++){
         System.out.println("Thank you the following contact has been added to your address book: ");
           System.out.println( (addressList.get(i)).toString() );

      }



   }
}