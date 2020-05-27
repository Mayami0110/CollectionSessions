package ListConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DupKeyWords {

	public static void main(String[] args) {

		
		String str = "my name is amit amit is my name amit";
		
		String strarry[] = str.split(" "); 
		
				
		/*Set<String> st = new LinkedHashSet<String>();
		
		for(String val : strarry )
		{
			if(st.add(val) == false)
			{
				System.out.println(val);
			}
		}
		
		System.out.println(st);*/
		
	
		Map<String, Integer> mp = new HashMap<String, Integer>();
		
		for(String val : strarry)
		{
			Integer count = mp.get(val);
			
			if(count == null)
			{
				mp.put(val, 1);
			}
			
			else {
				
				mp.put(val, ++count);
			}
			
			
		}
		
		System.out.println(mp);
		
		Set<String> st = mp.keySet();
		
		for(String st1 : st)
	
			if(mp.get(st1)>1)
			{
				System.out.println(st1 + ": " + mp.get(st1));
			}
		}
		
		
		
		

	
	
	
	
	}


