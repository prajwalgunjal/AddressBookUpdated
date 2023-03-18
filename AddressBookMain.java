package com.bridgelabz;
import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        System.out.println("welcome to addrrss book");
        System.out.println("Choose your opeartion form list ");
        while(true)
        {
            System.out.println("1)add new contact \n 2) display contact \n3) delete contact \n4) edit contact \n5)exit ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 -> {
                    addressBook.addContact();
                }
                case 2 ->{
                    addressBook.display();
                }
            }
        }
    }
}