package ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListsIterations {

	public static void main(String[] args) {

		
		ArrayList <String> tvseries = new ArrayList<String>();
		
		tvseries.add("Game of Thrones");
		tvseries.add("Breaking Bad");
		tvseries.add("Big Bang Theory");
		tvseries.add("Prison Break");
		tvseries.add("Walking Dead");
		tvseries.add("Harry Potter");


	//1. Use Java 1.8 for each and Lambda Exp
		
		System.out.println("***** Lambda Exp *******");
		
		tvseries.forEach(shows -> {
			
			System.out.println(shows);
		});
		
		//2. Use for Iterator
		
		System.out.println("***** Iterator *******");
		
		Iterator<String> it = tvseries.iterator();
				
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
			
				
		
		//3. Use for each loop
		
		System.out.println("***** For each Loop *******");

		for(String shows : tvseries) {
			System.out.println(shows);
		}
	
	
	//4. Java 8 iterator and foreach remaining method 
		System.out.println("*****  Java 8 iterator and foreach remaining method  *******");
		
		it = tvseries.iterator();
		
		tvseries.iterator().forEachRemaining(shows -> {
			
			System.out.println(shows);
		});
		
		//5. for loop 
	
		System.out.println("***** For  Loop *******");

		for(int i = 0 ; i< tvseries.size();i++)
		{
			System.out.println(tvseries.get(i));
		}
		
		//6. for list iterator 
		
		System.out.println("***** For  List iterator forward Dir *******");

		ListIterator<String> tvshow = tvseries.listIterator();	
		while(tvshow.hasNext())
		{
			System.out.println(tvshow.next());
		}
	
		//7. for list iterator 
		
		System.out.println("***** For  List iterator reverse or backword Dir *******");
	
	
		tvshow = tvseries.listIterator(tvseries.size());
		
		while(tvshow.hasPrevious())
		{
			System.out.println(tvshow.previous());
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
