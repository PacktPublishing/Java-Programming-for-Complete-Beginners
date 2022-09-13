package Demo;

import java.util.Scanner;

public class StateProgramDemo {
	Controller controller;
	
	StateProgramDemo(String conn){
		controller = new Controller();
		
		if (conn.equalsIgnoreCase("mongodb")) {
			controller.setMongoDBConnection();
		}
		else if (conn.equalsIgnoreCase("s3")) {
			controller.setS3Connection();
		}
		else if (conn.equalsIgnoreCase("DynamoDB")) {
			controller.setDynamoDB();
		}
		
		controller.connect();
		controller.close();
	}
	
	
	public static void main(String[] args) {
		// initializes scanner for your input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the databse you want to connect? ");
		String dbName = sc.next();
		
		new StateProgramDemo(dbName);
		
	}

}
