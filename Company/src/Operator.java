public class Operator implements Employee
{
    @Override
    public double getMonthSalary(double income) {
        return  20000;
    }

    @Override
    public double getSales() {
        return 0;
    }

    @Override
    public int compareTo(Employee employee) {
        return 0;
    }
}
