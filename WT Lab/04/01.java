import java.util.Scanner;
class largest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a,b,c;
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		int largest = a;
		if (b>largest) largest = b;
		if (c>largest) largest = c;
		System.out.println("The largest among three is "+largest);
	}
}
