/**
 * Title   : TextToNumbers
 * Author  : Ryan
 * Purpose : User enters a string of words, each word is analyzed and ASCII value for each leter
 *           is summed and an integer representing the word is returned.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    /**
     * Main entry point for program
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException
    {
        System.out.println("Please type the string you would like to convert to numbers:");
        String variable = new String();
        String result = new String();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        variable = reader.readLine();
        variable = variable.toLowerCase();

        String[] words = variable.split(" ");

        for(int i = 0;i < words.length;i++)
        {
            result = result + WordToNumbers(words[i]) + " ";

        }

        System.out.println(result);
    }

    /**
     * Brings in a string and returns the sum of each ASCII character.
     * Assumes the word passed in contains only lower case letters from a to z.
     * @param word The word to be converted
     * @return Integer representing the word
     */
    public static int WordToNumbers(String word)
    {
        int result = 0;
        int zero = 'a' - 1;

        for(int i = 0;i < word.length();i++)
            // Ensure that the integer is a number from 1 - 26
            result += word.charAt(i) - zero;

        return result;
    }
}