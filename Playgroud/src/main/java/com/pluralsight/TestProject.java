package com.pluralsight;

public class TestProject {
    public static void main(String[] args) {

        // int variable to hold random value
//        int counter = 5;

        String nameString = "Brittany Buchanan";

//        //for loop : syntax is -- for (starting point; ending point; increment (i++) or decrement (i--)) {}
//        for(int i = 0; i <= counter; i++) { // note this for loop helps to define a range 0 - 5 ; withing the rand og 0-5 0,2 and 4 hand a remainder of 0.
//
//            //if statement is using modulo symbol to check for remainder
//            //if the remainder is equal to 0 the # is odd
//            //if the remainder is equal to 1 (or not equal to 0) the # is even
//            if (i % 2 == 0) { //is counter even or odd??
//                System.out.println("Hello world");
//            }
//        }


        // if() - else if() - else



        if(nameString.length() < 8){
            System.out.println("That's a long name");
        } else if(String.valueOf(nameString.charAt(nameString.length() - 2)).equals("a")){//
            System.out.println("Yasss Queen B!");
        } else {
            System.out.println("Doing my own thing");
        }


    }
}
