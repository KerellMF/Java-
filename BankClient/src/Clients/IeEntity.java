package Clients;

public class IeEntity extends Client
{
    @Override
    public void entryMoney (double money)
    {
        double IeMoney = money;

        if(IeMoney < 1000)
        {
            IeMoney = money - (money * 0.01);
            super.entryMoney(IeMoney);
        }
        else
        {
            IeMoney = money - (money * 0.005);
            super.entryMoney(IeMoney);
        }
    }

    @Override
    public void backMoney (double money)
    {
        super.money = money;
    }

}
