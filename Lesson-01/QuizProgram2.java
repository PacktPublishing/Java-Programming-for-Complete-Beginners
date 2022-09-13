package Demo;

import java.util.Scanner;

public class QuizProgram2 {
	public static void main(String[] args) {
		// declaring variables here
		int n;
		
		// creating scanner object here
		Scanner sc = new Scanner(System.in);
		
		// running infinite loop
		while (true) {
			// Displaying the set of quiz options
			System.out.println("Who is the founder of Blue Origin? ");
			System.out.println("1. Bill gates\n2. Tim cook\n3. Nadella\n4. Jeff Bezos\n5. Exit program");
			
			// reading input from user
			System.out.println("Enter your choice(1/2/3/4/5)? ");
			n = sc.nextInt();
			
			// validating user choices
			if ( n == 4 ) {
				System.out.println("Congratulations !! You have guessed the correct answer");
				break;
			}
			else if ( n == 5 ) {
				break;
			}
			else {
				System.out.println("Wrong choice. please try again");
			}
			
		}
		
	}
}
