package crystal.dealer.pro.effective.java.implementing.comparable;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args){
		
		testTreeSet();
	}
	
	
	private static void testTreeSet(){
		ComparableRating[] ratingsTable = new ComparableRating[] 
		{ 
				new ComparableRating(10,20,5.3232,"A"),
				new ComparableRating(30,10,43.3232,"B"),
				new ComparableRating(124,432,32.321,"C"),
				new ComparableRating(5,53,45.43,"D"),
				new ComparableRating(7,3,21.67,"E"),
				new ComparableRating(543,22,32,"F"),
				new ComparableRating(1,1,1.3232,"G"),
				new ComparableRating(10,20,2.3232,"H"),
				new ComparableRating(10,20,3.3232,"I"),
				new ComparableRating(10,20,4.3232,"J"),
		};
		
		Set<ComparableRating> ratingsSortedSet = new TreeSet<ComparableRating>();
		Collections.addAll(ratingsSortedSet, ratingsTable);
		
		Iterator<ComparableRating> i = ratingsSortedSet.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next().toString());
		}
	}

}
