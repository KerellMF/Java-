import java.util.Scanner;

public class FIO
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Фамилию Имя Отчество: ");
        if(in.hasNextInt())
        {
            System.out.println("Неверное значение");
        }
        else
        {
            String fio = in.nextLine();

            System.out.println();

            String[] fio2 = fio.split("\\s+");
            System.out.println("Фамилия: " + fio2[0]);
            System.out.println("Имя: " + fio2[1]);
            System.out.println("Отчество: " + fio2[2]);
        }
    }
}
