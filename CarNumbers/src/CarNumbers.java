import java.util.*;

public class CarNumbers
{
    public static void main(String args[]) {
        String[] letters = {"A", "B", "C", "M", "T", "O", "X", "K", "H", "P", "E", "Y"};
        String[] regions = {"01","02","102","03","04","05","06","07","08","09","10","11","12","13","113","14","15","16",
                "116","716","17","18","19","21","121","22", "23", "93", "123", "193", "24", "124", "25", "125", "26",
                "126", "27", "28", "29", "30", "31", "32", "33", "34", "134", "35", "36", "136", "37", "38", "138",
                "39", "40", "41", "42", "142", "43", "44", "45", "46", "47", "147", "48", "49", "50", "90", "150", "190",
                "750", "51", "52", "152", "53", "54", "154", "55", "56", "156", "57", "58", "59", "159", "60",
                "61", "161", "761", "62", "63", "163", "763", "64", "164", "65", "66", "96", "196", "67", "68", "69",
                "70", "71", "72", "73", "173", "74", "174", "75", "76", "77", "97", "99", "177", "197", "199", "777",
                "797", "799", "78", "98", "178", "198", "79", "82", "83", "86", "186", "87", "89", "92", "95"};

        ArrayList<String> car = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        TreeSet<String> set1 = new TreeSet<>();

        //создание конструктора

        for (int i = 0; i < letters.length; i++)
        {
            for (int num = 111; num <= 999; num+= 111)
            {
                for (int j = 0; j < letters.length; j++)
                {
                    for (int l = 0; l < letters.length; l++)
                    {
                        for (int n = 0; n < regions.length; n++)
                        {
                            String carnum = letters[i] + num + letters[j] + letters[l] + regions[n];
                            car.add(carnum);
                        }
                    }
                }
            }
        }
        set.addAll(car);
        set1.addAll(car);

        System.out.println("Всего 'красивых' номеров: " + car.size());

        while (true)
        {
            System.out.println("Введите номер: ");
            Scanner scanner = new Scanner(System.in);
            String carNumber = scanner.nextLine();

            //поиск
            long resultTime = 0;
            long start = System.nanoTime();

            if (car.contains(carNumber) == true)
            {
                resultTime = System.nanoTime() - start;
                System.out.println("Поиск перебором: номер найден " + carNumber + " поиск занял: " + resultTime);
            }
            else
            {
                resultTime = System.nanoTime() - start;
                System.out.println("Поиск перебором: номер " + carNumber + " не найден поиск занял: " + resultTime);
            }

            Collections.sort(car);
            start = System.nanoTime();
            int binaryCar = Collections.binarySearch(car, carNumber);

            if (binaryCar >= 0)
            {
                resultTime = System.nanoTime() - start;
                System.out.println("Бинарный поиск: номер найден " + carNumber + " поиск занял " + resultTime);
            }
            else
            {
                resultTime = System.nanoTime() - start;
                System.out.println("Бинарный поиск: номер " + carNumber + " не найден поиск занял: " + resultTime);
            }

            start = System.nanoTime();
            if (set.contains(carNumber) == true)
            {
                resultTime = System.nanoTime() - start;
                System.out.println("Поиск в HashSet: номер найден " + carNumber + " поиск занял " + resultTime);
            }
            else
            {
                resultTime = System.nanoTime() - start;
                System.out.println("Поиск в HashSet: номер " + carNumber + " не найден поиск занял: " + resultTime);
            }

            start = System.nanoTime();
            if (set1.contains(carNumber) == true)
            {
                resultTime = System.nanoTime() - start;
                System.out.println("Поиск в TreeSet: номер найден " + carNumber + " поиск занял " + resultTime);
            }
            else
            {
                resultTime = System.nanoTime() - start;
                System.out.println("Поиск в TreeSet: номер " + carNumber + " не найден поиск занял: " + resultTime);
            }
        }
    }
}
