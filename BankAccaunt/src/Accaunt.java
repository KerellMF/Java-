import money.CardAccount;
import money.EstimatedAccount;

import java.util.Scanner;

public class Accaunt
{
    public static void main(String[] args) {
        EstimatedAccount estimatedAccount = new EstimatedAccount();
        CardAccount cardAccount = new CardAccount();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы можете набрать (Расчетный) или (Карточный) для указания какой счет вы хотите " +
                "пополнить или снять деньги" +
                "\n" +
                "Вы можете набрать (Баланс расчетный) или (Баланс карточный) для просмотра баланса счёта");

        while (true)
        {

            String entryValue = scanner.nextLine();

            if (entryValue.equals("Расчетный"))
            {
                String user;

                System.out.println("Вы хотите внести деньги на счёт?(Да/Нет)");
                Scanner userAnswer = new Scanner(System.in);
                user = userAnswer.nextLine();

                if (isEntry(user) == true)
                {
                    System.out.println("Введите сумму");
                    user = userAnswer.nextLine();

                    estimatedAccount.entryMoney(Double.parseDouble(user));
                }
                else
                    {
                    System.out.println("Введите сумму какую хотите снять со счёта");
                    user = userAnswer.nextLine();

                    estimatedAccount.backMoney(Double.parseDouble(user));
                    }
            }

            if (entryValue.equals("Карточный"))
            {
                String user;

                System.out.println("Вы хотите внести деньги на счёт?(Да/Нет)");
                Scanner userAnswer = new Scanner(System.in);
                user = userAnswer.nextLine();

                if (isEntry(user) == true)
                {
                    System.out.println("Введите сумму");
                    user = userAnswer.nextLine();

                    cardAccount.entryMoney(Double.parseDouble(user));
                }
                else
                {
                    System.out.println("Введите сумму какую хотите снять со счёта");
                    user = userAnswer.nextLine();

                    cardAccount.backMoney(Double.parseDouble(user));
                }
            }

            if (entryValue.equals("Баланс расчетный"))
            {
                System.out.println("На вашем счёте: " + estimatedAccount.getMoney() + " рублей");
            }
            if (entryValue.equals("Баланс карточный"))
            {
                System.out.println("На вашем счёте: " + cardAccount.getMoney() + " рублей");
            }
        }
    }

    public static boolean isEntry (String data)
    {
        if (data.matches("[даДа]+$"))
        {
            return true;
        }
        else if (data.matches("[нетНет]+$"))
        {
            return false;
        }
        return false;
    }
}