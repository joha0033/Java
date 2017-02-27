/*
 * Name: Austin Robert Johnston
 */
package austinjonstonhw8;

/**
 * Display the lyrics of the song, "The 12 Weeks of Data Structures" using recursive methods.
 */
class Driver {

    /**
     * Controls the operation of the program.
     */
    public void execute() {
        //calls nextDay method with specific seed(1)
        nextDay(1);
    }
    /**
     * Display the lesson seen on the specified day.
     * @param day The specified day the lesson was seen.
     */
    private void nextLesson(int day) {
        //if the day value is less than 14, it is incremented
        //and nextLesson called with specified parameter
        while (day <= 13) {
            day++;
            nextLesson(day);
        }
    }

   /**
     * Display the next verse in the song for the specified day.
     * @param day The specified day of the song.
     */
    private void nextDay(int day) {
        //creating a temporary value for printing lessons
        int dayTemp = day;

        //if day value is less than 14
        if (day <= 13) {

            System.out.printf(Song.verse, Song.days[day]);

            //while loop to print needed lines for each day
            while (dayTemp >= 1) {
                //if temp value is equal to one, prints line without a comma
                if (dayTemp == 1) {
                    System.out.printf("%s%n", Song.lessons[dayTemp]);
                } //prints lines with day number, and comma
                else {
                    System.out.printf("%s %s,%n", Song.numbers[dayTemp], Song.lessons[dayTemp]);
                }
                //decrement the temp value
                dayTemp--;
            }
            //increments the day
            day++;
            //Blank line space
            System.out.printf("%n");
        }

        //Calls two methods while day integer is less than or equal to 12
        //recursive
        if (day <= 12) {
            nextDay(day);
            nextLesson(day);
        }

    }
}
