public class Main_01 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[3] = 4; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
