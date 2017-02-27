/*
 
 */
package austinjohnstonhw9;

import java.io.*;

/**
 * Translates Morse Code into plain text.
 *
 * Morse Code uses only two characters - a dot "." and a dash "-". Each sequence
 of Morse Code characters represents a SINGLE plain-text character. For
 example, the following series of Morse Code character sequences represents
 the plain-text phrase "COP3538": -.-. --- .--. ...-- ..... ...-- ---..

 Each sequence of Morse Code characters is separated by a pause, which is
 represented by a space " " in the morseInput data file for this homework.
 */
public class Driver {

    
    Node root;
    Node current;
    String temp;
// Represents the root of a Binary Tree

    /**
     * Controls the operation of the program.
     *
     * Notes: 1. First, generate the Binary Tree using the
 MorseCodeDecoder.getRoot() method. 2. Then, read in the morseInput data file.
     */
    public void execute() {
        root = MorseCodeDecoder.getRoot();
        readMorseFile("MorseCode.Input.txt");
    }

    /**
     * Searches the Binary Tree for the character associated with the specified
     * Morse Code sequence.
     *
     * Notes: 1. Break the Morse Code sequence into individual bits (dots "."
     * and dashes "-"). 2. If the next bit is a dot ".", follow the current
     * node's left-child path. 3. If the next bit is a dash "-", follow the
     * current node's right-child path. 4. The node you arrive at after
     * following the dots and dashes contains the correct character (i.e., A, B,
     * etc.).
     *
     * @param input The String containing the Morse Code sequence.
     * @return the character associated with the specified Morse Code sequence.
     */
    private String getCharacter(String input) {
        char[] charIn = input.toCharArray();
        current = root;
        for (int num = 0; num < charIn.length; num++) {
            if (charIn[num] == '.') {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
            temp = current.getCharacter();
        }
        return temp;
    }

    /**
     * Converts a series of Morse Code sequences into its plain-text
     * representation.
     *
     * Notes: 1. Use a StringBuilder to assemble the individual characters into
     * a message. 2. Split the series of Morse Code sequences into individual
     * sequences (the sequences are delimited by spaces). 3. Pass each sequence
     * to the getCharacter method to get its plain-text character. 4. Return the
     * contents of the StringBuilder, which contains the plain-text
     * representation of the series of Morse Code sequences.
     *
     * @param message The series of Morse Code sequences.
     * @return the plain-text representation of the series of Morse Code
     * sequences.
     */
    public String interpretMessage(String message) {

        String result = "";

        StringBuilder decode;
        decode = new StringBuilder();
        String[] splitMessage = message.split(" ");
        String nodeChar;

        for (String s : splitMessage) {
            nodeChar = getCharacter(s);
            decode.append(nodeChar);
        }

        result = decode.toString();

        return result;
    }

    /**
     * Reads the specified morseInput data file into the program.
     *
     * Notes: 1. Each record from the morseInput data file should be passed to the
 interpretMessage method. 2. Each record represents a series of Morse Code
 sequences.
     *
     * @param filename The morseInput data file to read into the program.
     */
    private void readMorseFile(String file) {
        
        String morseInput;
        String decodedElement;

        // The FileReader object is WRAPPED in the BufferedReader object
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            // Read a line from the file and assign it to the variable INPUT
            // Stop reading the file when no more lines exist (indicated by NULL)
            while ((morseInput = reader.readLine()) != null) {
                
                decodedElement = interpretMessage(morseInput);
                
                System.out.println(decodedElement);
                
            }
            
        } catch (FileNotFoundException fnfe) {
            System.out.println("The specified filename was not found.");
        } catch (IOException ioe) {
            System.out.println("An error occurred while reading the file.");
        } catch (Exception ex) { // Not required, but a good practice
            System.out.println("An error occurred while reading the file.");
        }
    }
}
