import java.util.Scanner;
class names{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String fname,lname;
		System.out.println("Enter First Name:- ");
		fname = input.nextLine();
		System.out.println("Enter Last Name:- ");
		lname = input.next();
		System.out.println(lname+" "+fname);
	}
}
