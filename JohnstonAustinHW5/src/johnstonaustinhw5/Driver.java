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
package johnstonaustinhw5;

import java.util.Random;

/**
 *
 * @author joha0033
 */
public class Driver {
    //size of Stacks
    int size = 25;

    //new instances of Stacks
    Stack mainStack = new Stack(size);
    Stack tempStack = new Stack(size);

    /**
     * contains all functions of the program
     */
    public void execute()
    {
        //inserts random values while the stack is not! full
        while (!mainStack.isFull()){
          int tester = (int) randIntGen(1, 999);
          mainStack.push(tester);
          }
        //once the stack is full, while breaks

        //while the main stack is not empty, moves main stack pop to temp stack, and sorts
          while(!mainStack.isEmpty()) {//replace
          int tmp = (int) mainStack.pop();//replace
          while(!tempStack.isEmpty() && tempStack.peek() > tmp) {
                    mainStack.push(tempStack.pop());//replace
               }
          tempStack.push(tmp);
          }
          //displays stack
     tempStack.displayStack(size);
    }

    public int randIntGen(int min, int max) {
    // Usually this can be a field rather than a method variable
    Random rand = new Random();
    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum = rand.nextInt((max - min) + 1) + min;
    return randomNum-1;
    }
}
