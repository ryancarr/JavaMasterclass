/**
 * Title   : LeapYear
 * Author  : Ryan
 * Purpose : Calculate whether or not a year is a leap year
 *          This is The Complete Java Masterclass Code Challenge #3
 */
public class Main
{
    public static void main(String[] args)
    {
        printResults(-1600, isLeapyear(-1600));
        printResults(1600, isLeapyear(1600));
        printResults(2017, isLeapyear(2017));
        printResults(2000, isLeapyear(2000));
        printResults(1800, isLeapyear(1800));
    }

    /**
     * Determine if the given year is a leap year or not
     * @param year  Year as an integer between 1 and 9999
     * @return True if the given year is a leap year
     */
    public static boolean isLeapyear(int year)
    {
        // Calculate if a given year is a leap year
        // Acceptable values are from 1 - 9999
        // Out of bounds returns false
        boolean leap = false;
        int minYear = 1;
        int maxYear = 9999;

        if(year < minYear || year > maxYear)
        {
            leap = false;
        }
        else if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        {
            // Calculate if year is leap year or not
            // Leap years are divisible by 4, not divisible by 100
            // but also divisible by 400
            leap = true;
        }

        return leap;
    }

    /**
     * Provides output to the console showing results of each test
     * @param year  What year is being tested
     * @param leap  User friendly output for test results
     */
    private static void printResults(int year, boolean leap)
    {
        if(leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}