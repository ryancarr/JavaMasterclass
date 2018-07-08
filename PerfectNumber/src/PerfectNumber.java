public class PerfectNumber
{
    // Minimum acceptable value
    private static final int MIN = 1;

    /**
     * Main entry point
     * @param args Unused
     */
    public static void main(String[] args)
    {
        printResults(isPerfectNumber(6));
        printResults(isPerfectNumber(28));
        printResults(!isPerfectNumber(5));
        printResults(!isPerfectNumber(-1));
    }

    /**
     * Determines if a number is a perfect number or not
     * @param number Number to evaluate
     * @return True if perfect number or false if out of range or non perfect number
     */
    public static boolean isPerfectNumber(int number)
    {
        boolean result;

        if(MIN <= number)
        {
            int sum = 0;

            for(int i = 1; i < number;i++)
            {
                int temp = number % i;

                if(temp == 0)
                    sum += i;
            }

            result = sum == number;
        }
        else
            result = false;

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