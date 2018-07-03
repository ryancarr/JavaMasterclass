/**
 * Title   : MegaBytesConverter
 * Author  : Ryan
 * Purpose : Complete Java Masterclass first coding exercise
 */
public class MegaBytesConverter
{
    public static void main(String[] args)
    {
        printMegaBytesAndKiloBytes(2050);
    }

    /**
     * Convert a set number of kilobytes to the equivalent MB and remaining KB.
     * Results are printed to the console.
     * @param kiloBytes Quantity of kilobytes you start with
     */
    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        int megaBytes = 0;
        int remainingKiloBytes = 0;
        int kiloBytesInMegabyte = 1024;

        if(kiloBytes >= 0)
        {
            // Only do the conversion if necessary
            megaBytes = kiloBytes / kiloBytesInMegabyte;
            remainingKiloBytes = kiloBytes % kiloBytesInMegabyte;

            System.out.println(kiloBytes + " KB = " + megaBytes +
                    " MB and " + remainingKiloBytes + " KB");
        } else if(kiloBytes < 0)
        {
            System.out.println("Invalid Value");
        }
    }
}