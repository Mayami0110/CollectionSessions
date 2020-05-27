package MapConcepts;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		
		//1. it is similar to hashmap but it is synchronized -- thread safe
		//2. stores values on the basis of key and value pair
		//3. key --> is stored in form of Object and each and every object inside the jave is having a special
		// unique identifier hashcode  -- value
		// Hashcode -- When Obj is created java provide hashcode for that obj its a 32 bit signed int number
		// if two obj are same it will return same hashcode with equals method
		// can not contain null key or null value
		// can no contain duplicate elements will overide the value if key is same and value is different.
		

		Hashtable h1 = new Hashtable();
		
		h1.put(1, "Tom");
		h1.put(2, "Test");
		h1.put(3, "Peter");
		h1.put(4, "Tom");
		h1.put(4, "Tommy");

		System.out.println(h1);

		// use putall
		Hashtable h3 = new Hashtable();
		
		h3.putAll(h1);
		
		System.out.println(h3);
		
		// h1.clear();
		
		System.out.println(h1.hashCode() + " : " + h3.hashCode());
		
		//Travesring in hashtable throuhg lambda
		
		h1.forEach((key , value) -> {
			
			System.out.println(key +": "+ value);
		});
		
		
		
		
		/*//create a clone copy //shallow copy
		
		Hashtable h2 = new Hashtable();
		h2= (Hashtable) h1.clone();
		
		System.out.println(h2); // {3=Peter, 2=Test, 1=Tom}
		System.out.println(h1); //{3=Peter, 2=Test, 1=Tom}
		
		//delete from h1 
		
		h1.clear();
		
		System.out.println(h2); // {3=Peter, 2=Test, 1=Tom}
		System.out.println(h1); 	 // get cleared
		
		//contains value method
		
		Hashtable ht = new Hashtable();

		ht.put("a", "Mayank");
		ht.put("b", "QA");
		ht.put("c", "Selenium");
		
		System.out.println(ht.contains("Mayank")); // true
		System.out.println(ht.containsValue("QA")); // true
		
		//print all the values from hashtable using -- Enumeration and elements

		Enumeration e = ht.elements();
		
		System.out.println("Print value from ht: using Enumeration" );
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		// get all the value from hashtable - using entryset - return set of hashtable values:
		
		Set s = 		ht.entrySet();
		System.out.println(s); //[b=QA, a=Mayank, c=Selenium]
		
		
		
		Hashtable ht1 = new Hashtable();

		ht1.put("a", "Mayank");
		ht1.put("b", "QA");
		ht1.put("c", "Selenium");
		
		//to check both are equal
		
		System.out.println(ht1.equals(ht)); //true
		
		//get value from key 
		
		System.out.println(ht.get("a")); // Tom
		
		// get hashcode value of hashtable
		
		System.out.println(ht.hashCode() +"   " + ht1.hashCode());
		
		

*/	}

}
