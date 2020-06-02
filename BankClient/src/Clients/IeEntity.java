package Clients;

public class IeEntity extends Client
{
    @Override
    public void entryMoney (double money)
    {
        double ieMoney = money;

        if(ieMoney < 1000) {
            super.entryMoney(money - (money * 0.01) );
        }
        else {
            super.entryMoney(money - (money * 0.005));
        }
    }

}
