/**
 * Title   : FirstLastDigitSum
 * Author  : Ryan Carr
 * Purpose : Sum the first and last digits of a number
 */
public class FirstLastDigitSum
{
    /**
     * Main entry point of program
     * @param args Unused
     */
    public static void main(String[] args)
    {
        printResults(sumFirstAndLastDigit(10) == 1);
        printResults(sumFirstAndLastDigit(252) == 4);
        printResults(sumFirstAndLastDigit(-11) == -1);
        printResults(sumFirstAndLastDigit(257) == 9);
        printResults(sumFirstAndLastDigit(0) == 0);
        printResults(sumFirstAndLastDigit(5) == 10);
        printResults(sumFirstAndLastDigit(-10) == -1);
    }

    /**
     * Sum the first and last digits of a positive number
     * @param number Number to be evaluated
     * @return Sum of digits or -1 if Invalid Value
     */
    public static int sumFirstAndLastDigit(int number)
    {
        int result = 0;

        if(number > -1)
        {
            int lastDigit = number % 10;
            int firstDigit = 0;

            while(number > 9)
            {
                number /= 10;
            }

            firstDigit = number % 10;

            result = firstDigit + lastDigit;
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