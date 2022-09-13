package Demo;

public class S3 implements DatabaseConnection{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to S3 store...");
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Closing the S3 store connection...");
	}

}
