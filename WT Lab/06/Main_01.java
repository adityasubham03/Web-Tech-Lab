import java.util.Scanner;
class TwoDimensional {
    private double length;
    private double width;

    public TwoDimensional(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double cost() {
        return area() * 40;
    }
}

class ThreeDimensional extends TwoDimensional {
    private double height;

    public ThreeDimensional(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double volume() {
        return super.area() * height;
    }

    public double cost() {
        return volume() * 60;
    }
}

public class Main_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of the plastic: ");
        double length = input.nextDouble();

        System.out.print("Enter width of the plastic: ");
        double width = input.nextDouble();

        System.out.print("Enter height of the plastic (for 3D only): ");
        double height = input.nextDouble();

        if (height > 0) {
            ThreeDimensional plastic = new ThreeDimensional(length, width, height);
            System.out.println("Cost of plastic: Rs." + plastic.cost());
        } else {
            TwoDimensional plastic = new TwoDimensional(length, width);
            System.out.println("Cost of plastic: Rs." + plastic.cost());
        }
		input.close();
    }
}
