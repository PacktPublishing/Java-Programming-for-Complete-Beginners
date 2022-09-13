package Demo;

public class DynamoDB implements DatabaseConnection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to DynamoDB store...");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Closing the DynamoDB connection...");
	}
	
}
