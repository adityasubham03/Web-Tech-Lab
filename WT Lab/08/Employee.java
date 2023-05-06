// Employee.java

package company;

public class Employee {
    protected int emp_id;
    private String ename;
    protected double basic;

    public Employee(int emp_id, String ename, double basic) {
        this.emp_id = emp_id;
        this.ename = ename;
        this.basic = basic;
    }

    public double earnings() {
        double da = 0.8 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }
}
