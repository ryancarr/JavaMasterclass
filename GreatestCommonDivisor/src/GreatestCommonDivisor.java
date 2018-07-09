/**
 * Title   : GreatestCommonDivisor
 * Author  : Ryan Carr
 * Purpose : Calculate the greatest common divisor of two numbers
 */
public class GreatestCommonDivisor
{
    // Minimum acceptable input for getGreatestCommonDivisor
    private static final int MIN = 10;

    /**
     * Main entry point for program
     * @param args Unused
     */
    public static void main(String[] args)
    {
        printResults(getGreatestCommonDivisor(12,30) == 6);
        printResults(getGreatestCommonDivisor(25,15) == 5);
        printResults(getGreatestCommonDivisor(9,188) == -1);
        printResults(getGreatestCommonDivisor(81,153) == 9);
        printResults(getGreatestCommonDivisor(10,35) == 5);
    }

    /**
     * Calculate the greatest common divisor of two numbers
     * @param first First number to analyze
     * @param second Second number to analyze
     * @return GCD of the two numbers -1 if out of bounds or no common divisors found
     */
    public static int getGreatestCommonDivisor(int first, int second)
    {
        int result = -1;
        int minimum = 0;

        if(MIN <= first && MIN <= second)
        {
            if(first < second)
                minimum = first;
            else
                minimum = second;

            // By starting at the largest possible GCD we can reduce loop steps
            for(int i = minimum; i > 0;i--)
            {
                if(first % i == 0 && second % i == 0)
                {
                    result = i;
                    break;
                }
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