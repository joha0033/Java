/*
 * Name: Austin Robert Johnston
 */
package austinjonstonhw8;

/*
 * Provides a set of static variables containing the words and phrases a
 * programmer needs to create the lyrics of "The 12 Weeks of Data Structures".
 * 
 * Note: Use the format Song.variable to access the static variables.
 * Example: Song.gifts[2];
 *          Song.MAX_DAYS;
 *          Song.verse;
 * 
 * @author Jim Littleton (c) 2016
 */
class Song {

    public static final int MAX_DAYS = 12; // The number of days

    // List of ordinal numbers (days[0] is an empty String)
    public static String[] days = new String[]{
        "", "first", "second", "third", "fourth", "fifth", "sixth",
        "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
    };

    // List of lessons (days[0] is an empty String)
    public static String[] lessons = new String[]{
        "", "the root of a binary tree", "nested loops", "exceptions", "interfaces",
        "empty strings", "files a-reading", "cards a-dealing", "stacks a-popping",
        "queues inserting", "nodes a-linking", "pointers pointing", "hash methods hashing"
    };

    // List of cardinal numbers (days[0] and days[1] are empty Strings)
    public static String[] numbers = new String[]{
        "", "", "two", "three", "four", "five", "six",
        "seven", "eight", "nine", "ten", "eleven", "twelve"
    };

    // The main verse of the song
    public static String verse = "In the %s week of Data Structures in a program I did see,\n";
}
