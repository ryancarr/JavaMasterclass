/**
 *
 */
public class NumberOfDaysInMonth
{
    /**
     * Main entry of program
     * @param args Unused
     */
    public static void main(String[] args)
    {
        printResults(getDaysInMonth(1,2020));
        printResults(getDaysInMonth(2,2020));
        printResults(getDaysInMonth(2,2018));
        printResults(getDaysInMonth(-1,2020));
        printResults(getDaysInMonth(1,-2020));
    }

    /**
     * Determine if the given year is a leap year or not
     * @param year  Year as an integer between 1 and 9999
     * @return True if the given year is a leap year
     */
    public static boolean isLeapYear(int year)
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
     * Gets the number of days in a month during a certain year
     * @param month Month to analyze
     * @param year Year to analyze
     * @return
     */
    public static int getDaysInMonth(int month, int year)
    {
        int numOfDays;

        if((1 > month || month > 12) || (1 > year || year > 9999))
            numOfDays = -1;
        else
        {
            switch(month)
            {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    numOfDays = 31;
                    break;
                case 2:
                    if(isLeapYear(year))
                        numOfDays = 29;
                    else
                        numOfDays = 28;
                        break;
                default:
                    numOfDays = 30;
                    break;
            }
        }

        return numOfDays;
    }

    /**
     * Print the results to console
     * @param result Result to be printed
     */
    public static void printResults(int result)
    {
        System.out.println(result);
    }
}