package com.company;

public class Main {

    public static void main(String[] args) {
	    // same methods with different arguments

        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is: " + newScore);
        calculateScore(75);
        calculateScore("BERGSTEIN", 100);
        calcFeetAndInchesToCentimeters(0, 10);

    }

    private static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score*1000;
    }

    private static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score*1000;
    }

    private static int calculateScore(){
        return 0;
    }

    //private static void calculateScore(){
    //    System.out.println("AHO");
    //}

    private static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet < 0) || (inches < 0 ) || (inches > 12)){
            return -1;
        }
        else {
            double centimeters = (feet * 12) *2.54;
            centimeters += inches * 2.54;
            return (centimeters);
        }
    }

    private static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }
        else {
            return (inches*12);
        }


    }





}
