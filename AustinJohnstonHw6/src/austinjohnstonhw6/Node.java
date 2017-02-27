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

/**
 *
 * @author joha0033
 */

public class Node {
   int value;
   Node next;
   Node front;

   public Node(int value) {
      this.value = value;
   }

   public Node getNext( ) {
       
       
      return next;
   }

   public int getValue( ) {
      return value;
   }

   public void setNext(Node node) {
      next = node;
   }
}

