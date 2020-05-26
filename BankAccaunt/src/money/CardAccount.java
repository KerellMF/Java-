package money;

public class CardAccount extends Account
{
    @Override
    public void backMoney (double money)
    {
        double money1 = money + (money * 0.01);
        super.backMoney(money1);
    }
}
