package com.company;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018.125";
        System.out.println("Number as string: " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("String as Number: " +number);

        numberAsString += 1; // concatenate the 1 to the strin numberAsString
        System.out.println(numberAsString);
        number += 1;
        System.out.println(number);
    }
}
