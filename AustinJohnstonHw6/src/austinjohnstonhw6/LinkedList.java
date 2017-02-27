/*
 * Name: Austin Robert Johnston

 * Course: COP2551

 * Semester: Fall 2015

 * I pledge on my honor that this work is that of my own. 
 * If I’m complete to be in violation of the Academic Integrity
 * policies as outlined in the course syllabus, I understand
 * I will receive an unforgiveable F for this course regardless 
 * of withdrawal status.

 */
package austinjohnstonhw6;

import java.util.Random;

/**
 *
 * @author joha0033
 */
public class LinkedList {

    // Linked list variable
    private Node front;
    private Node foundNum;
    Random traverseNums = new Random();

    // Insert at beginning of list
    public void insert(int value) {
        Node temp = new Node(value);

        if (front == null) {
            front = temp;
        } else {
            temp.setNext(front);
        }
        front = temp;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        // The list can never be full
        return false;
    }

    // Remove from beginning of list
    public int remove() {
        Node temp = front;

        front = front.getNext();
        return temp.getValue();

    }

    public void delete(int value) {
        Node temp = findNode(value);

        if (temp.getNext() != null) {
            temp.setNext(temp.getNext().getNext());
        }
    }

    public Node findNode(int value) {
        Node temp = front;
        boolean found = false;

        while (temp != null && !found) {
            // Check the node
            if (temp.getValue() == value) {
                found = true;
            } else {

                temp = temp.getNext(); // Go to the next node (can’t go backwards)

            }
        }
        return temp;
    }

    @Override
    public String toString() {
        String retStr = "Initial values stored in the linked-list\n";

        Node current = front;
        while (current != null) {
            retStr += current.getValue() + " ";
            current = current.getNext();

        }
        System.out.printf("%n");

        return retStr;
    }

    public void traverse(int randomValue)
    {
        Node temp = front;
        
        for (int x = 0; x!= randomValue+1; x++)
        {
            if(x==randomValue)
            {
             int delete = temp.value;
             delete(delete);
            System.out.printf("%n%s %n", delete);
            }
            temp.getNext().getNext();
            
        }
    }
}

//    public Node findNode2(int position) {
//        Node temp = front;
//        boolean found = false;
//        int counter=0;
//        while (!found && counter <=20) {
//            
//            // Check the position
//            if (counter == position) {
//                Node target = temp.getNext();
//                
//                delete();
//                System.out.printf("target: %s%n", target);
//                found = true;
//                
//
//            } else {
//                counter++;
//                System.out.printf("counter: %s%n", counter);
//               temp.getNext();
//                if(temp.getNext()==null)
//                {
//                    temp = front;
//                }
//                else
//                {
//                temp = temp.getNext(); // Go to the next node (can’t go backwards)
//                }
//                
//            }
//            
//        }
//
//        return temp;
//    }
//    public Node travNode(int value) {
//        Node temp = front;
//        if (front != null) {
//            for (int x = 0; x < value; x--) {
//                temp = temp.getNext();
//            }
//        }
//        return temp;
//    }
//public int traverse(int rand) {
//            int counter = 0;
//            int nodesLeft = 10;
//            Node current = front;
//            Node previous = null;
//            boolean done = false;
//            for (int x = 0; rand != x; x++) {
//                  
//                  previous = current;
//                  current = current.next;
//                  System.out.printf("previous: %s%n", previous.value);
//                  counter++;
//                  if (counter%10==0)
//                  {
//                      counter =0;
//                       current = front;
//                  }
//                  
//            }
//            done = true;
//            if (done == true)
//                  {
//                      nodesLeft--;
//                      
//                      System.out.printf("Moved %s times, removed %s from the list "
//                              + "leaving %s nodes%n",rand, delete(previous.value), nodesLeft);
//                      current = front;
//                  }
//            
//            return counter;
//}
//    public int traverse(int ranNum) {
//        int sum = 0;
//        Node current = front;
//        Node previous = null;
//        for (int x = 0; x != ranNum + 1; x++) {
//            if (current != null) {
//
//                sum += current.value;
//                previous = current;
//                current = current.next;
//
//                if (x == ranNum) {
//                    int removed = remove();
//                    System.out.printf("removed: %s%n", removed);
//                }
////                System.out.printf("previous: %s%ncurrent: %s%n", previous.value, current.value);
////
////            } else {
////                current = front;
////                int removed = remove();
////                System.out.printf("removed: %s%n", removed);
//            }
//        }
//
//        return sum;
//    }

