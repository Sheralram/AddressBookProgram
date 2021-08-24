package com.bridgelabz;

import com.bridgelabz.com.bridgelabz.detailsAddressBook;

import java.util.Scanner;

public class AddressBookProgram {
//Ability to create a Contacts in Address  Book with first and last names, address,  city, state, zip, phone number and  email…
    // @author:Ramkrishna
    //@version:1.1
    //@since:19.08.2021


//    public static void getInput() {
//
//        detailsAddressBook details = new detailsAddressBook();
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the following  address details as below:  ");
//
//        System.out.println("First Name: ");
//        details.setFirstName(input.nextLine());
//
//        System.out.println("Last Name:");
//        details.setLastName(input.nextLine());
//
//        System.out.println("Address");
//        details.setAddress(input.nextLine());
//
//        System.out.println("City:");
//        details.setCity(input.nextLine());
//
//        System.out.println("State:");
//        details.setState(input.nextLine());
//
//        System.out.println("Zip:");
//        details.setZip(input.nextLong());
//
//        System.out.println("Phone Number:");
//        details.setPhoneNumber(input.nextLong());
//
//        System.out.println("email address");
//        details.setEmailAddress(input.nextLine());
//
//
//        System.out.println("First Name :" + details.getFirstName());
//        System.out.println("Last Name: " + details.getLastName());
//        System.out.println("address: " + details.getAddress());
//        System.out.println("City :" + details.getCity());
//        System.out.println("State:" + details.getState());
//        System.out.println("Zip:" + details.getZip());
//        System.out.println("Phone Number:" + details.getPhoneNumber());
//        System.out.println("email address: " + details.getEmailAddress());
//    }


    public static void main(String[] args) {
        System.out.println("WELCOME TO ADDRESS BOOK PROGRAM");
        OptionMenu operation = new OptionMenu();
        operation.operation();

    }
}
