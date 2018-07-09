/**
 * Title   : NumberPalindrome
 * Author  : Ryan Carr
 * Purpose : Take a given number and evaluate if it is a number palindrome or not
 */
public class NumberPalindrome
{
    /**
     * Main entry point of program
     * @param args Unused
     */
    public static void main(String[] args)
    {
        printResults(isPalindrome(-1221));
        printResults(isPalindrome(707));
        printResults(isPalindrome(11));
        printResults(isPalindrome(-10101));
        printResults(!isPalindrome(123));
    }

    /**
     * Checks a given number to see if it is a palindrome. Capable of handling
     * negative numbers.
     * @param number Number to be analyzed
     * @return True if the number is a palindrome
     */
    public static boolean isPalindrome(int number)
    {
        if(number < 0)
            number *= -1;

        int temp = number;
        int reverse = 0;

        while(temp > 0)
        {
            // Increase existing value by one position and add next last digit
            reverse = (reverse * 10) + (temp % 10);
            temp /= 10;
        }

        return number == reverse;
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