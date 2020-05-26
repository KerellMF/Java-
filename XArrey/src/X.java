import java.util.Scanner;

public class X
{
    public static void main(String args[])
    {
        int high;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число: ");
        high = scanner.nextInt();

        String[][] array = new String[high][high];
        int offSetX = 0;
        for (int y = 0; y < high; y++)
        {
            for (int x = 0; x < high; x++)
            {
                if(x == offSetX || x == high - offSetX - 1)
                {
                    array[y][x] = "x";
                    System.out.print(array[y][x]);
                }
                else
                {
                    array[y][x] = " ";
                    System.out.print(array[y][x]);
                }
            }
            offSetX++;
            System.out.println();
        }
    }
}