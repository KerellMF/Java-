import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.awt.datatransfer.DataFlavor;
import java.nio.channels.FileLock;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main
{
    private static Flight flight;

    public static void main (String[] args)
    {
        Airport airport = Airport.getInstance();

        List<Terminal> terminals = airport.getTerminals();

        List<Flight> flights = new ArrayList<Flight>();

        Airport.getInstance().
                getTerminals().
                stream().
                flatMap(t -> t.getFlights().stream()).filter(flight -> {
            if (flight.getType() == Flight.Type.DEPARTURE)
            {
                long dateDif = (flight.getDate().getTime() - System.currentTimeMillis());
                dateDif = dateDif / 1000 / 60 / 60;
                if (dateDif < 2 && dateDif >= 0)
                {
                    Date date = flight.getDate();
                    Flight.Type type = flight.getType();
                    Aircraft aircraft = flight.getAircraft();
                    Stream.of(date, type, aircraft);
                    return true;
                }
            }
            return false;
        }).
                forEach(System.out::println);
    }
}
