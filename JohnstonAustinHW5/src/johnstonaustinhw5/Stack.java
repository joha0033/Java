
package johnstonaustinhw5;
import java.util.*;
/**
 *
 * @author joha0033
 */
public class Stack {
    
    private int maxSize;
    private int top = -1;
    private int[] array;

    public Stack(int size) {
        maxSize = size;
        array = new int[maxSize];
    }
    
    public long peek()
    {
         return array[top];
    }

    public int pop() {
        return array[top--]; // Returns the topmost item
    }

    public void push(int item) {
        array[++top] = item; // Places item on top of the stack
    }

    public boolean isEmpty() { // Underflow operation
        return top == -1; // Test if stack is empty
    }

    public boolean isFull() { // Overflow operation
        return top == maxSize - 1; // Test if stack is full
    }
    public void displayStack(int numElem)
    {
        
        for (int f = 0; f < numElem; f++) {

            //SIMPLE formula to create rows
            System.out.format("%3d ", array[f]);
            if (f % 10 == 9) {
                System.out.printf("%n");
                
            }
        
     
        }
    }
}

   

