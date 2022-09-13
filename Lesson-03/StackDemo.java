package Module3;

import java.util.Stack;
import java.util.Scanner;

public class StackDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		
		// Adding elements to stack
		stack.push("First");
		stack.push("Second");
		stack.push("Third");
		stack.push("Fourth");
		stack.push("Fifth");
		
		System.out.println("Iniitial Stack");
		System.out.println(stack);
		
		System.out.println("Enter a string to check? ");
		String usr_string = sc.next();
		
		// uncomment the below line to see stack.search value returns
		//System.out.println(stack.search(usr_string));
		// checking if element exists in stack
		if (stack.search(usr_string) != -1) {
			System.out.println("Given string " + usr_string + " exists in the stack");
		}
		else {
			System.out.println("Given string "+ usr_string + " does not exists in the stack");
		}
		
		System.out.println("Getting top element from the stack: "+ stack.peek());
		System.out.println(stack);
		
		// removing elements from stack
		stack.pop();
		stack.pop();
		System.out.println("Stack after popping two elements");
		System.out.println(stack);
		
		// popping out elements from stack until there are no elements
		while(! stack.empty()) {
			stack.pop();
			System.out.println("Stack after popping one element: " + stack);
		}
	}	
}
