import java.util.Scanner;
public class string {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String a = new String(input.nextLine());
        String b = new String();
        int n = a.length();
        for (int i = n-1; i >= 0; i--) {
            b += a.charAt(i);
        }
        if (a.equals(b))
            System.out.println("String is palindrome!!");
        else
            System.out.println("String is not a palindrome!!");
        
        StringBuffer s = new StringBuffer(a);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (s.charAt(j) < s.charAt(j + 1)) {
                    char x = s.charAt(j);
                    s.setCharAt(j, s.charAt(j + 1));
                    s.setCharAt(j + 1, x);
                }
            }
        }
        
        System.out.println(s);
    }
}
