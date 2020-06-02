package Clients;

public class LegalEntity extends Client
{

    @Override
    public void backMoney (double money) {
        super.backMoney(money + (money * 0.01));
    }

}
