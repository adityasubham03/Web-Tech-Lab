import java.util.Scanner;

class circle{
	private float rad;
	circle(float radius){
		rad = radius;
	}

	void area(){
		float area = (22/7)*rad*rad;
		System.out.println("The area of the circle with radius "+rad+" is "+area);
	}
}

class square{
	private float side;
	square(float a){
		side=a;
	}

	void area(){
		float area = side*side;
		System.out.println("The area of the square with side "+side+" is "+area);
	}
}

class triangle{
	private float base,height;
	triangle(float b, float h){
		base = b;
		height = h;
	}

	void area(){
		float area = base*height*(1/2);
		System.out.println("The area of the triangle with base "+base+" and height "+height+" is "+area);
	}
}


public class Main_05{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter \n 1. Circle \n 2. Square \n 3. Triangle \n Enter your choice:- ");
		int choice = input.nextInt();
		if (choice==1){
			System.out.println("Enter the radius of the circle:- ");
			float rad = input.nextFloat();
			circle c = new circle(rad);
			c.area();
		} else if (choice==2){
			System.out.println("Enter the side of the square:- ");
			float side = input.nextFloat();
			square s = new square(side);
			s.area();
		}else if (choice==3){
			System.out.println("Enter the base and height of the square:- ");
			float base = input.nextFloat();
			float height = input.nextFloat();
			triangle t = new triangle(base, height);
			t.area();
		}else{
			System.out.println("Please enter correct choice!!!");
		}
		input.close();
	}
}
