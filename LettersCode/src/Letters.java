public class Letters
{
    public static void main(String args[])
    {
        String alphabet = "abcdefgehijklmopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println(alphabetEnum(alphabet));

        System.out.println("Код заглавной буквы: \u0041 и строчной буквы: \u0061\n выглядит так: u0041 и так:u0061");
        System.out.println();

        System.out.println("Код заглавной буквы: \u0042 и строчной буквы: \u0062\n выглядит так: u0042 и так:u0062");
        System.out.println();

        System.out.println("Код заглавной буквы: \u0043 и строчной буквы: \u0063\n выглядит так: u0043 и так:u0063");
        System.out.println();

        System.out.println("Код заглавной буквы: \u0044 и строчной буквы: \u0064\n выглядит так: u0044 и так:u0064");
        System.out.println();

        System.out.println("Код заглавной буквы: \u0045 и строчной буквы: \u0065\n выглядит так: u0045 и так:u0065");
        System.out.println();

        System.out.println("Код заглавной буквы: \u0046 и строчной буквы: \u0066\n выглядит так: u0046 и так:u0066");
        System.out.println();

        System.out.println("Код заглавной буквы: \u0047 и строчной буквы: \u0067\n выглядит так: u0047 и так:u0067");
        System.out.println();

        System.out.println("Код заглавной буквы: \u0048 и строчной буквы: \u0068\n выглядит так: u0048 и так:u0068");
        System.out.println();

        System.out.println("Код заглавной буквы: \u0049 и строчной буквы: \u0069\n выглядит так: u0049 и так:u0069");
        System.out.println();

        System.out.println("Код заглавной буквы: \u004A и строчной буквы: \u006A\n выглядит так: u004A и так:u006A");
        System.out.println();

        System.out.println("Код заглавной буквы: \u004B и строчной буквы: \u006B\n выглядит так: u004B и так:u006B");
        System.out.println();

        System.out.println("Код заглавной буквы: \u004C и строчной буквы: \u006C\n выглядит так: u004C и так:u006C");
        System.out.println();

        System.out.println("Код заглавной буквы: \u004D и строчной буквы: \u006D\n выглядит так: u004D и так:u006D");
        System.out.println();

        System.out.println("Код заглавной буквы: \u004E и строчной буквы: \u006E\n выглядит так: u004E и так:u006E");
        System.out.println();

        System.out.println("Код заглавной буквы: \u004F и строчной буквы: \u006F\n выглядит так: u004F и так:u006F");
        System.out.println();

        System.out.println("Код заглавной буквы: \u0050 и строчной буквы: \u0070\n выглядит так: u0050 и так:u0070");
        System.out.println();

        System.out.println("Код заглавной буквы: \u0051 и строчной буквы: \u0071\n выглядит так: u0051 и так:u0071");
        System.out.println();

        System.out.println("Код заглавной буквы: \u0052 и строчной буквы: \u0072\n выглядит так: u0052 и так:u0072");
        System.out.println();

        System.out.println("Код заглавной буквы: \u0053 и строчной буквы: \u0073\n выглядит так: u0053 и так:u0073");
        System.out.println();

        System.out.println("Код заглавной буквы: \u0054 и строчной буквы: \u0074\n выглядит так: u0054 и так:u0074");
        System.out.println();

        System.out.println("Код заглавной буквы: \u0055 и строчной буквы: \u0075\n выглядит так: u0055 и так:u0075");
        System.out.println();

        System.out.println("Код заглавной буквы: \u0056 и строчной буквы: \u0076\n выглядит так: u0056 и так:u0076");
        System.out.println();

        System.out.println("Код заглавной буквы: \u0057 и строчной буквы: \u0077\n выглядит так: u0057 и так:u0077");
        System.out.println();

        System.out.println("Код заглавной буквы: \u0058 и строчной буквы: \u0078\n выглядит так: u0058 и так:u0078");
        System.out.println();

        System.out.println("Код заглавной буквы: \u0059 и строчной буквы: \u0079\n выглядит так: u0059 и так:u0079");
        System.out.println();

        System.out.println("Код заглавной буквы: \u005A и строчной буквы: \u007A\n выглядит так: u005A и так:u007A");
        System.out.println();

    }

    public static String alphabetEnum (String alphabet)
    {
        int i;
        String s=alphabet;
        for (i=0;i<s.length();i++)
        {
            System.out.println(s.charAt(i));
        }

        return s;
    }

}
