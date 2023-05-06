// Main.java

import company.Employee;
import marketing.Sales;

public class Main_01 {
    public static void main(String[] args) {
        Sales s = new Sales(1, "John", 5000);
        double totalEarnings = s.earnings() + s.totalAllowances();
        System.out.println("Total earning of sales person is: " + totalEarnings);
    }
}
