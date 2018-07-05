/**
 * Title   : MinutesToYearsDaysCalculator
 * Author  : Ryan Carr
 * Purpose : Convert minutes to the equivalent years and days
 */
public class MinutesToYearsDaysCalculator
{
    /**
     * Main entry point for the program
     * @param args Not used
     */
    public static void main(String[] args)
    {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    /**
     * Calculate number of years and days in the number of minutes provided
     * @param minutes 0 or greater
     */
    public static void printYearsAndDays(long minutes)
    {
        // Format XX min = YY y ZZ d
        if(minutes < 0)
            System.out.println("Invalid Value");
        else
        {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;

            // Find remaining days after years has been calculated
            days = days % 365;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}