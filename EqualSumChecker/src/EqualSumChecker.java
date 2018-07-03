/**
 * Title   : Equal Sum Checker
 * Author  : Ryan
 * Purpose : Check two operands and determine if they are equivalent to a given sum
 *           The Complete Java Masterclass Coding Exercise 5
 */
public class EqualSumChecker
{
    public static void main(String[] args)
    {
        int firstOperand = 0;
        int secondOperand = 0;
        int sum = 0;

        firstOperand = 1;
        secondOperand = 1;
        sum = 1;
        printResults(firstOperand,secondOperand,sum,hasEqualSum(firstOperand,secondOperand,sum));

        sum = 2;
        printResults(firstOperand,secondOperand,sum,hasEqualSum(firstOperand,secondOperand,sum));

        secondOperand = -1;
        sum = 0;
        printResults(firstOperand,secondOperand,sum,hasEqualSum(firstOperand,secondOperand,sum));
    }

    /**
     * Brings in two operands and determines if they are equivalent to the sum
     * @param firstOperand  first operand
     * @param secondOperand Second operand
     * @param sum   Expected sum
     * @return  True if the sum of the operands is equivalent to the expected sum
     */
    public static boolean hasEqualSum(int firstOperand, int secondOperand, int sum)
    {
        return firstOperand + secondOperand == sum;
    }

    /**
     * Output the results to the console showing the result of the test
     * @param firstOperand  First operand
     * @param secondOperand Second operand
     * @param sum   Expected sum
     * @param result    Determines if the test was successful or not
     */
    private static void printResults(int firstOperand, int secondOperand, int sum, boolean result)
    {
        if(result)
            System.out.println(firstOperand + " + " + secondOperand + " = " + sum);
        else
            System.out.println(firstOperand + " + " + secondOperand + " != " + sum);
    }
}