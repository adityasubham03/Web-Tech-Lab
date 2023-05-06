import java.util.Scanner;
class palindrome{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = input.nextInt();
		int r,sum=0,temp=num;
		String result;
		while (num>0) {
			r = num%10;
			sum = (sum*10)+r;
			num/=10;
		}
		result = (temp==sum) ? "Palindrome" : "Not palindrome";
		System.out.println(result);
	}
}
