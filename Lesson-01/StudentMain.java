package Demo;

import java.util.Scanner;

class Student{
	int regNumber;
	String studentName;
	
	Student(int reg_no, String name){
		this.regNumber = reg_no;
		this.studentName = name;
	}
}

public class StudentMain {
	public static void main(String[] args) {
		// creating scanner object here
		Scanner sc = new Scanner(System.in);
		
		// declaring an array list of Students
		Student[] arr;
		int n;
		
		System.out.println("Enter how many students you want to create? ");
		n = sc.nextInt();
		
		
		// setting the size of Student array
		arr = new Student[n];
		
		// initializing the student array with registtation number and name
		/*
		arr[0] = new Student(1, "Manish");
		arr[1] = new Student(2, "Hari");
		arr[2] = new Student(3, "Avinash");
		arr[3] = new Student(4, "Rakesh");
		arr[4] = new Student(5, "Divya");
		arr[5] = new Student(6, "Jatin");
		arr[6] = new Student(7, "Ramesh");
		arr[7] = new Student(8, "Hitesh");
		arr[8] = new Student(9, "Ram");
		arr[9] = new Student(10, "Sunil");
		*/
		
		for(int i = 0; i < n; i++) {
			arr[i] = new Student(i+1, "Student" + (i+1));
		}
		// printing the eleemnts available in array
		// i.e object addresses inside each array location
		System.out.println(arr);
		System.out.println(arr.length);
		for(int i = 0 ; i < arr.length; i++) {
			System.out.println(i + "=> " + arr[i]);
		}
		
		// printing the registration number and name of each object stored in array locations
		System.out.println("Student details by their registration number are: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].regNumber + " " + arr[i].studentName);
		}
	}

}
