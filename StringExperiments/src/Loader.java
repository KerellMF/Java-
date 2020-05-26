
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(text);
        System.out.println(stringSum(text));
    }

    public static int stringSum (String str)
    {
        int vasya = Integer.parseInt(str.substring((str.indexOf("Вася") + 15), (str.indexOf(" рублей, "))));

        int masha = Integer.parseInt(str.substring(
                str.indexOf("Маша") + 7,
                str.indexOf(" рублей", str.indexOf("Маша")))
        );

        return vasya + masha;

    }
}