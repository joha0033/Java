package austinjohnstonhw9;

/**
 * Provides the methods for a linked list of nodes.
 */
public class Node implements Linkable {
   
    private Node leftChild; // Pointer to the left child node
    private Node rightChild; // Pointer to the right child node
    private String value; // The value stored in the node
    
   
    public Node getLeftChild() {
        return leftChild;
    }
    
    public Node getRightChild() {
        return rightChild;
    }
    
    public void setLeftChild(Node node) {
        leftChild = node;
    }
    
    public void setRightChild(Node node) {
        rightChild = node;
    }

    public String getCharacter() {
        return value;
    }

    public void setCharacter(String s) {
       this.value = s;
    }
    
    @Override
    public String toString() {
        return value;
    }
}

