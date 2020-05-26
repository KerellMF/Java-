import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String args[])
    {

        String tasks;
        String task;
        String nameOfTask;
        String taskNumber;
        String editName;
        String deleteTask;

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<>();
        toDoList.add("Список ваших дел: ");

        System.out.println("Вы можете: набрать LIST и увидеть список дел;" + "\n" + "ADD - добавить дело;" + "\n"
                + "DELETE - удалить дело;" + "\n" + "EDIT - изменить название дела.");

        while (true)
        {
            tasks = scanner.nextLine();

            if (tasks.equals("exit"))
                break;

            if (tasks.equals("LIST"))
            {
                for (String item : toDoList)
                    System.out.println(item);
            }
            else if (tasks.matches("ADD\\s\\D.+"))
            {
                String[] deal = tasks.split("\\s+", 2);
                nameOfTask = deal[1];
                toDoList.add(nameOfTask);

            }
            else if (tasks.matches("ADD\\s\\d\\s.+"))
            {
                String[] deal = tasks.split("\\s+", 3);
                taskNumber = deal[1];
                nameOfTask = deal[2];

                if (Integer.parseInt(taskNumber) > toDoList.size())
                {
                    toDoList.add(nameOfTask);
                }
                else
                {
                    toDoList.add(Integer.parseInt(taskNumber), nameOfTask);
                }
            }
            else if (tasks.matches("DELETE\\s\\d"))
            {
                String[] deal = tasks.split("\\s+", 2);
                deleteTask = deal[1];
                toDoList.remove(Integer.parseInt(deleteTask));

            }
            else if (tasks.matches("EDIT\\s\\d\\s.+"))
            {
                String[] deal = tasks.split("\\s+", 4);
                taskNumber = deal[1];
                editName = deal[2];
                toDoList.remove(Integer.parseInt(taskNumber));
                toDoList.add(Integer.parseInt(taskNumber), editName);
            }
            else
             System.out.println("Я вас не понимапю");


        }
    }
}