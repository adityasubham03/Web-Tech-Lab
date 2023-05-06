import java.util.Scanner;
class test{
	public static void main(String[] args){
		// System.out.println("Hello World!");
		// int a;
		// a = 5;
		// System.out.println(a);

		// byte range; // range from -128 to 127
		// range = 100;
		// System.out.println(range);
		
		// short range1;// range from -32768 to 32767
		// range1 = 32766;
		// System.out.println(range1);
		
		// int range2;  // range from -2^31 to 2^(31)-1
		// range2 = 456;
		// System.out.println(range2);

		// long range3; // range from -2^63 to 2^(63)-1
		// range3 = 567890876;		
		// System.out.println(range3);

		// double range5;//precision is of 64 bits
		// range5 = 74387.34234;
		// System.out.println(range5);

		// float range6;//precision is of 32 bits
		// range6 = 67.78f;
		// System.out.println(range6);

		// char s;//stores single character
		// s = 65;// in ascii
		// s = '\u0000'; //in unicode characters
		// System.out.println(s);

		// String str;
		// str = "Aditya Choudhury";
		// System.out.println("Hello I am");
		// System.out.println(str);

		// //arithematic operator
		// a = 5 + 2; //addition operator returns the sum
		// System.out.println(a);

		// a = 5 - 2; //subtraction operator returns the difference
		// System.out.println(a);

		// a = 5 * 2; //multiplication operator returns the product
		// System.out.println(a);

		// int b = 5 / 2; //division operator returns the quotient
		// System.out.println(b);

		// b = 5 % 2; //modulo operator returns the remainder
		// System.out.println(b);


		// //assignment operator
		// a = b;
		// System.out.println(a);

		// a+=b; // a = a + b
		// System.out.println(a);

		// a-=b; // a = a - b
		// System.out.println(a);

		// a/=b; // a = a / b
		// System.out.println(a);

		// a*=b; // a = a * b
		// System.out.println(a);

		// a%=b; // a = a % b
		// System.out.println(a);



		// a = 7 ; b = 11;

		// //relational operators
		// System.out.println("a is " + a + " and b is " + b);

		// // == operator
		// System.out.println(a == b);  // false

		// // != operator
		// System.out.println(a != b);  // true

		// // > operator
		// System.out.println(a > b);  // false

		// // < operator
		// System.out.println(a < b);  // true

		// // >= operator
		// System.out.println(a >= b);  // false

		// // <= operator
		// System.out.println(a <= b);  // true
								


		// //logical operators
		// // && operator
		// System.out.println((5 > 3) && (8 > 5));  // true
		// System.out.println((5 > 3) && (8 < 5));  // false

		// // || operator
		// System.out.println((5 < 3) || (8 > 5));  // true
		// System.out.println((5 > 3) || (8 < 5));  // true
		// System.out.println((5 < 3) || (8 < 5));  // false

		// // ! operator
		// System.out.println(!(5 == 3));  // true
		// System.out.println(!(5 > 3));  // false
								


		// //Increment & Decrement Operators
		// a = 12 ; b = 12;
		// int result1, result2;

		// // original value
		// System.out.println("Value of a: " + a);

		// // increment operator
		// result1 = ++a;
		// System.out.println("After increment: " + result1);

		// System.out.println("Value of b: " + b);

		// // decrement operator
		// result2 = --b;
		// System.out.println("After decrement: " + result2);


		// //Instance Of Operator
		// String str1 = "Aditya";
		// boolean result;

		// // checks if str is an instance of
		// // the String class
		// result = str1 instanceof String;
		// System.out.println("Is str1 an object of String? " + result);



		// //Ternary Operator
		// int februaryDays = 29;
		// String results;
		// // ternary operator
		// results = (februaryDays == 28) ? "Not a leap year" : "Leap year";
		// System.out.println(results);


		// //print and println
		// System.out.println("1. println ");
        // System.out.println("2. println ");
    	
        // System.out.print("1. print ");
        // System.out.print("2. print");

		// //concatenation of String
		// Double number = -10.6;
    	
        // System.out.println("I am " + "awesome.");
        // System.out.println("Number = " + number);



		// //Inputs In Java
		// Scanner input = new Scanner(System.in);
    	
        // System.out.print("Enter an integer: ");
        // int number1 = input.nextInt();
        // System.out.println("You entered " + number1);

		// // Getting float input
        // System.out.print("Enter float: ");
        // float myFloat = input.nextFloat();
        // System.out.println("Float entered = " + myFloat);
    	
        // // Getting double input
        // System.out.print("Enter double: ");
        // double myDouble = input.nextDouble();
        // System.out.println("Double entered = " + myDouble);
    	
        // // Getting String input
        // System.out.print("Enter text: ");
        // String myString = input.next();
		// System.out.println("Text entered = " + myString);
		int result = 5 / 0;
		System.out.println(result);
	}
}
