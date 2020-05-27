package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("TESTING");
		ll.add("QTP");
		ll.add("Selenium");
	
		System.out.println(ll);
		
		//	AddFirst method
	
		ll.addFirst("JAVA");
		System.out.println(ll);

		//	AddLast method
	
		ll.addLast("Automation");
	
		System.out.println(ll);
		
		List<String> newLL = new LinkedList<String>();
		newLL.addAll(ll);
		
		// get and Set the value
		
		System.out.println(ll.get(3));
		
		ll.set(2, "JAVASCRIPT");
		System.out.println(ll);
		
		// Remove first and Last element
		
		ll.removeFirst();
		System.out.println(ll);

		ll.removeLast();
		System.out.println(ll);

		// remove from specific postion i.e index
		
		ll.remove(2);
		System.out.println(ll);
		
		// how to iterate 
		//1. Lambda
		
		System.out.println("******* LAMBDA **********");

		newLL.forEach(items -> {
			System.out.println(items);
			});
		
		//2. Advance for loop
		
		System.out.println("******* Advance for loop **********");

		
		for(String lang : newLL) {
			System.out.println(lang);
		}
		
		//3. Iterator
		
		System.out.println("******* Iterator **********");

		
		Iterator<String> it = newLL.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//4. while loop

		System.out.println("******* while Loop **********");

		
		int i = 0;
		while(newLL.size()>i)
		{
			System.out.println(newLL.get(i));
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
