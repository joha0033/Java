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
package austinjohnstonhw6;

import java.util.Random;

/**
 *
 * @author joha0033
 * 
 * Driver Class hold the bulk of the operations that are necessary
 * for the program to run properly
 */
public class Driver {

    //random numbers to use in methods

    Random linkNums = new Random();
    Random traverseNums = new Random();
    LinkedList sausageLink = new LinkedList();
    Node front;

    //will execute crucial methods for the program to run properly
    public void Execute() {
    
    
        fillList(10);
        sausageLink.traverse(3);
       
        
       

    }


    /*/
     *
     * Method to fill linked list with 25 random numbers
     *
     /*/
   public void fillList(int size)
    {
        
        System.out.printf("%n");
        
        for (int count = 0; count<10; count++)
            
        {
            int x = linkNums.nextInt(25)+1;
             sausageLink.insert(count);
             
             //remove method to display items placed, will be removed.
             
             
        }
        
        System.out.printf("%s ", sausageLink.toString());
        
    }

    /*/
     *
     * Method to traverse linked list n number of times.
     *
     /*/
     public void traverse(int randomValue, int nodes)//, int randomNumber
     {
         int value = 0;
         
         
         
         System.out.printf("%nMoved %s times, and removed value %s, "
                 + "with %s nodes left%n", randomValue, value, nodes);
         sausageLink.remove();
         
         
         
//         int counter = 0;
//         Node temp = front;
//         while(position!=counter)
//         {
//             System.out.printf("%n%s%n", sausageLink.toString());
//             int removed = sausageLink.remove();
//             System.out.printf("%s%n", sausageLink.toString());
//             sausageLink.insert(removed);
//             System.out.printf("%s%n", sausageLink.toString());
//             counter++;
//         }
//         sausageLink.delete(counter);
         
         
         
         
     }

   

}
