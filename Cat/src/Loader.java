import java.util.Scanner;

public class Loader {

    public enum catColor
    {
        BLACK,
        ORANGE,
        WHITE,
        STRIPED,
        GRAY
    }

    private static Cat getKitten()
    {
        return new Cat(1100);
    }

    public void setCatColor(CatColor catColor)
    {
        catColor = catColor;
    }

    public CatColor getCatColor()
    {
        return getCatColor();
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вес кошки в граммах (3500,0): ");
        double catWeight = 0.0;
        if(in.hasNextDouble())
        {
           catWeight = in.nextDouble();

        }
        else if(in.hasNextInt())
        {
            catWeight = in.nextInt();
        }
        else {
            System.out.println("Введено не корректное значение");
            return;
        }
        in.close();

        Cat cat = new Cat(catWeight);
        System.out.println("Кошка сейчас весит: " + cat.getWeight());
        System.out.println("Кол-во кошек сейчас: " + Cat.Count);
        cat.feed((double) 150);
        cat.pee();
        cat.pee();
        cat.pee();
        System.out.println("Кошка съела: " + cat.getSumFeed());
        System.out.println("Кошка сейчас: " + cat.getStatus());
        System.out.println("Кошка сейчас весит: " + cat.getWeight());
        System.out.println("Кол-во кошек сейчас: " + Cat.Count);

        System.out.println();

        Cat bob = new Cat();
        System.out.println(Cat.getCount());
        System.out.println("Кошка сейчас: " + bob.getStatus() );
        System.out.println(Cat.getCount());
        bob.setCatColor(CatColor.ORANGE);
    }
}
