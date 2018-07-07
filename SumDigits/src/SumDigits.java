/**
 * Title   : SumDigits
 * Author  : Ryan Carr
 * Purpose : Java Masterclass Digit Sum Challenge
 */
public class SumDigits
{
    /**
     * Main entry point for program
     * @param args Unused
     */
    public static void main(String[] args)
    {
        printResults(sumDigits(125) == 8);
        printResults(sumDigits(9) == -1);
        printResults(sumDigits(12) == 3);
        printResults(sumDigits(100) == 1);
        printResults(sumDigits(44) == 8);
    }

    /**
     * Sums all the digits of a number
     * @param number Non negative number greater than 9
     * @return Sum of all digits
     */
    public static int sumDigits(int number)
    {
        int sum = 0;

        if(number < 10)
            sum = -1;
        else
        {
            while(number > 0)
            {
                sum += number % 10;
                number /= 10;
            }
        }

        return sum;
    }
    /**
     * Prints results of a test
     * @param result Value to be printed
     */
    public static void printResults(boolean result)
    {
        if(result)
            System.out.println("Test passed!");
        else
            System.out.println("Test failed!");
    }
}