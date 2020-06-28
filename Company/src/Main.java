import java.util.*;

public class Main
{
    public static boolean hireManager(Company company)
    {
        Employee worker = new Manager();
        return company.hire(worker);
    }

    public static boolean hireTopManager(Company company)
    {
        Employee worker = new TopManager();
        return company.hire(worker);
    }
    public static boolean hireOperator(Company company)
    {
        Employee worker = new Operator();
        return company.hire(worker);
    }

    public static void fire(int percent, Company company) {
        int fireWorkers =  company.employees.size() / 100 * percent;

        for(int i = 0; i < fireWorkers; i++) {
            company.employees.remove(new Random().nextInt(company.employees.size()));
        }
    }

    public static void showEmployees(List<Employee> employers , Company company) {
        for (Employee worker : employers) {
            System.out.println(worker + " " + worker.getMonthSalary(company.income));
        }
    }

    public static List<Employee> getEmployeeList(int operators, int managers, int topManagers)
    {
        ArrayList<Employee> employeeList = new ArrayList<Employee>();

        for (int i = 0; i < operators; i++)
        {
            employeeList.add(new Operator());
        }

        for (int i = 0; i < managers; i++)
        {
            employeeList.add(new Manager());
        }

        for (int i = 0; i < topManagers; i++)
        {
            employeeList.add(new TopManager());
        }

        return employeeList;
    }

    public static void main (String[] args)
    {
        Company company = new Company();

        company.hireAll(getEmployeeList(180,80, 10));

        company.calculateIncome();
        company.getIncome();

        System.out.println((long)company.getIncome());

        System.out.println("\n" + "Высокие зарплаты до увольнения: ");
        showEmployees(company.getTopSalaryStaff(15), company);
        System.out.println("\n" + "Низкие зарплаты до увольнения: ");
        showEmployees(company.getLowerSalaryStaff(30), company);

        fire(50, company);
        company.calculateIncome();
        System.out.println("\n " + (long)company.getIncome());

        System.out.println("\n" + "Высокие зарплаты после увольнения: ");
        showEmployees(company.getTopSalaryStaff(15), company);

        System.out.println("\n" +"Низкие зарплаты после увольнения: ");
        showEmployees(company.getLowerSalaryStaff(30), company);
    }
}

