import java.util.Scanner;
import static java.lang.System.*;

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
                          int spaceIndex1 = fio.indexOf(' ');
                          int spaceIndex2 = fio.lastIndexOf(' ');
                          System.out.println();
                          System.out.println("Фамилия: " + fio.substring(0, spaceIndex1) + "\n" + "Имя: "
                                  + fio.substring(spaceIndex1, spaceIndex2) + "\n" + "Отчество: "
                                  + fio.substring(spaceIndex2));
                      }
    }
}
