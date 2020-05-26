import java.text.*;
import java.util.Calendar;

import java.util.GregorianCalendar;

import static java.util.Calendar.*;
import static java.util.Locale.ENGLISH;


public class Data {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM, yyyy HH:mm:ss");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat( "EEEE", ENGLISH);

        Calendar calendar1 = new GregorianCalendar(1999, JUNE, 25, 8, 42, 12);

        System.out.println(dateFormat.format(calendar1.getTime()) + "\n" + dateFormat1.format(calendar1.getTime()));


        System.out.println("============================================================");

        Calendar calendar2 = new GregorianCalendar(2020, 5, 25);

        while (calendar1.before(calendar2)) {
            calendar1.add(Calendar.YEAR, 1);

            System.out.println(dateFormat.format(calendar1.getTime()) + "\n" + dateFormat1.format(calendar1.getTime()));

            System.out.println("============================================================");


        }
    }
}
