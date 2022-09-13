package Module3;
import java.util.*;

public class StudentRecord2 {
	public static void main (String[] args)
    {
        ArrayList<Learner> arr = new ArrayList<Learner>();
        
        arr.add(new Learner(1234567, "Python", "US"));
        arr.add(new Learner(1234566, "Java", "India"));
        arr.add(new Learner(1234562, "Python for Data Science", "Australia"));
        arr.add(new Learner(1234563, "Python for ML", "US"));
        arr.add(new Learner(1234561, "Data Science using R", "UK"));
        arr.add(new Learner(1234564, "Business Analytics", "Italy"));
        arr.add(new Learner(1234565, "R", "Rome"));
        
        System.out.println("Data before sorting...");
        for (int i=0; i<arr.size(); i++)
            System.out.println(arr.get(i));
        
        //Data after sorting
        Collections.sort(arr, new Sortbyrollno());
        System.out.println("Data after sorting...");
        for (int i=0; i<arr.size(); i++)
            System.out.println(arr.get(i));
    }
}
//Class which represents enrolled Student data
class Learner
{
	int rollno;
	String courseName;
	String location;
	//Learner class Constructor
	public Learner(int rollno, String courseName, String location)
	{
		this.rollno = rollno;
		this.courseName = courseName;
		this.location = location;
	}
	//Printing Learners data
	public String toString()
	{
		return this.rollno + " " + this.courseName + " " + this.location;
	}
}
class Sortbyrollno implements Comparator<Learner>
{
	//sorting in ascending order of roll number
	public int compare(Learner a, Learner b)
	{
		return a.rollno - b.rollno;
	}
}
