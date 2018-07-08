/**
 * Title   : SharedDigit
 * Author  : Ryan Carr
 * Purpose : Evaluate two numbers to see if they have any digits in common
 */
public class SharedDigit
{
    /**
     * Main entry point of program
     * @param args Unused
     */
    public static void main(String[] args)
    {
        printResults(hasSharedDigit(12,23));
        printResults(!hasSharedDigit(9,99));
        printResults(hasSharedDigit(15,55));
        printResults(!hasSharedDigit(10,100));
        printResults(hasSharedDigit(10,11));
    }

    /**
     * Evaluate two numbers and determine if they have any digits in common
     * @param first First number to evaluate
     * @param second Second number to evaluate
     * @return True if any digits are common to both numbers or false for Invalid Values
     */
    public static boolean hasSharedDigit(int first, int second)
    {
        boolean result = false;

        if((10 > first || first > 99) || (10 > second || second > 99))
            result = false;
        else
        {
            int lastDigit = first % 10;
            int firstDigit = first / 10 % 10;

            while(second > 0)
            {
                if((firstDigit == second % 10) || (lastDigit == second % 10))
                {
                    result = true;
                    break;
                }
                else
                    second /= 10;
            }
        }

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
