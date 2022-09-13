package Module3;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> ll =new LinkedList<String>();  
		
		// adding elements to linked list
		ll.add("one");
		ll.add("two");
		ll.add("three");
		ll.add("four");
		ll.add("five");
		ll.add("three");
		ll.add("four");
		ll.add("five");
		ll.add("three");
		ll.add("four");
		ll.add("four");
		
		System.out.println("\nElements in linked list: "+ll);
		
		Iterator it = ll.iterator();
		// printing elements from linked list
		System.out.println("\nPrinting each element from linked list");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// printing elements in reverse order
		it = ll.descendingIterator();
		System.out.println("\nPrinting each element in reverse order from linked list");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// remove first element from the linked list
		System.out.println("\nElements in linked list: "+ll);
		ll.removeFirst();
		System.out.println("After removing first element: "+ll);
		
		// remove last element from the linked list
		System.out.println("\nElements in linked list: "+ll);
		ll.removeLast();
		System.out.println("After removing last element: "+ll);
		
		// remove first occurrence of element from linked list
		System.out.println("\nElements in linked list: "+ll);
		ll.removeFirstOccurrence("four");
		System.out.println("Remove first occurrence of element in linked list: "+ll);
		
		// remove last occurrence of element from linked list
		System.out.println("\nElements in linked list: "+ll);
		ll.removeLastOccurrence("three");
		System.out.println("After removing last occurrence of element in linked list: "+ll);
		
		
		// clearing the linked list
		ll.clear();
		System.out.println("\nElements in linked list: "+ll);
		
	}
}
