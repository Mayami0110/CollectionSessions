package CollectionConversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayListOrALToArray {

	public static void main(String[] args) {

		
		
		
		//1. Array to Array List
		//2. ArrayList to Array
		// -- ArrayList and List. List is interface and Arraylist is class.
				
		//Array : arrayOutofboundexception
		
		String[] arry = new String[3];
		arry[0] = "Mayank";
		arry[1] = "Mishra";
		arry[2] = "QA";
		
		System.out.println(arry.length);
	//	System.out.println(arry.toString());
	//	System.out.println(Array.);

		String str = "Mayank";
		
		System.out.println(str.indexOf('3'));
		System.out.println(str.charAt(2));
		System.out.println(str.substring(0, 2));

		
		// Array to ArrayList
		
		List<String> ls = new ArrayList<String>();
		ls = Arrays.asList(arry);
		
		System.out.println(ls);
		
		// ArrayList to Array
		
	//	String[] array2 = ls.toArray(new String[ls.size()]); // this also correct
		
		//String[] array2 = new String[ls.size()]; 
		
		String[] array2 = (String[])ls.toArray();
		
		for(String i : array2) 
		{
			
			System.out.println(i);
			
		}


		

	}

}
