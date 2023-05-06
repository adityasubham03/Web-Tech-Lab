// Sales.java

package marketing;
import company.Employee;

public class Sales extends Employee {
    public Sales(int emp_id, String ename, double basic) {
        super(emp_id, ename, basic);
    }

    public double totalAllowances() {
        double totalEarnings = earnings();
        return 0.05 * totalEarnings;
    }
}
