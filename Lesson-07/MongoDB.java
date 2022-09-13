package Demo;

public class MongoDB implements DatabaseConnection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connnecting to MongoDB database...");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Closing the MongoDB connection...");
	}

}
