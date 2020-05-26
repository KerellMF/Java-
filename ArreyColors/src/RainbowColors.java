import java.util.Arrays;

public class RainbowColors
{
    public static String[] mirArray(String[] x)
    {
        String[] reverse = new String[x.length];

        for (int i = 0; i < x.length; i++)
        {
           reverse[i] =x[x.length - i - 1];
        }
        return reverse;
    }
    public static void main(String args[])
    {
        String text = "Каждый охотник желает знать, где сидит фазан";

        String[] colors = text.split(",?\\s+");

        colors = mirArray(colors);

        for (int i = 0; i < colors.length; i++)
            System.out.println(colors[i]);
    }
}
