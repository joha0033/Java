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

import java.security.SecureRandom;

/**
 *
 * @author joha0033
 */
public class Dice 
{
    private int value;
    private int numberOfSides;

    public Dice(int numberOfSides) 
    {
        this.numberOfSides = numberOfSides;
    }
    
    public void roll()
    {
        SecureRandom randomNum = new SecureRandom();
        
        value = 1+randomNum.nextInt(numberOfSides);
        System.out.printf("%d%n", value);
        
    }

    public int getValue() {
        return value;
    }
    
    


   
    
}
