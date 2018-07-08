/**
 * Title   : FactorPrinter
 * Author  : Ryan Carr
 * Purpose : Prints all factors of a given number
 */
public class FactorPrinter
{
    // Minimum acceptable value
    private static final int MIN = 1;

    /**
     * Main entry point
     * @param args Unused
     */
    public static void main(String[] args)
    {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    /**
     * Prints all of the factors of a number to screen
     * @param number Number to analyze
     */
    public static void printFactors(int number)
    {
        String result = "";

        if(number >= MIN)
        {
            for(int i = 1; i <= number;i++)
            {
                int temp = number % i;

                if(temp == 0)
                    result = result + i + " ";
            }
        }
        else
            result = "Invalid Value";

        System.out.println(result);
    }
}