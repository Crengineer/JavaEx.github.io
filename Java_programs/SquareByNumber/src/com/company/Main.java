package com.company;

public class Main {

    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            int i = 1, j = 1;
            // Line index
            for (i = 1; i <= number; i++) {
                //First line
                if (i == 1) {

                    for (j = 1; j <= number; j++) {
                        System.out.print("*");
                    }
                    System.out.println();

                }
                if (i == number) {
                    for (j = 1; j <= number; j++) {
                        System.out.print("*");
                    }
                }

                if ((i > 1) && (i < number)) {
                    //i-th line - j-th column
                    for (j = 1; j <= number; j++) {

                        if ((j == 1) || (j == number)) {
                            System.out.print("*");
                        } else if((i == j) || (j==(number - i + 1))){
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}
