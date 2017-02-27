
package austinjohnstonhw9;


/**
 * Provides a Binary Tree for use in interpreting Morse Code.
 */
public class MorseCodeDecoder {
    private static Node root;
    private static int index;
    
    // Characters used to populate the Binary Tree
    private static String[] morseCode = new String[] {
        "5","4","H"," ","3","V","S"," "," ","F"," ","2"," ","U","I"," ",
        " ","L",".","!","?","R",",","'","P"," ","1","J","W","A","E","6",
        " ","B"," "," ","X","D"," "," ","C"," "," ","Y","K","N","7"," ",
        "Z"," "," ","Q","G","8"," "," ","9","0"," ","O","M","T"," "};
    
    /**
     * Generates the Binary Tree for use in interpreting Morse Code.
     * @return the root of the Binary Tree.
     */
    public static Node getRoot() {
        root = new Node();
        loadTree(root, 0);
        return root;
    }

    /**
     * Recursively stores the characters of the morseCode array in the appropriate location in the Binary Tree.
     * @param currentNode The currentNode within the Binary Tree.
     * @param level The current level the currentNode is on within the Binary Tree.
     */
    private static void loadTree(Node currentNode, int level) {
        if(level < 5) {
            currentNode.setLeftChild(new Node());
            loadTree(currentNode.getLeftChild(), level + 1);
            currentNode.setRightChild(new Node());
            loadTree(currentNode.getRightChild(), level + 1);
        }
        if(index < morseCode.length) {
            currentNode.setCharacter(morseCode[index++]);
        }
    }
}