import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;
import com.skillbox.airport.Terminal;
import java.util.List;

public class Main
{
    public static void main (String[] args)
    {
        Airport airport = Airport.getInstance();

        List<Aircraft> aircrafts = airport.getAllAircrafts();
        List<Terminal> terminals = airport.getTerminals();

        System.out.println("Названия самолетов: " + aircrafts);
        System.out.println("Количество самолетов = " + aircrafts.size());
        System.out.println("Названия терминалов: " + terminals);
        System.out.println("Количество терминалов = " + terminals.size());
    }
}
