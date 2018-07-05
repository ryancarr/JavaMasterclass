/**
 * Title   : AreaCalculator
 * Author  : Ryan Carr
 * Purpose : Calculate the area of a circle or a rectangle using method overloading
 */
public class AreaCalculator
{
    // Constant representing Pi
    public static final double PI = 3.14159;

    /**
     * Main entry point of the program
     * @param args Any arguments to be passed into the program, currently unused
     */
    public static void main(String[] args)
    {
        printResults(area(5.0) == 78.53975);
        printResults(area(-1) == -1.0);
        printResults(area(5.0,4.0) == 20.0);
        printResults(area(-1.0, 5.0) == -1.0);
    }

    /**
     * Calculates the area of a circle of a given radius
     * @param radius Radius of the circle
     * @return Returns the area of the circle or -1 if any invalid values are provided
     */
    public static double area(double radius)
    {
        // Area of a circle pi * r * r
        // Return -1.0 if invalid value
        double result = 0d;

        if(radius < 0)
            result = -1.0;
        else
            result = PI * radius * radius;

        return result;
    }

    /**
     * Calculates the area of a rectangle of a given length and width
     * @param length Length of the rectangle
     * @param width Width of the rectangle
     * @return Returns the area of the rectangle or -1 if any invalid values are provided
     */
    public static double area(double length, double width)
    {
        // Area of a rectangle l * w
        // Return -1.0 if invalid value
        double result = 0d;

        if(length < 0 || width < 0)
            result = -1.0;
        else
            result = length * width;

        return result;
    }

    /**
     * Quick method to print success or failure message to console
     * @param result True if test was successful
     */
    public static void printResults(boolean result)
    {
        if(result)
            System.out.println("Test passed successfully!");
        else
            System.out.println("Test failed!");
    }
}