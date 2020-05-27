package ListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListConcept {

	public static <T> void main(String[] args) {
	
		
		
		ArrayList<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(1);
		num.add(100);
		num.add(15);
		
		System.out.println(num.get(30));// indexoutofboundexception
		
		for(int i=0;i<num.size();i++)
		{
			System.out.println(num.get(i));
		}
		
		Collections.sort(num);
		for(int i=0;i<num.size();i++)
		{
			System.out.println(num.get(i));
		}
		
		
		int a[] = new int[3]; //static array -- size is fixed
		
		//dynamic array -- array list
		//1. can contaion duplicate values/elemenets
		//2. it will maintain insertion order
		//3. It is not syncronized
		//4. allow randon access to fetch the element  because it stores the values on the basis of indexes.
		
		ArrayList ar = new ArrayList();  // non generics array
		
		ar.add(10);
		ar.add(15);
		ar.add(20);
		
		System.out.println(ar.size()); // size of array list 
		
		ar.add(25);
		ar.add(30);
		ar.add(30);
		ar.add(true);
		ar.add("Mayank");
		ar.add(12.33);
		
		System.out.println(ar.size());
		System.out.println(ar.get(4)); // 30 (Point 4) to get the value from an index
		
		// to print all the values from arraylist : for loop
		
		//1. for loop
		//2. iterator
		
		//Collections.sort(ar);
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		// non generics vs generics  (Generics after jdk 1.5)
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(10);
	//	ar1.add("Selenium"); // The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (String)
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("Sle");
		// ar2.add(10); // The method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int)

		//ArrayList<T> ar3 = new ArrayList<T>(); // If we dont know what value I need to store.

	// Employee Class object :
		 Employee e1 = new Employee("Mayank", 30, "QA");
		 Employee e2 = new Employee("Mishra", 35, "Dev");
		 Employee e3 = new Employee("Tom", 30, "Admin");

		 //create arraylist
		 
		 ArrayList<Employee> ar4 = new ArrayList<Employee>();
		 ar4.add(e1);
		 ar4.add(e2);
		 ar4.add(e3);
		 
		 //Iterator to traverse the object
		 
		 Iterator<Employee> it =  ar4.iterator();
		 while(it.hasNext())
		 {
			 Employee emp = it.next();
			 System.out.println(emp.name);
			 System.out.println(emp.age);
			 System.out.println(emp.dept);

		 }
	
		 
		 //*******************************
		 System.out.println("//*******************************");
		 //addAll()
		 
		 ArrayList<String> ar5 = new ArrayList<String>();
		 ar5.add("test");
		 ar5.add("Selenium");
		 ar5.add("QTP");
		 
		 ArrayList<String> ar6 = new ArrayList<String>();
		 ar6.add("Dev");
		 ar6.add("JAVA");
		 ar6.add("JavaScript");
		 
		 ar5.addAll(ar6);
		 
		 for (int i=0;i<ar5.size();i++)
		 {
			 System.out.println(ar5.get(i));
		 }

		 System.out.println("//*******************************");

		 ar5.removeAll(ar6);		 
		 
		 for (int i=0;i<ar5.size();i++)
		 {
			 System.out.println(ar5.get(i));
		 }
		 
		 
		 System.out.println("//*******************************");
		 //addAll()
		 
		 ArrayList<String> ar7 = new ArrayList<String>();
		 ar7.add("test");
		 ar7.add("Selenium");
		 ar7.add("QTP");
		 
		 ArrayList<String> ar8 = new ArrayList<String>();
		 ar8.add("test");
		 ar8.add("JAVA");
		 ar8.add("JavaScript");
		 
	//	 ar7.retainAll(ar8);
		//	Collections.sort(ar7); 
		 for (int i=0;i<ar7.size();i++)
		 {
			 System.out.println(ar7.get(i));
		 }
		 
		 
	}

}
