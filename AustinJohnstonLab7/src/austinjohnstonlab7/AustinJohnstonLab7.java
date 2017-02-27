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

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joha0033
 */
public class AustinJohnstonLab7 {

    /**
     * @param args the command line arguments
     */
    //creating objects
    public static void main(String[] args) {
        Chick chick = new Chick("chick", "tweet");
        Cow cow = new Cow("cow", "moo");
        Duck duck = new Duck("duck", "quack");
        Goose goose = new Goose("goose", "honk");
        Horse horse = new Horse("horse", "nay");
        Pig pig = new Pig("pig", "oink");
        PinkCow pinkCow = new PinkCow("pink cow", "moo");
        UNFGoose schoolGoose = new UNFGoose("UNF goose", "Honk");

//creating an arrayList
        ArrayList<Animal> animalsArray = new ArrayList<>();
//adding objects to the arrayList
        animalsArray.add(chick);
        animalsArray.add(cow);
        animalsArray.add(duck);
        animalsArray.add(goose);
        animalsArray.add(horse);
        animalsArray.add(pig);
        animalsArray.add(pinkCow);
        animalsArray.add(schoolGoose);

        System.out.printf("Down on the farm! Lets see what we have!%n");

        next();
        
        

        //enhanced for loop to cycle through array
        for (Animal a : animalsArray)
          {
                    System.out.printf("%nOld McDonald had a farm, ei-ei-oh,%n"
                    + "And on his farm he had a %s, ei-ei-oh.%n"
                    + "With a %s %s here and a %s %s there,%n"
                    + "here a %s, there a %s, everywhere a %s %s.%n"
                    + "Old McDonald had a farm, ei-ei-oh."
                    + "%n", a.getType(), a.speak(), a.speak(), a.speak(), a.speak(), a.speak(), a.speak(), a.speak(), a.speak());
        }
              
            
        System.out.printf("%nThank you, come again!%n");

    }

    public static void next() {
        Scanner enter = new Scanner(System.in);

        System.out.printf("%nPress enter to see.%n%n%n");

        enter.nextLine();
    }
    


}
