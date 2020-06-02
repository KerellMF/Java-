package Clients;

public abstract class Client
{
    private double money = 0;

    public void entryMoney (double money)
    {
        this.money += money;
    }

    public void backMoney (double money) {
        if (money >= money)
            this.money -= money;
        else
            System.out.println("У вас нет денег");
    }

    public double getMoney ()
    {
        return money;
    }
}
