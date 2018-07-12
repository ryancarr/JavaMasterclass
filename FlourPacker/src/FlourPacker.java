/**
 * Title   : FlourPacker
 * Author  : Ryan Carr
 * Purpose : Calculate if you can provide enough flour for the customer using 5kg or 1kg bags
 */
public class FlourPacker
{
    // Size of flour bags
    public static final int bigSize = 5;
    public static final int smallSize = 1;

    /**
     * Main entry point of program
     * @param args Unused
     */
    public static void main(String[] args)
    {
        printResults(!canPack(1, 0, 4));
        printResults(canPack(1,0,5));
        printResults(canPack(0,5,4));
        printResults(canPack(2,2,12));
        printResults(!canPack(-3,2,12));
        printResults(!canPack(5,3,24));
        printResults(canPack(2,1,5));
    }

    /**
     * Determine if enough flour can be provided based on bigCount, smallCount and goal
     * @param bigCount Quantity of big flour bags
     * @param smallCount Quantity of small flour bags
     * @param goal Number of kg of flour needed
     * @return True if able to provide goal using only full bags of flour
     */
    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
        boolean result = false;

        if(bigCount >= 0 && smallCount >= 0 && goal >= 0)
        {
            int remainingGoal = 0;
            int neededBig = goal / bigSize;

            if(neededBig > bigCount)
                remainingGoal = goal - (bigCount * bigSize);
            else
                remainingGoal = goal - (neededBig * bigSize);

            if(remainingGoal <= (smallCount * smallSize) || remainingGoal == 0)
                result = true;
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