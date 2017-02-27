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
package austinjohnstonlab7;

import java.security.SecureRandom;

/**
 *
 * @author joha0033
 */
public class UNFGoose extends Goose implements MakesNoise
{
//Animal constructor being implemented
    public UNFGoose(String animalName, String soundToMake)
    {
        super(animalName, soundToMake);
    }
//overrides method in super class
     @Override
    public String speak() {
        SecureRandom pickSound = new SecureRandom();
        
        int gooseSays = pickSound.nextInt(4)+1;
        
        switch (gooseSays) {
            case 1:
                super.setSoundToMake("honk");
                break;
            case 2:
                super.setSoundToMake("*poot*");
                break;
            case 3:
                super.setSoundToMake("SWOOP!");
                break;
            case 4:
                super.setSoundToMake("SWOOP!");
                break;
        }
        return super.speak();
        
    }

    
}
