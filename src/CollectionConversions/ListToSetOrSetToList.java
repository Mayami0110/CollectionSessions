package CollectionConversions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListToSetOrSetToList {

	public static void main(String[] args) {
	
		//1. List to Set or ArrayList to Set
		
		//2. Set to List or Set to ArrayList 
		
		List<String> ls = new ArrayList<>(); 
		
		ls.add("Mayank");
		ls.add("Mishra");
		ls.add("QA");
		ls.add("TEST");
		ls.add("SELE");
		
		System.out.println(ls.indexOf("TEST"));
		System.out.println(ls.get(3));

		
		Set<String> hs = new HashSet<String>(ls); //to hashset - no ordered
		
		System.out.println(hs); // [QA, Mishra, Mayank]
		
		Set<String> lhs = new LinkedHashSet<String>(ls); //to linkedhashset -  ordered set

		System.out.println(lhs); //[Mayank, Mishra, QA]

		/*List<String> subls = new ArrayList<String>(ls).subList(0, 2); // from index (inclusive),to index(exclusive)
		System.out.println(subls); //[Mayank, Mishra]
*/
		
		//2. LinkedHashSet to List or ArrayList
		
		List<String> newls = new ArrayList<String>(lhs); // just pass the set
		System.out.println(newls); // 	[Mayank, Mishra, QA, TEST, SELE]

		List<String> newlshash = new ArrayList<String>(hs); // just pass the set
		System.out.println(newlshash); // 	[QA, Mishra, TEST, Mayank, SELE] // unordered

		
		
		
	}

}
