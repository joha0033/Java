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

/**
 *
 * @author joha0033
 */
public class Horse extends Animal implements MakesNoise
{
//Animal constructor being implemented
    public Horse(String animalName, String soundToMake)
    {
        super(animalName, soundToMake);
    }
//overrides method in super class
     @Override
     public String speak()
     {
          return this.getSoundToMake();
     }
//overrides method in super class
     @Override
     public String getType()
     {
          return this.getAnimalName();
     }
    
    
}
