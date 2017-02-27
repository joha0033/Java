package austinjohnstonhw9;


public interface Linkable
{
     /**
     * Returns the String character stored in the current node.
     * @return the String character stored in the current node.
     */
    public String getCharacter();
    
    /**
     * Returns the current node's left child node. 
     * @return the current node's left child node.
     */
    public Node getLeftChild();
    
    /**
     * Returns the current node's right child node. 
     * @return the current node's right child node.
     */
    public Node getRightChild();
    
    /**
     * Stores the String character in the current node.
     * @param character The character to store in the current node.
     */
    public void setCharacter(String character);
    
    /**
     * Sets the current node's left child node.
     * @param node The current node.
     */
    public void setLeftChild(Node node);
    
    /**
     * Sets the current node's right child node.
     * @param node The current node.
     */
    public void setRightChild(Node node);
}
