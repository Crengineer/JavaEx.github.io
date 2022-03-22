package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true, 5000, 5, 100);
        System.out.println("Your final score was " + calculateScoreInt(true, 5000, 5, 100));
        int highScore = calculateScoreInt(true, 5000, 5, 100);

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
        calculateScore(gameOver, score, levelCompleted, bonus);

        /////////////////////////////////////////////////////////////

        displayHighScorePosition("Andrea Palmieri", 4);
        int calc = calculatedHighScorePosition(400);
        System.out.println(calc);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        //boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
        int finalScore = score + (levelCompleted * bonus);
        System.out.println("Your final score was " + finalScore);
    }

    public static int calculateScoreInt(boolean gameOver, int score, int levelCompleted, int bonus){
        //boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
        int finalScore = score + (levelCompleted * bonus);

        return finalScore;
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table.");

    }

    public static int calculatedHighScorePosition(int playerScore){

        if(playerScore >= 1000){
            return 1;
        }
        else if((playerScore >= 500) && (playerScore < 1000)){
            return 2;
        }
        else if((playerScore >= 100) && (playerScore < 500)){
            return 2;
        }

        //////

        return 4;

    }


}
