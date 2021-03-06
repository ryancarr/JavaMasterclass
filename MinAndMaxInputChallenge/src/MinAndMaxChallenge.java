import java.util.Scanner;

/**
 * Title   : MinAndMaxChallenge
 * Author  : Ryan Carr
 * Purpose : Ask the user to enter a series of numbers, calculate the min and max number entered
 */
public class MinAndMaxChallenge
{
    /**
     * Main entry point
     * @param args Unused
     */
    public static void main(String[] args)
    {
        int min = 0;
        int max = 0;
        int number;
        Scanner scanner = new Scanner(System.in);
        boolean first = true;

        while(true)
        {
            System.out.println("Enter a number: ");
            // Check if the input ix an integer
            if(scanner.hasNextInt())
            {
                number = scanner.nextInt();

                if(first)
                {
                    first = false;
                    min = number;
                    max = number;
                }

                if(number < min)
                    min = number;
                if(number > max)
                    max = number;
            }
            else
                break;

            scanner.nextLine();
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}