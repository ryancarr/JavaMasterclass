/**
 * Title   : MinutesAndSeconds
 * Author  : Ryan
 * Purpose : The Complete Java Masterclass coding challenge
 */
public class main
{
    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println(getDurationString(61,6));
        System.out.println(getDurationString(3666));
        System.out.println(getDurationString(61,0));
    }

    /**
     *
     * @param minutes
     * @param seconds
     * @return
     */
    public static String getDurationString(int minutes, int seconds)
    {
        String result = "";
        int hours = 0;

        if(minutes < 0 || (seconds < 0 || seconds > 59))
            result = "Invalid value";
        else
        {
            hours = minutes / 60;
            minutes = (minutes % 60) + (seconds / 60);
            seconds = seconds % 60;

            if(hours < 10)
                result = "0" + hours + "h ";
            else
                result = hours + "h ";

            if(minutes < 10)
                result = result + "0" + minutes + "m ";
            else
                result = result + minutes + "m ";

            if(seconds < 10)
                result = result + "0" + seconds + "s";
            else
                result = result + seconds + "s";
        }

        return result;
    }

    /**
     *
     * @param seconds
     * @return
     */
    public static String getDurationString(int seconds)
    {
        String result = "";
        if(seconds < 0)
        {
            result = "Invalid value";
        }
        else
        {
            int minutes = seconds / 60;
            seconds = seconds % 60;

            result = getDurationString(minutes, seconds);
        }
        return result;
    }
}