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
public abstract class Animal implements MakesNoise {
    
   private String animalName;
     private String soundToMake;

     public Animal(String animalName, String soundToMake)
     {
          /**
           * standard constructor
           */
          this.animalName = animalName;
          this.soundToMake = soundToMake;
     }

     /**
      * @return the animalName
      */
     public String getAnimalName()
     {
          return animalName;
     }

     /**
      * @param animalName the animalName to set
      */
     public void setAnimalName(String animalName)
     {
          this.animalName = animalName;
     }

     /**
      * @return the soundToMake
      */
     public String getSoundToMake()
     {
          return soundToMake;
     }

     /**
      * @param soundToMake the soundToMake to set
      */
     public void setSoundToMake(String soundToMake)
     {
          this.soundToMake = soundToMake;
     }

}
