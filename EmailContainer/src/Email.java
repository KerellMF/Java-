import java.util.HashSet;
import java.util.Scanner;

public class Email
{
    public static void main(String args[])
    {
        String email;

        Scanner scanner = new Scanner(System.in);
        HashSet<String> emails = new HashSet<>();

        System.out.println("Вы можете: напичатать LIST и увидеть список email'ов;" + "\n" + "ADD - добавить email");

        while (true) {
            email = scanner.nextLine();

            if (email.equals("exit"))
                break;

            if (email.matches("ADD\\s+(\\w+)@(\\w+)\\.([a-z\\.]{2,6})$"))

                emails.add(email);
            else
                System.out.println("Вы ввели не корректнный email. Попробуйте еще раз");

            if(email.equals("LIST"))
            {
                for (String emls : emails)
                    System.out.println(emls);
            }
        }
    }
}
