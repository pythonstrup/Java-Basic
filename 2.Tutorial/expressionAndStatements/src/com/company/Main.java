package com.company;

public class Main {

    public static void main(String[] args) {
        // a mile is equal to 1.609344 kilometres
        double kilometres = (100 * 1.609344);

        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is an expression");
        }


        int var1
                =
                50;

        if (var1 == 50) {
            System.out.println("Printed");
        }

        var1++;
        var1--;
        System.out.println("This is a test");

        System.out.println("This is" +
                " another" +
                " still more.");

        int var2 = 50;
        var1--;
        System.out.println("This is another one.");

        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000){
//            System.out.println("Your score was less than 5000");
//        } else if(score < 1000){
//            System.out.println("Your score was less than 1000");
//        } else  {
//            System.out.println("Got here");
//        }

        if(gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // error
        // int savedFinalScore = finalScore;


    }
}
