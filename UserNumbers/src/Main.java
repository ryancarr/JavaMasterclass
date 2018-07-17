import java.util.Scanner;

/**
 * Title   : UserNumbers
 * Author  : Ryan Carr
 * Purpose : Java Masterclass coding challenge - User enters 10 numbers and sum is output
 */
public class Main
{
    /**
     * Main entry point of program
     * @param args Unused
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while(count < 10)
        {
            System.out.print("Please enter a number: ");
            if(scanner.hasNextInt())
            {
                int number = scanner.nextInt();
                sum += number;
                count++;
                System.out.println();
            }
            else
                System.out.println("That isn't a valid number, please try again.");

            scanner.nextLine();
        }

        System.out.println("The sum of the numbers you have entered is: " + sum);

        scanner.close();
    }
}
