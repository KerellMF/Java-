import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {

    public static String getKeyByValue (Long value, TreeMap<String, Long> map)
    {
       int keyIndex = -1;
       int counter = 0;
       for(long v : map.values())
       {
           if(v == value)
           {
               keyIndex = counter;
               break;
           }
           counter++;
       }
       if (keyIndex != -1)
       {
           return (String) map.keySet().toArray()[keyIndex];
       }
       else
       {
           return "";
       }
    }

    public static void main(String args[])
    {
        String contact;
        String phone;
        String name = null;

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        TreeMap<String, Long> namePhone = new TreeMap();

        System.out.println("Вы можете: напичатать LIST и увидеть список контактов в телефонной книге;" + "\n"
                    + "Добавить номер телефона или новый контакт введя номер или имя");

        while (true) {
            contact = scanner.nextLine();

            if (contact.equals("exit"))
                break;

            if (contact.equals("LIST"))
            {
                System.out.println(namePhone);
                continue;
            }
            if (isName(contact) == true)
            {
                if (namePhone.containsKey(contact))
                {
                    System.out.println(namePhone.get(contact));
                    continue;
                }

                name = contact;
                System.out.println("Введите номер телефона: ");
                phone = scanner1.nextLine();
                phone = phone.replaceAll("[^0-9]", "");
                namePhone.put(name, Long.valueOf(phone));
                }
                else
                    {
                        if(namePhone.containsValue(Long.valueOf(contact)))
                        {
                            System.out.println(getKeyByValue(Long.valueOf(contact), namePhone));
                            continue;
                        }
                        System.out.println("Введите имя: ");
                        name = scanner.nextLine();
                        namePhone.put(name,Long.valueOf(contact));
                    }
            }
        }
        public static boolean isName (String data)
        {
            if (data.matches("[а-яА-ЯёЁ]+$"))
            {
                return true;
            }
            else
                return false;
        }
}
