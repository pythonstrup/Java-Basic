package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        return -1;
    }

    // Challenge
    public static void displayHighScorePosition(String name, int highScore){
        System.out.println(name + " managed to get into position " +
                highScore + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
//        if(score > 1000){
//            return 1;
//        } else if(score > 500 && score <= 1000){
//            return 2;
//        } else if (score > 100 && score <= 500){
//            return 3;
//        } else {
//            return 4;
//        }
        int position = 4;

        if(score > 1000){
            position = 1;
        } else if(score > 500 && score <= 1000) {
            position = 2;
        } else if (score > 100 && score <= 500) {
            position = 3;
        }
        return position;
    }
}
