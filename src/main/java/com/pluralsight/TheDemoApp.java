package com.pluralsight;

public class TheDemoApp {

    public static void main(String[] args) {


        //string concatenation
        String firstName = "Eric";
        String lastName = "Schwartz";
        int age = 45;

        //concating with the +
        System.out.println( firstName + " " + lastName + " is awesome. He is " + age + " years old." );

        //formatted string
        System.out.printf("My name is %s %s and he is %d years old", firstName, lastName, age);



    }

}
