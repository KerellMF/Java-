package money;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class EstimatedAccount extends Account
{
    LocalDate today = LocalDate.now();

    @Override
    public void entryMoney (double money)
    {
        super.entryMoney(money);
        today = LocalDate.now();
    }

    @Override
    public  void backMoney (double money)
    {
        LocalDate startDate = today;
        LocalDate endDate = LocalDate.now();

        Period period = Period.between(startDate, endDate);

        long daysLeft = ChronoUnit.DAYS.between(startDate, endDate.plusMonths(1));

        if(period.getMonths() >= 1)
            super.backMoney(money);
        else
            System.out.println("Вы сможете снять деньги через: " + daysLeft + " дней");
    }
}
