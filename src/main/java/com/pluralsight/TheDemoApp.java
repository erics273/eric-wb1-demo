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
        System.out.printf("My name is %s %s and he is %d years old\n", firstName, lastName, age);

        //some math examples with + - * / and %
        int num1 = 10;
        int num2 = 20;

        //add the numbers together and store ina variable called sum
        int sum = num1 + num2;

        //print out the sum
        System.out.println("The sum is " + sum);

        //multiply the numbers
        int product = num1 * num2;
        System.out.println("The product is " + product);

        //subtract the numbers
        int difference = num1 - num2;
        System.out.println("The difference is " + difference);

        //divide the numbers
        int division = num1 / num2;
        System.out.println("The division is " + division);

        //remainder
        int modulo = num1 % num2;
        System.out.println("The modulo is " + modulo);

        //division with a double
        double dividend = num1 / num2;
        System.out.println("The dividend is " + dividend);

        //addition with results as a decimal
        double sumWithDecimal = num1 + num2;
        System.out.println("The sum is " + sumWithDecimal);

        //addition with results as a decimal typcasted
        int sumWithDecimalTypcasted =  (int) sumWithDecimal;
        System.out.println("The sum is " + sumWithDecimalTypcasted);

        //examples the wierdness with pre and post increment
        //explicitly increment by 1
        System.out.println(num1 = num1 + 1);

        //explicitly increment by more than
        System.out.println( num1 += 3 );

        //increment by one but it wont happen before the print line
        System.out.println( num1++ );

        //increment by one but it will happen before the print line
        System.out.println( ++num1 );

        //widening and narrowing

        //widening is no big deal (byte to int)
        byte someSmallByte = 50;
        int someSmallInt = someSmallByte;
        System.out.println(someSmallByte);

        //narrowing issue
        int someBigInt = 120;
        byte someBigByte = (byte) someBigInt;
        System.out.println(someBigByte);


    }

}
