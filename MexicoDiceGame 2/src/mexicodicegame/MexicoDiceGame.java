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

package mexicodicegame;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;
/**
 *
 * @author joha0033
 */
public class MexicoDiceGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
    {
        
        Sequencer musicPlayer = MidiSystem.getSequencer();
        InputStream midiFileStream = new BufferedInputStream(new FileInputStream(new File("tequila.mid")));
        musicPlayer.open();
        musicPlayer.setSequence(midiFileStream);
        musicPlayer.start();
        System.out.printf(" /\\' .\\    _____\n" +
                          "/: \\___\\  / .  /\\\n" +
                                 "\\' / . / /____/..\\\n" +
                                 " \\/___/  \\'  '\\  /\n" +
"          \\'__'\\/%n");
        Game mexico = new Game();
        mexico.play();
        
        musicPlayer.close();
        
    }
    
}
