/**
 * Title   : IntEqualityPrinter
 * Author  : Ryan Carr
 * Purpose : Evaluate 3 integers and determine if they are equal or not. Results are printed to console
 */
public class IntEqualityPrinter
{
    /**
     * Main entry point for program
     * @param args Unused
     */
    public static void main(String[] args)
    {
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
        printEqual(2,1,1);
    }

    /**
     * Evaluates 3 integers and determines if they are equal, partially equal or all different
     * @param first First integer to compare
     * @param second Second integer to compare
     * @param third Third integer to compare
     */
    public static void printEqual(int first, int second, int third)
    {
        // All numbers are equal
        // Neither all are equal or different
        // Invalid Value
        // All numbers are different
        if(first < 0 || second < 0 || third < 0)
            System.out.println("Invalid Value");
        else if(first == second && first == third)
            System.out.println("All numbers are equal");
        else if(first == second || first == third || second == third)
            System.out.println("Neither all are equal or different");
        else
            System.out.println("All numbers are different");
    }
}