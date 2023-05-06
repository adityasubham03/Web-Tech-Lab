import java.util.Scanner;

public class Main_03{
		static void area(float rad,double pi){
			double area = pi*rad*rad;
			System.out.println("The area of the circle is "+ area);
		}

		static void area(float side){
			float area = side*side;
			System.out.println("The area of the square is "+ area);
		}

		static void area(float b,float h,double half){
			double area = half*b*h;
			System.out.println("The area of the triangle is "+ area);
		}
		
		public static void main(String[] args){
			area(4);
			area(4,3.14);
			area(4,4,0.5);
		}
}
