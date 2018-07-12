/**
 * Title   : LargestPrime
 * Author  : Ryan Carr
 * Purpose : Calculate the largest prime factor of a given number
 */
public class LargestPrime
{
    /**
     * Main entry point of program
     * @param args Unused
     */
    public static void main(String[] args)
    {
        printResults(getLargestPrime(21) == 7);
        printResults(getLargestPrime(217) == 31);
        printResults(getLargestPrime(0) == -1);
        printResults(getLargestPrime(45) == 5);
        printResults(getLargestPrime(-1) == -1);
        printResults(getLargestPrime(2) == 2);
        printResults(getLargestPrime(16) == 2);
    }

    /**
     * Gets the largest prime factor of the given number
     * @param number Number to be analyzed
     * @return Largest prime factor or -1 if no prime factors exist
     */
    public static int getLargestPrime(int number)
    {
        int result = -1;
        int largestPrime = 2;

        if(number > 1 && number % 2 == 0)
            result = 2;

        while(number > largestPrime)
        {
            if(number % largestPrime == 0)
            {
                number /= largestPrime;
                largestPrime = 2;
            }
            else
                largestPrime++;
        }

        if(largestPrime != 2)
            result = largestPrime;

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