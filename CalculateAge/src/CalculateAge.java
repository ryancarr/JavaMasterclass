import java.util.Calendar;
import java.util.Scanner;

/**
 * Title   : CalculateAge
 * Author  : Ryan Carr
 * Purpose : Get a users name and year of birth then calculate their age based on the information
 */
public class CalculateAge
{
    /**
     * Main entry point
     * @param args Unused
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scanner.next();

        System.out.println("What year were you born in?");
        int birthYear = scanner.nextInt();
        // Catches new line at end of integer input
        scanner.nextLine();

        int calendarYear = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println(name + " you are " + (calendarYear - birthYear) + " years old.");

        scanner.close();
    }
}