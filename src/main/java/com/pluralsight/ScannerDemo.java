package com.pluralsight;

//this was created by the editor just becuase I tried to use the scanner
//it did the import for me
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        //created a scanner for me to use
        //getting input from the keyboard in the terminal
        //we can use this as many times as we want
        Scanner theScanner = new Scanner(System.in);

        System.out.println("what year is it?");

        int year = theScanner.nextInt();

        //because I am switching from asking for numbers to askinf for words
        //i need to eat the newline character thats stuck in the buffer
        theScanner.nextLine();

        //i want to ask the user a question so they know what input to give me
        System.out.println("Please enter your first name: ");

        //capture the answer from the user
        String firstName = theScanner.nextLine();

        //ask the user another question
        System.out.println("Please enter your last name: ");

        String lastName = theScanner.nextLine();

        //ask the user what their luck number is
        System.out.println("what is your lucky number?");

        //store the lucky number in a variable
        int luckyNumber = theScanner.nextInt();

        //print out whatever they typed after they press enter
        System.out.printf("Your name is %s, %s, it is the year %d, and your lucky number is %d%n", lastName, firstName,  year, luckyNumber);
//        System.out.println("your name is " + name );

        //ask the user for a number
        System.out.println("give me a number: ");

        //store the number as a number by using .nextInt on the scanner instead of .nextLine
        int num1 = theScanner.nextInt();

        //aske the user for another number
        System.out.println("give me another number: ");

        //store the number as a number by using .nextInt on the scanner instead of .nextLine
        int num2 = theScanner.nextInt();

        //add those numbers
        int sum = num1 + num2;

        //display the result
        System.out.println("those numbers added together are " + sum);


    }

}
