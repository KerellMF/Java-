public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;

        System.out.println(sumOneDigits(555));
    }

    public static int sumDigits(int number)
    {
        String digit = Integer.toString(number);
        int sum = 0;

        for(int i = 0; i < digit.length(); i++)
        {
                char c = digit.charAt(i);
                int n = Integer.parseInt(String.valueOf(c));
                sum += n;
        }

        return sum;
    }
    public static int sumOneDigits(int number)
    {
        int result = number;

        while(result >= 10)
        {
            result = sumDigits(result);
        }

        return result;
    }

}

