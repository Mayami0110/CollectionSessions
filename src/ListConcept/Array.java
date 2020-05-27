package ListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		
		Integer [] num = {2,5,10,34,22,11};
		
		List<Integer> ls = Arrays.asList(num);
		
		Collections.sort(ls);
		
		System.out.println(ls);
		
		System.out.println(ls.get(ls.size()-1));
		
		int [] num1 = {2,5,10,34,22,11};
		
		System.out.println(num1[20]);

		
		
		
		
	}

}
