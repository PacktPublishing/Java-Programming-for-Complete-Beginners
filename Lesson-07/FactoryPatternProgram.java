package Demo;

import java.util.Scanner;

public class FactoryPatternProgram {
	public static void main(String[] args) {
		// setting the input stream
		Scanner sc = new Scanner(System.in);
		
		// creating Factory Controller for Netflix
		NetflixPlanFactory planFactory = new NetflixPlanFactory();
		
		// Taking user subscription choice
		System.out.println("Enter your subscription plan? ");
		String user_choice = sc.next();
		
		// Taking number of months user want to subscribe the plan for 
		System.out.println("Enter for how many months you want to subscribe the plan for? ");
		int n = sc.nextInt();
		
		// setting the plan user has chosen
		NetflixPlan plan = planFactory.getPlan(user_choice);
		
		// printing the monthly price and overall bill amount details
		System.out.println("Monthly bill amount for the plan is: "+ plan.getPrice());
		System.out.println("Overall bill amount for the plan is: "+ plan.getFinalAmount(n));
	
	}

}
