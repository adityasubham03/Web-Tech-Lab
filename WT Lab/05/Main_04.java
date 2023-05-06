import java.util.Scanner;
class rectangle{
	private float length, breadth;
	rectangle(){
		System.out.println("Enter the length breadth of the rectangle:- ");
		length = Main_04.input.nextFloat();
		breadth = Main_04.input.nextFloat();
	}

	void perimeter(){
		float perimeter = 2*(length+breadth);
		System.out.println("The perimeter of the rectangle is:- "+perimeter);
	}

	void area(){
		float area = length*breadth;
		System.out.println("The area of the rectangle is:-"+area);
	}
}

class Main_04 {
	static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		rectangle r1 = new rectangle();
		int choice;
		System.out.printf("1. Perimeter \n 2. Area");
		choice = input.nextInt();
		if(choice==1) r1.perimeter();
		else if(choice==2) r1.area();
		else System.out.println("Enter a valid choice!!!");
	}
}
