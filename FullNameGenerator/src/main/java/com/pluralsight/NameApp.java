package com.pluralsight;

import java.util.Scanner;

public class NameApp {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in); // We need to put the scanner class in first, or the user can't enter anything

        System.out.println("Hello user!");
        System.out.print("What is your first name?  ");
        String firstName = userInput.nextLine(); //the nextLine() method is used to read strings from input

        System.out.print("What is your middle name? ");
        String middleName = userInput.nextLine();

        System.out.print("What is your last name? ");
        String lastName = userInput.nextLine();

        String fullName = (firstName + " " + middleName + " " + lastName); //Input was returning with names mushed together; adding quotes between the operators fixed it.

        System.out.println("Thank you " + fullName);





    }
}
