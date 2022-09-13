package Demo;

public class Controller {
	public static MongoDB mgdb;
	public static S3 s3;
	public static DynamoDB ddb;
	
	private static DatabaseConnection conn;
	
	Controller(){
		mgdb = new MongoDB();
		s3 = new S3();
		ddb = new DynamoDB();
	}
	
	public void setMongoDBConnection() {
		conn = mgdb;
	}
	
	public void setS3Connection() {
		conn = s3;
	}
	
	public void setDynamoDB() {
		conn = ddb;
	}
	
	public void connect() {
		conn.connect();
	}

	public void close() {
		conn.close();
	}
}
