import java.util.Scanner;

public class Main_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // get user input
        System.out.print("Enter a string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter another string: ");
        String str2 = sc.nextLine();
        
        // change the case of a string
        String str1LowerCase = str1.toLowerCase();
        String str1UpperCase = str1.toUpperCase();
        System.out.println("Lower case string: " + str1LowerCase);
        System.out.println("Upper case string: " + str1UpperCase);
        
        // compare 2 strings
        if (str1.equals(str2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        
        // reverse the string
        String reversedString = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reversedString += str1.charAt(i);
        }
        System.out.println("Reversed string: " + reversedString);
        
        // insert one string into another string
        System.out.print("Enter a string to insert into the first string: ");
        String strToInsert = sc.nextLine();
        System.out.print("Enter the index at which to insert the string: ");
        int indexToInsert = sc.nextInt();
        String newString = str1.substring(0, indexToInsert) + strToInsert + str1.substring(indexToInsert);
        System.out.println("New string after insertion: " + newString);
        
        sc.close();
    }
}
