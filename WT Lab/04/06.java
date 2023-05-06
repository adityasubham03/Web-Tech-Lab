import java.util.Scanner;
class matrix{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the number of rows columns:- ");
		int n = input.nextInt();
		int[][] arr = new int[n][n];
		System.out.println("Enter the matrix elements:- ");
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++){
				arr[i][j] = input.nextInt();
			}
		}
		int diag1=0,diag2=0;
		for (int i = 0; i < n; i++){
			diag1+=arr[i][i];
			diag2+=arr[i][n-i-1];
		}
		System.out.println("The sum of the principal diagonal of a matrix is "+diag1);
		System.out.println("The sum of the secondary diagonal of a matrix is "+diag2);
	}
}
