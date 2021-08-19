package com.bridgelabz;

import com.bridgelabz.com.bridgelabz.detailsAddressBook;

import java.util.Scanner;

public class AddressBookProgram {
//Ability to create a Contacts in Address  Book with first and last names, address,  city, state, zip, phone number and  email…
//- Program is written using IDE like IntelliJ
//- Every UC is in a separate Git Branch and then merged with main
//- Naming Convention, Indentation, etc Code Hygiene will be checked during  Review
//- Git Check In Comments and Version History will be monitored
    // @author:Ramkrishna
    //@version:1.1
    //@since:19.08.2021





    public static void getInput(){
    detailsAddressBook details= new detailsAddressBook();
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the following address details ");


        details.setFirstName(input.nextLine());
        System.out.println("First Name :"+details.getFirstName());

        details.setLastName(input.nextLine());
        System.out.println("Last Name: "+details.getLastName());

        details.setEmailAddress(input.nextLine());
        System.out.println("email address: "+details.getEmailAddress());

        details.setAddress(input.nextLine());
        System.out.println("address: "+details.getAddress());

       details.setCity(input.nextLine());
        System.out.println("City :"+details.getCity());

       details.setState(input.nextLine());
        System.out.println("State:"+details.getState());

        details.setZip(input.nextLong());
        System.out.println("Zip:"+details.getZip());

        details.setPhoneNumber(input.nextLong());
        System.out.println("Phone Number:"+details.getPhoneNumber());



}




    public static void main(String[] args) {
        System.out.println("WELCOME TO ADDRESS BOOK PROGRAM");
        getInput();

    }
}
