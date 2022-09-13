package Demo;

import java.util.Scanner;

public class StudentMark {
	public static void main(String[] args) {
		// declaring and initializing variables here
		Scanner sc = new Scanner(System.in);
		float physics_marks, chemistry_marks, maths_marks;
		
		// here we are reading marks from the user
		System.out.println("Enter physics marks out of 100? ");
		physics_marks = sc.nextFloat();
		System.out.println("Enter chemistry marks out of 100? ");
		chemistry_marks = sc.nextFloat();
		System.out.println("Enter maths marks out of 100? ");
		maths_marks = sc.nextFloat();
		
		// getting total marks here
		float total_marks = getTotalMarks(physics_marks, chemistry_marks, maths_marks);
		System.out.println("Total marks of the student out of 300 is: "+ total_marks);
		
		float percentage_marks = getPercent(physics_marks, chemistry_marks, maths_marks);
		System.out.println("Percentage of marks obtained is: "+ String.format("%.2f", percentage_marks));
		
		String grade = getGrade(percentage_marks);
		System.out.println("Grade of the student is: "+ grade);
		
	}

	public static String getGrade(float percentage) {
		// method to calculate grade 
		
		// throwing the error if percentage is above 100 or below 0
		if (percentage > 100 || percentage < 0) {
			throw new ArithmeticException("Invalid Percentage Error");
		}
		
		if ( percentage >= 80 ) {
			return "A+";
		}
		else if ( percentage >= 60 && percentage <= 79 ) {
			return "A";
		}
		else if ( percentage >= 50 && percentage <= 59 ) {
			return "B";
		}
		else {
			return "C";
		}
	}

	public static float getPercent(float physics_marks, float chemistry_marks, float maths_marks) {
		// method to calculate percentage of marks
		
		if (physics_marks > 100 || chemistry_marks > 100 || maths_marks > 100) {
			throw new ArithmeticException("Invalid Marks Error");
		}
		
		else if (physics_marks < 0 || chemistry_marks < 0 || maths_marks < 0) {
			throw new ArithmeticException("Invalid Marks Error");
		}
		
		float marks_total = physics_marks + chemistry_marks + maths_marks;
		float percentage = (marks_total / 300) * 100;
		
		return percentage;
	}

	public static float getTotalMarks(float physics_marks, float chemistry_marks, float maths_marks) {
		// method to calculate total marks
		
		if (physics_marks > 100 || chemistry_marks > 100 || maths_marks > 100) {
			throw new ArithmeticException("Invalid Marks Error");
		}
		
		else if (physics_marks < 0 || chemistry_marks < 0 || maths_marks < 0) {
			throw new ArithmeticException("Invalid Marks Error");
		}
		
		float marks_total = physics_marks + chemistry_marks + maths_marks;
		
		return marks_total;
	}
}
