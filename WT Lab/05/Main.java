import java.util.Scanner;

class box{
	Scanner input = new Scanner(System.in);
	private float length,width,height;
	box(){
		System.out.println("Enter the length width height of the box:- ");
		length = input.nextFloat();
		width = input.nextFloat();
		height = input.nextFloat();
	}
	void volume(){
		System.out.println("The volume of the box is "+length*width*height);
	}
}

class Main{
	public static void main(String[] args) {
		box a = new box();
		a.volume();
	}
}

