package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {
    Contact contact = new Contact();
    Scanner scanner = new Scanner(System.in);
    ArrayList<Contact> con=new ArrayList<>();
    static int count =-1;
    void createContact() {
            System.out.println("Enter the values of contact");
            System.out.print("Enter the First Name");
            String firstName = scanner.next();
            System.out.print("Enter the Last Name");
            String lastName = scanner.next();
            System.out.print("Enter the Address");
            String address = scanner.next();
            System.out.print("Enter the City");
            String city = scanner.next();
            System.out.print("Enter the State");
            String state = scanner.next();
            System.out.print("Enter the zip");
            String zip = scanner.next();
            System.out.print("Enter email");
            String email = scanner.next();
            System.out.print("Enter the Phone Number");
            String phoneNumber = scanner.next();
            contact.setFirstName(firstName);
            contact.setLastName(lastName);
            contact.setAddress(address);
            contact.setCity(city);
            contact.setState(state);
            contact.setZip(zip);
            contact.setPhoneNumber(phoneNumber);
            Contact contact =new Contact(firstName,lastName,address,state,city,email,zip,phoneNumber);
            con.add(contact);
            System.out.println("Contact added successfully");
    }
    void display(){
        for(int i=0;i<con.size();i++)
        {
            System.out.println("*************************");
            System.out.println(con.get(i));
            System.out.println("*************************");
        }
    }
    void delete() {
        System.out.println("Enter the first namr of the contact");
        String name = scanner.next();
        con.removeIf(contact -> contact.getFirstName().equals(name));
        System.out.println("Contact deleted");
    }
    void edit(){
        System.out.println("Enter name of the person which you want to edit:");
        String edit = scanner.next();
        for(Contact contact : con) {
            if (contact.getFirstName().equals(edit))
            {
                System.out.println("Enter the values of contact");
                System.out.print("Enter the First Name ");
                String firstName = scanner.next();
                System.out.print("Enter the Last Name ");
                String lastName = scanner.next();
                System.out.print("Enter the Address ");
                String address = scanner.next();
                System.out.print("Enter the City ");
                String city = scanner.next();
                System.out.print("Enter the State ");
                String state = scanner.next();
                System.out.print("Enter the zip ");
                String zip = scanner.next();
                System.out.print("Enter the Phone Number ");
                String phoneNumber = scanner.next();
                contact.setFirstName(firstName);
                contact.setLastName(lastName);
                contact.setAddress(address);
                contact.setCity(city);
                contact.setState(state);
                contact.setZip(zip);
                contact.setPhoneNumber(phoneNumber);
                System.out.println("contact edited successfully");
                System.out.println(contact);
            }
        }
    }
    @Override
    public String toString() {
        return "AddressBook{" +
                "contact=" + contact +
                '}';
    }
}