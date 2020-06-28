public class Manager implements Employee
{
    private double contributionOfManager;

    public Manager()
    {
        int min = 115000;
        int max = 140000;

        contributionOfManager = ((max - min) * Math.random() + min);
    }

    public double getSales() {

        return contributionOfManager;
    }

    @Override
    public double getMonthSalary(double income) {
        return 25000 + (income / 100 * 5 );
    }

    @Override
    public int compareTo(Employee employee) {
        return 0;
    }
}