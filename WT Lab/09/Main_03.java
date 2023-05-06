import java.util.Scanner;

public class Main_03 {
    
    public static void processInput() throws NegativeNumberException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (num < 0) {
            throw new NegativeNumberException("Entered number is negative!");
        } else {
            double doubleNum = (double) num;
            System.out.println("Double value of entered number: " + doubleNum);
        }
        
        sc.close();
    }
    
    public static void main(String[] args) {
        try {
            processInput();
        } catch (NegativeNumberException e) {
            System.out.println("Caught a NegativeNumberException: " + e.getMessage());
        }
    }
    static class NegativeNumberException extends Exception {
        public NegativeNumberException(String message) {
            super(message);
        }
    }
}
