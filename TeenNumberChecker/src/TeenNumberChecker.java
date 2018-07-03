/**
 * title   : TeenNumberChecker
 * Author  : Ryan
 * Purpose : Check three integers and determine if one or more are between 13 and 19 (inclusive)
 *           The complete Java Masterclass Coding Exercise 6
 */
public class TeenNumberChecker
{
    public static void main(String[] args)
    {
        printResults(hasTeen(9,99,19));
        printResults(hasTeen(23,15,42));
        printResults(hasTeen(22,23,34));
    }

    /**
     * Accepts three integers and determines if any of the numbers are between 13 and 19
     * @param firstValue    First number to evaluate
     * @param secondValue   Second number to evaluate
     * @param thirdValue    Third number to evaluate
     * @return  True if one or more of the numbers are between 13 and 19
     */
    public static boolean hasTeen(int firstValue, int secondValue, int thirdValue)
    {
        boolean result = false;

        if((13 <= firstValue && firstValue <= 19) ||
                (13 <= secondValue && secondValue <= 19) ||
                (13 <= thirdValue && thirdValue <= 19))
            result = true;

        return result;
    }

    /**
     * Output the results to the console showing the result of the test.
     * @param result    Determines if the test was successful or not.
     */
    private static void printResults(boolean result)
    {
        if(result)
            System.out.println("One of the numbers was in the teens.");
        else
            System.out.println("None of the numbers were in the teens.");
    }
}