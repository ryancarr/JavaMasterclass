/**
 * Title   : SumOddRange
 * Author  : Ryan Carr
 * Purpose : Sum all of the odd numbers in a given range
 */
public class SumOddRange
{
    /**
     * Main entry point of the program
     * @param args Unused
     */
    public static void main(String[] args)
    {
        printResults(sumOdd(1,100) == 2500);
        printResults(sumOdd(-1,100) == -1);
        printResults(sumOdd(100,100) == 0);
        printResults(sumOdd(100,-100) == -1);
        printResults(sumOdd(100,1000) == 247500);
    }

    /**
     * Checks to see if a number is odd or not
     * @param number Number greater than or equal to 0
     * @return True if the number is odd
     */
    public static boolean isOdd(int number)
    {
        boolean result;

        if(number <= 0 || number % 2 == 0)
            result = false;
        else
            result = true;

        return result;
    }

    /**
     * Sum all of the odd numbers in the range
     * @param start Start of the range
     * @param end End of the range
     * @return -1 if an error occurred
     */
    public static int sumOdd(int start, int end)
    {
        int sum = 0;

        if((start < 1 || end < 1) || start > end)
            return -1;

        for(;start <= end; start++)
        {
            if(isOdd(start))
                sum += start;
        }

        return sum;
    }

    /**
     * Print results of a test
     * @param result Result of test
     */
    public static void printResults(boolean result)
    {
        if(result)
            System.out.println("Test passed!");
        else
            System.out.println("Test failed!");
    }
}