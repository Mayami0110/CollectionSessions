package setConcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetConcept {

	public static void main(String[] args) {

		
	Set<String> hs = new LinkedHashSet<String>();

		
		hs.add("Selenium");
		hs.add("QTP");
		hs.add("QTP");
		hs.add("abc");
		hs.add("1");		
		hs.add("Winpin");
		
		System.out.println(hs); //[Selenium, QTP, abc, 1, Winpin] 

		// Maintain the order of insertion
		// Duplicate value QTP only one is adding
		
// to get value in set use loop
		
		for(String str : hs)
		{
			System.out.println(str);
		}

	
	
	// Convert Set to List
	
			List<String> ls = new ArrayList<String>(hs);
			
			System.out.println(ls); //[Selenium, QTP, abc, 1, Winpin]
			System.out.println(ls.get(2));  //abc
			
			// convert List to Set
			
			List<String> ls1 = new ArrayList<String>();
			ls1.add("Selenium");
			ls1.add("QTP");
			ls1.add("QTP");
			ls1.add("abc1");
			ls1.add("11");		
			ls1.add("Winpin1");

			System.out.println(ls1); //[Selenium, QTP, QTP, abc1, 11, Winpin1]
			
			Set<String> lhs = new LinkedHashSet<>(ls1); 
			
			System.out.println(lhs); //[Selenium, QTP, abc1, 11, Winpin1]



		
	}
}

