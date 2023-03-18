package com.bridgelabz;
import java.util.Scanner;
public class AddressBook {
    Contact contact = new Contact();
    public void addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values of contact");
        System.out.println("Enter the First Name");
        String firstName = scanner.next();
        System.out.println("Enter the Last Name");
        String lastName = scanner.next();
        System.out.println("Enter the Address");
        String address = scanner.next();
        System.out.println("Enter the City");
        String city = scanner.next();
        System.out.println("Enter the State");
        String state = scanner.next();
        System.out.println("Enter the zip");
        String zip = scanner.next();
        System.out.println("Enter the Phone Number");
        String phoneNumber = scanner.next();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhoneNumber(phoneNumber);
    }
    @Override
    public String toString() {
        return "AddressBook{" +
                "contact=" + contact +
                '}';
    }
}