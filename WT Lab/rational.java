class rationalnumber {
    double num, den;

    public rationalnumber(double num, double den) {
        this.num = num;
        this.den = den;
    }
    
    rationalnumber add(rationalnumber r1, rationalnumber r2) {
        rationalnumber temp = new rationalnumber((r1.num * r2.den + r2.num * r1.den), (r1.den * r2.den));
        return temp;
    }
    
    void show() {
        System.out.println("The rational number is:- "+num+"/"+den);
    }
}

public class rational {
    public static void main(String[] args) {
        rationalnumber r1 = new rationalnumber(5, 6);
        r1.show();
        rationalnumber r2 = new rationalnumber(2, 4);
        r2.show();

        r1 = r1.add(r1, r2);
        r1.show();
    }
}
