import java.util.Scanner;

class test{
	public static void main(String[] args){
		int a;
		boolean n = true;
		Scanner scan = new Scanner(System.in);
		while(n){
			System.out.print("Enter a number:- ");
			a = scan.nextInt();
			if(a!=892){
				for(int i=1;i<=10;i++){
					System.out.println(a+"x"+i+"="+i*a);
				}
			}
			else{
				n = false;
			}
		}
		scan.close();
	}	
}
