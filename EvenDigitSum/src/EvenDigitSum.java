/**
 * Title   : EvenDigitSum
 * Author  : Ryan Carr
 * Purpose : Add the even digits of a given number and return the result
 */
public class EvenDigitSum
{
    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
        printResults(getEvenDigitSum(123456789) == 20);
        printResults(getEvenDigitSum(252) == 4);
        printResults(getEvenDigitSum(-22) == -1);
        printResults(getEvenDigitSum(3) == 0);
    }

    /**
     * Return the sum of all the even digits in a number
     * @param number Number to evaluate
     * @return Return sum or -1 in event of an Invalid Number
     */
    public static int getEvenDigitSum(int number)
    {
        int result = 0;

        if(number < 0)
            result = -1;
        else
        {
            int lastDigit = 0;

            while(number > 0)
            {
                lastDigit = number % 10;

                if(lastDigit % 2 == 0)
                    result += lastDigit;

                number /= 10;
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
