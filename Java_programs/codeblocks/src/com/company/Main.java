package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if(score == 5000){
            System.out.println("Your score was 5000.");
        }
        else {
            System.out.println("Your score was not 5000.");
        }
        System.out.println("This was executed");

        if(score < 5000 && score > 1000){
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if(score < 1000){
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        boolean newGameOver = true;
        score = 1000;
        levelCompleted = 8;
        bonus = 200;
        System.out.println("Score: " + score + "\n Level Completed: " + levelCompleted + "\n bonus: " + bonus + " ");






    }
}
