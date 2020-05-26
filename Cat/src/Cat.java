import java.util.Scanner;

public class Cat
{
    private double originWeight;
    private double weight;

    private static final double MIN_WEIGHT = 1000.0;
    private static final double MAX_WEIGHT = 9000.0;
    private static final int CAT_EYES = 2;

    private double sumFeed;

    public static int Count = 0;

    public boolean IsDead = false;

    public void setCatColor(CatColor type)
    {

    }

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        Count++;

    }

    public Cat(double catWeight)
    {
        weight = catWeight;
        originWeight = catWeight;
        Count++;
    }

    public void OnDead()
    {
        if(IsDead == true)  return;

        System.out.println("Кошка погибла");
        Count--;
        IsDead = true;

    }

    public static int getCount()
    {
        return Count;
    }

    public void meow()
    {
        if(IsDead == true)  return;

        weight = weight - 1;
        System.out.println("Meow");

    }

    public void feed(Double amount)
    {
        if(IsDead == true)  return;

        sumFeed += amount;
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        if(IsDead == true)  return;

        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT)
        {
            OnDead();
            return "Dead";
        }
        else if(weight > MAX_WEIGHT)
        {
            OnDead();
            return "Exploded";
        }
        else if(weight > originWeight)
        {
            return "Sleeping";
        }
        else {
            return "Playing";
        }

    }

    public Double getSumFeed()
    {
        return sumFeed;
    }


    public void pee()
    {
        if(IsDead == true)  return;

        weight = weight - 5;
    }
}