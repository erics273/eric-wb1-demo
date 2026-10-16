package com.pluralsight;

public class StaticMethods {

    public static void main(String[] args) {

        //simple sayHello
        sayHello();
        sayHello();
        sayHello();

        //more complex custom message
        customMessage("Kimball is the man");
        customMessage("Tevyn is pretty awesome as well");
        customMessage("Ice cream sandwhiches");

        //add some numbers
        addNumbers(5, 10);
        addNumbers(7,9);
        addNumbers(5,15);

    }

    //some static methods
    public static void sayHello(){
        System.out.println("Hello World!");
    }

    public static void customMessage(String messageWeWantToSay){
        System.out.println(messageWeWantToSay);
    }

    public static void addNumbers(int number1, int number2){
        System.out.println(number1 + number2);
    }

}
