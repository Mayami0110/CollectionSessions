package setConcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {
		
		//HashSet<String> hs = new HashSet<String>();
		
		Set<String> hs = new HashSet<String>();

		
		hs.add("Selenium");
		hs.add("QTP");
		hs.add("QTP");
		hs.add("abc");
		hs.add("1");		
		hs.add("Winpin");
		
		System.out.println(hs); //[1, abc, Winpin, Selenium, QTP] 
		
		//random order
		// Duplicate value QTP only one is adding

// to get value in set use loop
		
		for(String str : hs)
		{
			System.out.println(str);
		}

// Convert Set to List
		
		List<String> ls = new ArrayList<String>(hs);
		
		System.out.println(ls);
		System.out.println(ls.get(2));


		
	}

}
