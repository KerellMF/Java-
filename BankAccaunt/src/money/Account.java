package money;

public class Account
{
    double customerMoney = 0;

    public void entryMoney (double money)
    {
        customerMoney += money;
    }

    public void backMoney (double money)
    {
        if (customerMoney >= money)
            customerMoney -= money;
        else
            System.out.println("У вас нет денег");
    }

    public double getMoney ()
    {
       return customerMoney;
    }
}
