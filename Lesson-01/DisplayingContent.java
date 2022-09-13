package Demo;

import java.util.Scanner;

public class DisplayingContent {
	public static void main(String[] args) {
		// Factorial program example
		// 3! = 1 * 2 * 3 = 6
		// 5! = 1 * 2 * 3 * 4 * 5 = 120
		
		// Declaring variables here
		int n;
		int fact_var = 1;
		
		// creating scanner object here
		Scanner sc = new Scanner(System.in);
		
		// reading input from the user
		System.out.println("Enter a number? ");
		n = sc.nextInt();
		
		// calculating factorial 
		//for(int i = 1; i <= n; i++) {
		//	fact_var = fact_var * i; // fact_var = 6
		//}
		int i = 1; // initial value
		while ( i <= n ) { // terminating condition
			fact_var *= i; // fact_var = fact_var * i 
			i++; // i = i + 1 // step value
		}
		
		// displaying the factorial here
		System.out.println("Factorial of the number "+n+" is: "+fact_var);
		
	}

}
