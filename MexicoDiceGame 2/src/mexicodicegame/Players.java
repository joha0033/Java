package mexicodicegame;

import java.util.Scanner;

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
/**
 *
 * @author joha0033
 */
public class Players {

    private String alias;
    private int lives = 6;//lives
    //private int lives;
    private int roundScore;
    private int displayScore;

//    public Players(double displayScore) {
//        this.displayScore = displayScore;
//    }
    
            

    public Players(String alias) {
        this.alias = alias;
    }

    public Players(int roundScore, int displayScore) {
        this.roundScore = roundScore;
    }
    

    //takeTurn method
    public void takeTurn(Dice dice) {
        int userChoice = 0;
       // int roundScore = 0;
        //int displayScore = 0;
        int reroll = 4;
        Scanner input = new Scanner(System.in);
        
        
        System.out.printf("It is now %s's turn!%n", alias);

        System.out.printf("Please select an option by typing the corresponding number.%n");
 //       for (int rolls = 0; rolls <= 3; ++rolls);
        
        
        
            do {
                
                //System.out.printf("reroll: %s%n", reroll);
                System.out.printf("%n1. Roll! (you have %s rolls left, or hold.)%n", (reroll-1));
                System.out.printf("2. Hold!%n");
                System.out.printf("%nYour choice: ");
                userChoice = input.nextInt();
                printLine();

                if (userChoice == 1 && reroll >1) {
                    
                    
                   if (reroll < 1)
                    {
                        System.out.printf("That roll did not count...");
                        break;
                        
                    }
                    int roll1;
                    int roll2;
                    //int reroll=0;

                    dice.roll();
                    roll1 = dice.getValue();
                    dice.roll();
                    roll2 = dice.getValue();
                    if (roll1 > roll2) {
                        roundScore = (roll1 * 10) + roll2;
                        displayScore=roundScore;
                        reroll--;
                    }
                    if (roll2 > roll1) {
                        roundScore = (roll2 * 10) + roll1;
                        displayScore=roundScore;
                        reroll--;
                    }
                    if (roll1 == roll2) {
                        roundScore = (roll1 * 100) + (roll2 * 10);
                        displayScore=roundScore/10;
                        reroll--;
                    }
                    if (reroll < 1)
                    {
                        break;
                    }
                    if ((roll1 == 2 && roll2 == 1) || (roll1 == 1 && roll2 == 2))
                    {
                        roundScore = 700;
                        displayScore = 21;
                    System.out.printf("21! MEXICO!%n");
                    }
                    
//                if (dice.getValue() == 1) {
//                    roundScore = 0;
//                    break;
//                }
                    

                    System.out.printf("%nRound Score: %d%n%n", displayScore);
                }if (userChoice == 1 && reroll <= 1)
                {
                    System.out.printf("No more rolls, next players turn!%n%n");
                    break;
                }
                else if (userChoice == 2) {
                    //totalScore += roundScore;
                    //System.out.printf("%nLives: %d%n%n", lives);
                    break;
                } else {
                    System.out.printf("Select 1 or 2%n");
                    
                }
            } while (userChoice != 1 || userChoice != 2);
        

    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int totalScore) {
        this.lives = totalScore;
    }

    public int getRoundScore() {
        return roundScore;
    }

    public void setRoundScore(int roundScore) {
        this.roundScore = roundScore;
    }
    public static void printLine()
    {
        System.out.printf("%n%n---------------------------------------------------%n%n");
    }

    public int getDisplayScore() {
        return displayScore;
    }

    public void setDisplayScore(int displayScore) {
        this.displayScore = displayScore;
    }
    
    

}
