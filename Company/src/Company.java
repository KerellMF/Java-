import java.util.*;

public class Company {
    public ArrayList<Employee> employees = new ArrayList<>();

    public int maxEmployee = 270;
    public double income = 0;

    public boolean hire(Employee worker)
    {
        if(employees.size() < maxEmployee) {
            employees.add(worker);
            return true;
        }
        else {
            System.out.println("У вас максимальное кол-во сотрудников");
            return false;
        }
    }

    public void hireAll(List<Employee> workers)
    {
        employees = (ArrayList<Employee>) workers;
    }

    public double calculateIncome()
    {
        income = 0;

        for (int i = 0; i < employees.size(); i++) {

            Employee emp = employees.get(i);

            income += emp.getSales();
        }
        for (Employee worker : employees) {
            worker.getMonthSalary(income);
        }

        return income;
    }

    public double getIncome()
    {
        return income;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        ArrayList<Employee> highSalary = new ArrayList<>();
        highSalary.addAll(employees);
        highSalary.sort(comparatorMax);

        List<Employee> sortedSalary = highSalary.subList(0, count);

        return sortedSalary;
    }

    public List<Employee> getLowerSalaryStaff(int count) {
        ArrayList<Employee> lowSalary = new ArrayList<>();
        lowSalary.addAll(employees);
        lowSalary.sort(comparatorMin);

        List<Employee> sortedSalary = lowSalary.subList(0, count);

        return sortedSalary;
    }

    Comparator comparatorMax = new Comparator() {
        @Override
        public int compare(Object obj, Object obj2) {
            Employee emp = (Employee) obj;
            Employee emp2 = (Employee) obj2;

            if (emp.getMonthSalary(income) > emp2.getMonthSalary(income))
                return -1;
            else if (emp.getMonthSalary(income) < emp2.getMonthSalary(income))
                return 1;
            else
                return 0;
        }
    };

    Comparator comparatorMin = new Comparator() {
        @Override
        public int compare(Object obj, Object obj2) {
            Employee emp = (Employee) obj;
            Employee emp2 = (Employee) obj2;

            if (emp.getMonthSalary(income) > emp2.getMonthSalary(income))
                return 1;
            else if (emp.getMonthSalary(income) < emp2.getMonthSalary(income))
                return -1;
            else
                return 0;
        }
    };

}
