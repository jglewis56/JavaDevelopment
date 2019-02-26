package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(true,score,levelCompleted,bonus);
        System.out.println("Your final Score was " + highScore);

        highScore = calculateScore(true,10000,8,200);
        System.out.println("Your final Score was " + highScore);


        //Challenge Portion
        int playerScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Jordan", playerScore);

        playerScore = calculateHighScorePosition(900);
        displayHighScorePosition("James", playerScore);

        playerScore = calculateHighScorePosition(400);
        displayHighScorePosition("Glen", playerScore);

        playerScore = calculateHighScorePosition(50);
        displayHighScorePosition("Michael", playerScore);
    }
    public static int calculateScore ( boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        else
            return -1;
    }
    //Challenge

    /*
    Create a method called displayHighScorePosition
        it should be a players name as a parameter, and a 2nd parameter as a position in the high score table
        you should display the players name along with a message like " managed to get into position" and the
         position they got and further message " on the high score table

     Create a 2nd method called calculationHighScorePosition
        it should be sent one argument only, the player score
        it should return an int
        the return data should be
        1 if the score is > 1000
        2 if the score is >500 and <1000
        3 if the score is >100 and < 500
        4 in all other cases
     */

    public static void displayHighScorePosition(String playerName, int highScore)
    {
        System.out.println(playerName + " managed to get into position " + highScore +
            " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore)
    {
        int position = 4;
        if(playerScore >= 1000)
        {
            position = 1;
        }
        else if(playerScore >= 500)
        {
            position = 2;
        }
        else if(playerScore >= 100)
        {
            position =  3;
        }
        return position;
    }
}

