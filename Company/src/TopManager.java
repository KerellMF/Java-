public class TopManager implements Employee
{
    @Override
    public double getMonthSalary(double income) {
        if(income >= 1000000) {

            return 35000 + (20000 * 150 / 100);
        }
        return 20000;
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
