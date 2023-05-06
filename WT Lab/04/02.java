import java.util.Scanner;
class evenodd{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a[] = new int[20];
		System.out.println("Enter 20 numbers:- ");
		for (int i = 0; i < 20; i++) {
			a[i] = input.nextInt();
		}
		for (int i = 0; i < 20; i++) {
			if (a[i]%2==0) {
				System.out.println(a[i]+" - even");
			} else {
				System.out.println(a[i]+" - odd");
			}
		}
	}
} 
