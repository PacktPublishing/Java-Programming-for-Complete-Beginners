package Demo;

import java.util.*;
import java.util.function.*;

class MyConsumer<T> implements Consumer<T>{

	@Override
	public void accept(T t) {
		// TODO Auto-generated method stub
		System.out.println("Working on the given number: "+ t);
		System.out.println("Result after adding 100 to the given number is: "+ ((int)t + 1500));
	}
}

public class UtilityPackageDemo1 {
	public static void main(String[] args) {
		//declaring variables here 
		ArrayList myList;
		MyConsumer mcons;
		
		// initializing array list variable here
		myList = new ArrayList<>(5);
		
		// initializing mycons variable here
		mcons = new MyConsumer();
		
		// filling myList elements here
		myList.add(100);
		myList.add(200);
		myList.add(300);
		myList.add(400);
		myList.add(500);
		
		System.out.println(myList);
		myList.forEach(mcons);
		
		
		
		
	}

}
