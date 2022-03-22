package com.company;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + "and this is more";
        System.out.println(myString + " \u00A9 2022.");
        String numberString = "250.55";
        numberString = numberString + " 49.9";
        System.out.println(numberString);
        String myLastString = "10";
        int myInt = 50;
        myLastString = myLastString + myInt; // Java converts Integer to String
        System.out.println(myLastString);
        double myDouble = 120.12d;
        myLastString = myLastString + myDouble;
        System.out.println(myLastString); // as done for Integer is done for Double
    }
}
