package MapConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import ListConcept.Employee;

public class HashMapConcept {

	public static void main(String[] args) {

		// HashMap is a class which implement Map interface
		// extends Abstarctmap
		// it contains only unique element
		// it stores values in form of Key and value pair
		// it may have 1 null key and multiple null values
		// it maintains no order, we can get value from key

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TEST");
		hm.put(4, "TestComplete");
		
		System.out.println(hm.get(2));
		System.out.println(hm.get(5));
		
		// for printing all values
		
		for(Entry m : hm.entrySet())
		{
			System.out.println(m.getKey() + "   " + m.getValue());
		}
		
		// for remove
		
		hm.remove(2);
		
		System.out.println(hm);
		
		//Store Objecj - will use Employee class
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Tom",25,"QA");
		Employee e2 = new Employee("Peter",25,"admin");
		Employee e3 = new Employee("Steve",25,"HR");

		
		emp.put(1,e1);
		emp.put(2, e2);
		emp.put(3,e3);

		// traverse the hashmap
	//	HashMap<Integer, Employee> m1 = new HashMap<Integer, Employee>();

		for(Entry<Integer, Employee> m1 : emp.entrySet())
		{
			int key = m1.getKey();
			Employee e = m1.getValue();
			
			System.out.println("Employee "+ key + "Info:");
			System.out.println(e.name +""+ e.age +" "+e.dept);
					
		}
		
	}
}
