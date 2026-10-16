package com.pluralsight;

import java.util.Scanner;

public class AskingOurCodeQuestions {

    public static void main(String[] args) {

        //if statement to ask our code a question
        if(6 == 6){
            System.out.println("we made it into the if statement true conditon");
        }else{
            System.out.println("we made it into the if statement false conditon");
        }

        //if statement to ask our code more than one question
        if(6 != 6){
            System.out.println("the first question was true");
        }else if (5 != 6){
            System.out.println("the second question was true");
        }else{
            System.out.println("no question was true");
        }

        //if statement to ask our code more than one question but none are true
        if(6 != 6){
            System.out.println("the first question was true");
        }else if (5 != 5){
            System.out.println("the second question was true");
        }else{
            System.out.println("no question was true");
        }

        //>=

        //true
        if(6 >= 6){
            System.out.println("the first question was true");
        }

        //false
        if(6 > 6){
            System.out.println("the first question was true");
        }

        //complex condition
        if(6 >= 7 || 6 == 6){
            System.out.println("the first question was true");
        }

        //this evaluates to true because one of the conditionsin the or (||) is true
        if(false || true){
            System.out.println("the first question was true");
        }

        //this evalutates to false because with an AND (&&) all conditions must be true
        if(false && true){
            System.out.println("the first question was true");
        }

        //this evalutates to true because one side of the OR is true
        if( (false && true) || true){
            System.out.println("weird combining of conditions with ors and ands");
        }

        //comparing strings
        String string1 = "hello";
        String string2 = "hello";
        String string3 = new String("hello");

        System.out.println("string 1: " + string1);
        System.out.println("string 2: " + string2);
        System.out.println("string 3: " + string3);

        //the same becauswe the occupy the same place in memory
        if(string1 ==  string2){
            System.out.println("They are the same");
        }

        //not the same because the occupy a different place in memory
        //string 3 was created with the String constructor
        //cant use the ==
        if(string1 == string3){
            System.out.println("They are the same");
        }else{
            System.out.println("They are not the same");
        }

        //fix the above with .eqauls()
        if( string1.equals(string3) ){
            System.out.println("They are the same (.eqauls) ");
        }else{
            System.out.println("They are not the same (.eqauls) ");
        }

        //even more simple example
        //fix the above with .eqauls()
        if( "eric".equals( "eric" ) ){
            System.out.println("They are the same (.eqauls) eric");
        }else{
            System.out.println("They are not the same (.eqauls) eric");
        }

        if( "eric".equals( "jennifer" ) ){
            System.out.println("They are the same (.eqauls) eric");
        }else{
            System.out.println("They are not the same (.eqauls) eric");
        }

        if( string1.equals( "hello" ) ){
            System.out.println("They are the same (.eqauls) eric");
        }else{
            System.out.println("They are not the same (.eqauls) eric");
        }

        //this is a example that will be relevent to you right now in class
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        if(name.equals("eric")){
            System.out.println("sup dude");
        }else{
            System.out.println("I dont know you");
        }

    }

}
