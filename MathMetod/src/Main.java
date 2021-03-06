import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int box = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько коробок нужно доставить?");
        box = scanner.nextInt();

        Deliver deliverHelp = new Deliver(box);
        System.out.println("Что бы доставить ("+ deliverHelp.getBox()+") коробок. Вам понадобится: \n" + "Грузовиков: "
                + deliverHelp.getTruck() + "\nКонтейнеров: " + deliverHelp.getContainer());
        deliverHelp.result();
    }

public static class Deliver
{
    private int truck;
    private int container;
    private int box;

    public Deliver (int box)
    {
        this.box = box;
        if (box != 0)
        {
            container = box % 27 == 0 ? box / 27 : box / 27 + 1;
        }
        if (container != 0)
        {
            truck = container % 12 == 0 ? container / 12 : container / 12 + 1;
        }
    }
    public int getTruck()
    {
        return truck;
    }
    public int getContainer()
    {
        return container;
    }
    public int getBox()
    {
        return box;
    }
    public void result()
    {
        int b = 1;
        int c = 1;
        for (int i = 1; i <= truck; i++)
        {
            System.out.println("Грузовик номер: " + i);
            int j = 0;
            while (j < 12 && c <= container)
            {
                System.out.println("    Контейнер номер: " + c);
                int k = 0;
                while (k < 27 && b <= box)
                {
                    System.out.println("        Коробка номер: " + b);
                    k++;
                    b++;
                }
                j++;
                c++;
                System.out.println();
            }
        }
    }
}
}

