package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;

        // abbreviation of operations

        // result = result + 1
        result++;
        // result = result - 1
        result--;

        // result = result + 2
        result += 2;
        // result = result - 2
        result -= 2;
        // result = result * 10
        result *= 10;
        // result = result / 4
        result /= 4;

        boolean isAlien = false;
        if ( isAlien == true)
            System.out.println("It is an Alien!");
        else
            System.out.println("It is not an Alien!");

        int topScore = 100;
        if(topScore != 100) {
            System.out.println("CULO");
        }

        int secondScore = 80;
        if((topScore > secondScore) && (topScore < 100)){
            System.out.println("ULURU");
        }

        if ( (topScore > 90 ) || (secondScore <= 90)){
            System.out.println("Either or both of the conditions are true.");
        }

        int newValue= 50;
        if(newValue == 50){
            System.out.println("This is an error.");
        }

        boolean isCar = false;
        if(isCar == true){
            System.out.println("This is not supposed to happen");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;


        if(wasCar) {
            System.out.println("wasCar is true");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient > 20) ? true : false;
        System.out.println(isEighteenOrOver);

        /////////////////////////////////////////////////////////////////

        double value1 = 20.00d;
        double value2 = 80.00d;
        double sum = (value1 + value2)*100.00d;
        sum = sum % 40.00d;

        boolean isRemainder = false;

        if(sum == 0){
            isRemainder = true;
        }
        else{
            isRemainder = false;
            System.out.println("There are some remainder.");
        }


        System.out.println(isRemainder);

        boolean isRemainderTwo = (sum == 0) ? true : false;
        System.out.println(isRemainderTwo);

        if(!isRemainderTwo){
            System.out.println("You know you know");
        }










    }
}
