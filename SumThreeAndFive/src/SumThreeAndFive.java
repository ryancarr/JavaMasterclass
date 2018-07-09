/**
 * Title   : SumThreeAndFive
 * Author  : Ryan Carr
 * Purpose : Calculate first 5 numbers divisible by 3 and 5 and print sum of said numbers
 */
public class SumThreeAndFive
{
    /**
     * Calculate first 5 numbers divisible by 3 and 5 and print sum of said numbers
     * @param args Unused
     */
    public static void main(String[] args)
    {
        final int START = 1;
        final int FINISH = 1000;
        int count = 0;
        int total = 0;

        for(int i = START;i <= FINISH;i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println(i);
                total += i;
                count++;
            }

            if(count == 5)
                break;
        }

        System.out.println(total);
    }
}
