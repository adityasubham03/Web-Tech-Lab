
interface Employee {
    void earning(double basicSalary); 
    void deduction(double basicSalary); 
    void bonus(double basicSalary); 
}

abstract class Manager implements Employee {
    
    public void earning(double basicSalary) {
        double da = 0.8 * basicSalary;
        double hra = 0.15 * basicSalary;
        double earning = basicSalary + da + hra;
        System.out.println("Manager's Earning: " + earning);
    }

    public void deduction(double basicSalary) {
        double deduction = 0.12 * basicSalary;
        System.out.println("Manager's Deduction: " + deduction);
    }

}


class Substaff extends Manager {

    public void bonus(double basicSalary) {
        double bonus = 0.5 * basicSalary;
        System.out.println("Substaff's Bonus: " + bonus);
    }
}

public class Main_03 {
    public static void main(String[] args) {

        Substaff substaff = new Substaff();
        double basicSalary = 10000;

        substaff.earning(basicSalary);
        substaff.deduction(basicSalary);
        substaff.bonus(basicSalary);
    }
}
