package com.company;
import java.lang.Math;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int  counter = 0;

        double average = 0d, sum=0;

        while(true){

            boolean hasNextInt = scanner.hasNextInt();


            if(hasNextInt == false){
                break;
            } else {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                average = sum / counter;
            }

        }
        long avg = Math.round(average);
        int av = (int)avg;
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
