/**
 * Title   : DiagonalStar
 * Author  : Ryan Carr
 * Purpose : Java Masterclass Coding Exercise 25 - Draws a diagonal star in a square
 */
public class DiagonalStar
{
    /**
     * Main entry point of program
     * @param args Unused
     */
    public static void main(String[] args)
    {
        printSquareStar(5);
    }

    /**
     * Prints a star inside a square
     * @param number Number of rows and columns to use
     */
    public static void printSquareStar(int number)
    {
        if(number > 4)
        {
            for(int i = 1; i <= number;i++)
            {
                for(int j = 1;j <= number; j++)
                {
                    if(i == 1 || i == number || j == 1 || j == number || i == j || j == number - i + 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                // Move to next line
                System.out.println();
            }
        }
        else
            System.out.println("Invalid Value");
    }
}