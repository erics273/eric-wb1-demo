package com.pluralsight;

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

    }

}
