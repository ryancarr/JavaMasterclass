/**
 * Title   : BarkingDog
 * Author  : Ryan
 * Purpose : The Complete Java Masterclass second coding exercise
 */
public class BarkingDog
{
    public static void main(String[] args)
    {
        printResults(bark(true, 1));
        printResults(bark(false, 2));
        printResults(bark(true, 8));
        printResults(bark(true, -1));
    }

    /**
     * Determine if the dogs owner should wake up or not
     * @param barking Is the dog actively barking
     * @param hourOfDay The time of day as whole number from 0 - 23
     * @return True if owner needs to wake up
     */
    private static boolean bark(boolean barking, int hourOfDay)
    {
        // Wake up if dog is barking between 22:00 and 08:00 at night
        // Handle invalid numbers outside range 0-23
        boolean wakeup = false;
        int hourMin = 0;
        int hourMax = 23;
        int bedtime = 22;
        int wakeupTime = 8;

        if(!barking || (hourOfDay < hourMin || hourOfDay > hourMax))
        {
            wakeup = false;
        } else if ((hourOfDay < wakeupTime) ||
                (hourOfDay > bedtime))
        {
            wakeup = true;
        }

        return wakeup;
    }

    /**
     * Provides output to the console showing results of each test
     * @param wakeup True if owner needs to wake up
     */
    private static void printResults(boolean wakeup)
    {
        if(wakeup)
            System.out.println("Owner has woken up.");
        else
            System.out.println("Owner doesn't need to wake up.");
    }
}