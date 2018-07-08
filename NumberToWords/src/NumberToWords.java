/**
 * Title   : NumberToWords
 * Author  : Ryan Carr
 * Purpose : Convert a number to words representing each digit
 */
public class NumberToWords
{
    // Minimum acceptable value
    private static final int MIN = 0;

    /**
     * Main entry point
     * @param args Unused
     */
    public static void main(String[] args)
    {
        System.out.println("Testing getDigitCount()");
        System.out.println("-----------------------");
        printResults(getDigitCount(0) == 1);
        printResults(getDigitCount(123) == 3);
        printResults(getDigitCount(-12) == -1);
        printResults(getDigitCount(5200) == 4);
        System.out.println("-----------------------");

        System.out.println("Testing reverse()");
        System.out.println("------------------------");
        printResults(reverse(-121) == -121);
        printResults(reverse(1212) == 2121);
        printResults(reverse(1234) == 4321);
        printResults(reverse(100) == 1);
        System.out.println("------------------------");

        System.out.println("Testing numberToWords()");
        System.out.println("------------------------");
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        System.out.println("------------------------");
    }

    /**
     * Get the number of digits composing a given number
     * @param number Number to analyze
     * @return Number of digits or -1 if negative number
     */
    public static int getDigitCount(int number)
    {
        int result = 0;

        if(MIN <= number)
        {
            if(number != 0)
            {
                while(number > MIN)
                {
                    number /= 10;
                    result++;
                }
            }
            else
                result = 1;
        }
        else
            result = -1;

        return result;
    }

    /**
     * Take a number and reverse the digits
     * @param number Number to reverse
     * @return Reversed number
     */
    public static int reverse(int number)
    {
        int result = 0;
        boolean negative = false;

        if(number < MIN)
        {
            negative = true;
            number *= -1;
        }


        while(number > MIN)
        {
            // Increase existing value by one position and add next last digit
            result = (result * 10) + (number % 10);
            number /= 10;
        }

        if(negative)
            result *= -1;

        return result;
    }

    /**
     * Converts an integer between 0 and 9 to its word form
     * @param number Number between 0 and 9
     */
    public static String NumberInWord(int number)
    {
        String result = "";

        switch(number)
        {
            case 0:
                result += "Zero";
                break;
            case 1:
                result += "One";
                break;
            case 2:
                result += "Two";
                break;
            case 3:
                result += "Three";
                break;
            case 4:
                result += "Four";
                break;
            case 5:
                result += "Five";
                break;
            case 6:
                result += "Six";
                break;
            case 7:
                result += "Seven";
                break;
            case 8:
                result += "Eight";
                break;
            case 9:
                result += "Nine";
                break;
        }
        return result;
    }

    /**
     * Convert a number into word form representing each digit
     * @param number Number to be converted
     */
    public static void numberToWords(int number)
    {
        String result = "";
        int digits = getDigitCount(number);
        number = reverse(number);
        int temp = number;

        if(number > MIN)
        {
            while (number > MIN)
            {
                result += NumberInWord(number % 10) + " ";
                number /= 10;
            }

            if(digits > getDigitCount(temp))
                for(int i = getDigitCount(temp); i < digits;i++)
                    result += NumberInWord(0) + " ";
        }
        else
            result = "Invalid Value";

        result = result.trim();

        System.out.println(result);
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