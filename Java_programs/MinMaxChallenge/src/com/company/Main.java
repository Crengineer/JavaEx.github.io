package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1, max = 0, min = 0;


        while(counter <= 10){
            System.out.println("Enter number #" + counter + " : ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int number = scanner.nextInt();
                if(counter == 1){
                    min = number;
                }
                counter++;
                if(number <= min){
                    min = number;
                }
                if(number >= max){
                    max = number;
                }
            } else {
                System.out.println("Invalid Number.");
            }

        }

        System.out.println("The max number is: " + max + " and the min number is: " + min);
        scanner.close();
    }


}
