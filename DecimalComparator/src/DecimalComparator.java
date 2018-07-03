/**
 * Title   : DecimalComparitor
 * Author  : Ryan
 * Purpose : Compare two doubles and determine if they are equivalent up to three decimal places
 *           The Complete Java Masterclass Code Exercise 4
 */
public class DecimalComparator
{
    public static void main(String[] args)
    {
        printResults(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        printResults(areEqualByThreeDecimalPlaces(0.0, 0.0));
        printResults(areEqualByThreeDecimalPlaces(3.175,3.176));
        printResults(areEqualByThreeDecimalPlaces(3.0,3.0));
    }

    /**
     * Calculate if two doubles are equivalent up to three decimal places
     * @param firstValue First value to compare
     * @param secondValue Second value to compare
     * @return  True if the values are equivalent up to three decimal places
     */
    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue)
    {
        boolean result = false;
        double firstNumber = (int)(firstValue * 1000) / 1000.0;
        double secondNumber = (int)(secondValue * 1000) / 1000.0;

        if(firstNumber == secondNumber)
            result = true;

        return result;
    }

    /**
     * Provides easy to understand output to the console
     * @param result Results from areEqualByThreeDecimalPlaces
     */
    private static void printResults(boolean result)
    {
        if(result)
            System.out.println("The numbers are equivalent up to 3 decimal places.");
        else
            System.out.println("The numbers are not equivalent up to 3 decimal places.");
    }
}