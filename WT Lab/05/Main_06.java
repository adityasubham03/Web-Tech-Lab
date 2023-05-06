import java.util.Scanner;


class number{
	private int[] arr;
	int smallest, largest;
	Scanner input = new Scanner(System.in);
	number(int n){
		arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = input.nextInt();
			if(i==0){
				smallest = 0;
				largest = 0;
			}
			if(arr[i]>arr[largest]) largest = i;
			if(arr[i]<arr[smallest]) smallest = i;
		}
	}

	void swap(){
		int temp = arr[smallest];
		arr[smallest] = arr[largest];
		arr[largest] = temp;
	}

	void display(){
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
	}

}



public class Main_06{
	public static void main(String[] args) {
		number n1 = new number(5);
		n1.display();
		n1.swap();
		n1.display();
	}
}
