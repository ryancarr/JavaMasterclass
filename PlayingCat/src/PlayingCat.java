/**
 * Title   : PlayingCat
 * Author  : Ryan Carr
 * Purpose : Determine if the time of year and temp is appropriate for the cat to play
 */
public class PlayingCat
{
    /**
     * Main entry point
     * @param args Not used
     */
    public static void main(String[] args)
    {
        printResults(isCatPlaying(true,10));   // false
        printResults(isCatPlaying(false, 36)); // false
        printResults(isCatPlaying(false, 35)); // false
    }

    /**
     * Determine if the cat will play or not
     * @param summer Is it summer
     * @param temperature What is the current temperature
     * @return
     */
    public static boolean isCatPlaying(boolean summer, int temperature)
    {
        // Temp between 25 and 35 (inclusive) during non summer
        // Temp between 25 and 45 (inclusive) during summer
        final int MIN = 25;
        int MAX = 35;
        boolean result;

        if(summer)
            MAX += 10;

        if(MIN <= temperature && temperature <= MAX)
            result = true;
        else result = false;

        return result;
    }

    /**
     * Print the results of the isCatPlaying
     * @param result Result of isCatPlaying
     */
    public static void printResults(boolean result)
    {
        if(result)
            System.out.println("Cat is playing!");
        else
            System.out.println("Cat is not playing");
    }
}