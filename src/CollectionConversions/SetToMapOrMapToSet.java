package CollectionConversions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class SetToMapOrMapToSet {

	public static void main(String[] args) {
		
		//1. Set to Map -- Not required
		//2. Map to Set
		
		Set<String> ls = new LinkedHashSet<>();  
		
		ls.add("Mayank");
		ls.add("Mishra");
		ls.add("QA");
		ls.add("TEST");
		ls.add("SELE");

		//2. Map to Set
		
		Map<String,String> mp = new HashMap<String,String>(); // unordered
		Map<String,String> mp1 = new LinkedHashMap<String,String>(); // ordered

		mp.put("Key1","Mayank");
		mp.put("Key2", "Mishra");
		mp.put("Key3", "QA");
		
		mp1.put("Key1","Mayank");
		mp1.put("Key2", "Mishra");
		mp1.put("Key3", "QA");
		
		System.out.println(mp.size()); // 3

		
		Set<String> newset = mp.keySet(); // return all key in unordered way
		System.out.println(newset);
		Set<String> newset1 = mp1.keySet(); 
		System.out.println(newset1); // return all key in ordered way

//Traversing through Map
		for(String str : newset)
			{
				System.out.println(str + " " +mp.get(str));
			}
				
	
	}

}
