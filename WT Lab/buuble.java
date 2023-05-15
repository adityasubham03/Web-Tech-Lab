import java.util.Scanner;
public class buuble {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.println("Enter number of elements:- ");
        n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        // Printing the array
        System.out.print("Before Swapping:- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //Bubble sort starts here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //Bubble Sort ends here
        // Printing the array
        System.out.print("After Swapping:- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
