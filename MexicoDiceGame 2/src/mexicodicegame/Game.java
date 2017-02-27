/*
 * Name: Austin Robert Johnston

 * Course: COP2551

 * Semester: Fall 2015

 * I pledge on my honor that this work is that of my own. 
 * If I’m found to be in violation of the Academic Integrity
 * policies as outlined in the course syllabus, I understand
 * I will receive an unforgiveable F for this course regardless 
 * of withdrawal status.

 */
package mexicodicegame;

import java.util.Scanner;

/**
 *
 * @author joha0033
 */
public class Game {
   
        //String name1;
        //String name2;
        //private String aliasOfWinner;
        //private boolean gameOver;
        private final Dice gameDice = new Dice(6);
        private final Players player1 = new Players("Player 1");
        private final Players player2 = new Players("Player 2");

        //play
        public void play() {
            int firstPlayer = 0;
            firstPlayer = turnOrder();
            //while (player1.getLives() < 100 && player2.getLives() < 100) {
            
            while (player1.getLives() > 0 && player2.getLives() > 0) {
                
                if (firstPlayer == 1) {
                    player1.takeTurn(gameDice);
                    if (player1.getLives() > 0) {
                        player2.takeTurn(gameDice);
                        if (player1.getRoundScore() > player2.getRoundScore())
                        {
                            Player2Loss();
                            displayScore();
                        }
                        else
                        {
                            Player1Loss();
                            displayScore();
                        }
                    } else {
                        break;
                    }
                } else {
                    player2.takeTurn(gameDice);
                    if (player2.getLives() > 0) {
                        player1.takeTurn(gameDice);
                         if (player1.getRoundScore() > player2.getRoundScore())
                        {
                            Player2Loss();
                            displayScore();
                        }
                        else
                        {
                            Player1Loss();
                            displayScore();
                        }
                    } else {
                        break;
                    }
                }
            
            }
            
            
            
            
            if (player1.getLives() > player2.getLives()) {
                System.out.printf("%s! You win!", player1.getAlias());
            } else {
                System.out.printf("%s! You win!", player2.getAlias());
            }
        }
        //method for taking a player2 life
        public void Player2Loss()
        {
            player2.setLives(player2.getLives() - 1);
        }//method for taking a player1 life
        public void Player1Loss()
        {
                player1.setLives(player1.getLives() - 1);
        }
        public void displayScore()
        {
            System.out.printf("Player1 Lives:%s%n%n", player1.getLives());
                            System.out.printf("Player1 Round: %s%n%n", player1.getDisplayScore());
                            System.out.printf("Player2 Lives:%s%n%n", player2.getLives());
                            System.out.printf("Player2 Round Score: %s%n%n", player2.getDisplayScore());
                            player1.setRoundScore(0);
                            player2.setRoundScore(0);
        }

    //who is on first???//
    private int turnOrder() {
        //determine firstplayer
        int firstDiceValue = 0;
        int secondDiceValue = 0;
        

        //roll the die for first player and store result
        gameDice.roll();
        firstDiceValue = gameDice.getValue();

        //
        gameDice.roll();
        secondDiceValue = gameDice.getValue();
        Players.printLine();

        if (firstDiceValue > secondDiceValue) {
            //first player goes first
            return 1;
        } else {
            //second player goes first
            return 2;
        }
    }
}


