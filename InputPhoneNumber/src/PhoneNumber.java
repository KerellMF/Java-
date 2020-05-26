import java.util.Scanner;

public class PhoneNumber
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер телефона");
        String phone = in.nextLine();
        phone = phone.replaceAll("[^0-9]", "");
        if(phone.length() == 11)
        {
            System.out.println("Ваш номер телефона: " +  phone);
        }
        else
        {
            System.out.println("Вы ввели не корректные данные");
        }

    }
}
