package com.company;

public class PositiveNegativeZero {

    public static void main(String[] args) {
        checkNumber(0);

    }

    public static void checkNumber(int number){
        if(number > 0)
            System.out.println("The number is positive.");
        if(number < 0)
            System.out.println("The number is negative.");
        if (number == 0)
            System.out.println("The number is equal to zero.");
    }
}
