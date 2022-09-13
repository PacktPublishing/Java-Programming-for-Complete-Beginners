package Module3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRecord implements Comparable{
	String name;
	int rollNumber;
	String address;
	
	// constructor to initialize student name, roll number and address
	StudentRecord(String name, int rollNumber, String address){
		this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
	}
	
	// formatting roll number, name and address
	public String toString()
    {
        return this.rollNumber + "," + this.name + "," + this.address;
    }
	
	public static void main(String[] args) {
		List stud = new ArrayList();
		
		// adding student records here
		stud.add(new StudentRecord("Lahari", 27922125, "Bangalore"));
		stud.add(new StudentRecord("Amulya", 27922123, "Bangalore"));
		stud.add(new StudentRecord("Madhavi", 27922122, "Chennai"));
		stud.add(new StudentRecord("MadhuBabu", 27922126, "Bangalore"));
		stud.add(new StudentRecord("Varahalu", 27922124, "Rajahmundry"));
		stud.add(new StudentRecord("Sarojini", 27922121, "Rajahmundry"));
		stud.add(new StudentRecord("Hema Satish", 27922127, "Hyderabad"));
		
		// sorting the student data
		Collections.sort(stud);
		//System.out.println("The list after sorting : ");
		//System.out.println(stud);
		
		// sorting by roll number
		System.out.println("After sorting by roll number\n");
		for (int i=0; i<stud.size(); i++)
            System.out.println(stud.get(i));

	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.rollNumber - ((StudentRecord)o).rollNumber;
		
	}
}
