package Demo;

public class ExceptionHandlingProgram {
	public static void main(String[] args){
		System.out.println("Exception handling program starts here...");
		
		try {
			// the below line triggers division by zero error
			float x = 10 / 2; // terminates at this point without excepiton handling
			System.out.println("Value of x after division is: "+x);
			// Arrayindexoutofbounds exception
			int arr[] = {10,20,30};
			//System.out.println(arr[10]);
			
			String s = null;
			System.out.println(s.length());
		}
		catch(ArithmeticException e) {
			System.out.println("user seem to have provided denominator value as zero for division which is not acceptable");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("User seem to be accessing outside array locations");
			System.out.println("Error from Java Exception handling engine: "+ e);
		}
		//catch(NullPointerException e) {
		//	System.out.println("User seem to be applying operations on null values");
		//	System.out.println("Error from Java excepiton handling engine: " + e);
		//}
		catch(Exception e) {
			System.out.println("Some error please check");
			System.out.println("error from java: "+ e);
		}
		
		System.out.println("Exception handling program ends here...");
	}
}
