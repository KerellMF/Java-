import Clients.IeEntity;
import Clients.LegalEntity;
import Clients.PhisicalEntity;

public class Bank
{
    public static void main(String[] args)
    {
        PhisicalEntity phisicalEntity = new PhisicalEntity();
        LegalEntity legalEntity = new LegalEntity();
        IeEntity ieEntity = new IeEntity();

        phisicalEntity.entryMoney(1000);
        phisicalEntity.backMoney(200);
        System.out.println("Физическое лицо имеет на счету " + phisicalEntity.getMoney());

        System.out.println();

        legalEntity.entryMoney(1500);
        legalEntity.backMoney(500);
        System.out.println("Юридическое лицо имеет на счету " + legalEntity.getMoney());

        System.out.println();

        ieEntity.entryMoney(1000);
        System.out.println("ИП имеет на счету " + ieEntity.getMoney());
        ieEntity.entryMoney(2000);
        System.out.println("ИП имеет на счету " + ieEntity.getMoney());
    }
}
