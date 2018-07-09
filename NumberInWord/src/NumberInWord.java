/**
 * Title   : NumberInWord
 * Author  : Ryan Carr
 * Purpose : Java Masterclass Programming Exercise 12
 */
public class NumberInWord
{
    /**
     * Main entry point of program
     * @param args Unused
     */
    public static void main(String[] args)
    {
        printNumberInWord(1);
        printNumberInWord(0);
        printNumberInWord(35);
    }

    /**
     * Converts an integer between 0 and 9 to it's word form
     * @param number Number between 0 and 9
     */
    public static void printNumberInWord(int number)
    {
        // Print uppercase word form of each number 0 - 9
        // If a different value is passed in output OTHER
        switch(number)
        {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }
}
