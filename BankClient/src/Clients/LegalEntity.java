package Clients;

public class LegalEntity extends Client
{
    @Override
    public void entryMoney (double money)
    {
        super.money += money;
    }

    @Override
    public void backMoney (double money)
    {
        double leMoney = money + (money * 0.01);
        super.backMoney(leMoney);
    }

}
