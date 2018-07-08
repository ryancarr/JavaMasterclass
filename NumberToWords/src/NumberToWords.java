/**
 * Title   : NumberToWords
 * Author  : Ryan Carr
 * Purpose : Convert a number to words representing each digit
 */
public class NumberToWords
{
    // Minimum acceptable value
    private static final int MIN = 0;

    /**
     * Main entry point
     * @param args Unused
     */
    public static void main(String[] args)
    {
        System.out.println("Testing getDigitCount()");
        System.out.println("-----------------------");
        printResults(getDigitCount(0) == 1);
        printResults(getDigitCount(123) == 3);
        printResults(getDigitCount(-12) == -1);
        printResults(getDigitCount(5200) == 4);
        System.out.println("-----------------------");
    }

    /**
     * Get the number of digits composing a given number
     * @param number Number to analyze
     * @return Number of digits or -1 if negative number
     */
    public static int getDigitCount(int number)
    {
        int result = 0;

        if(MIN <= number)
        {
            if(number != 0)
            {
                while(number > MIN)
                {
                    number /= 10;
                    result++;
                }
            }
            else
                result = 1;
        }
        else
            result = -1;

        return result;
    }

    /**
     * Print results of a test
     * @param result Result to be analyzed
     */
    public static void printResults(boolean result)
    {
        if(result)
            System.out.println("Test Passed!");
        else
            System.out.println("Test Failed!");
    }
}