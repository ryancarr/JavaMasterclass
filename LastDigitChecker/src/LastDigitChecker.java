/**
 * Title   : LastDigitChecker
 * Author  : Ryan Carr
 * Purpose : Evaluate the last digit in three numbers to see if any two are  the same
 */
public class LastDigitChecker
{
    /**
     * Main entry point of program
     * @param args Unused
     */
    public static void main(String[] args)
    {
        printResults(hasSameLastDigit(41,22,71));
        printResults(hasSameLastDigit(23,32,42));
        printResults(!hasSameLastDigit(9,99,999));
        printResults(hasSameLastDigit(12,22,72));
    }

    /**
     * Check the last digit of three numbers for at least one matching digit
     * @param first First number to evaluate
     * @param second Second number to evaluate
     * @param third Third number to evaluate
     * @return False if number out of bounds or no last digits in common
     */
    public static boolean hasSameLastDigit(int first, int second, int third)
    {
        boolean result = false;
        final int MIN = 10;
        final int MAX = 1000;

        if((MIN <= first && first <= MAX) &&
            (MIN <= second && second <= MAX) &&
            (MIN <= third && third <= MAX))
        {
            int firstLast = first % 10;
            int secondLast = second % 10;
            int thirdLast = third % 10;

            if((firstLast == secondLast || firstLast == thirdLast) ||
                (secondLast == thirdLast))
            {
                result = true;
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
