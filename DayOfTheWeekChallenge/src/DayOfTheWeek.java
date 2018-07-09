/**
 * Title   : DayOfTheWeekChallenge
 * Author  : Ryan Carr
 * Purpose : Take an integer and convert it into a day of the week
 */
public class DayOfTheWeek
{
    /**
     * Main entry point
     * @param args Unused
     */
    public static void main(String[] args)
    {
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
    }

    /**
     * Print the day of the week that corresponds to an integer
     * @param day 0 is Sunday, 1 is Monday ... 6 is Saturday
     */
    public static void printDayOfTheWeek(int day)
    {
        switch(day)
        {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}