package crystal.dealer.pro.effective.java.generics;

import java.util.List;

public class ComparableList<T extends Comparable<T>> implements Comparable<List<T>> {

	private List<T> collection;
	
	public ComparableList(List<T> list){
		collection = list;
	}
	
	@Override
	public int compareTo(List<T> o) {
		
		int counter = 0;
		
		collection.sort((T o1, T o2) -> {			
			return o1.compareTo(o2);
			
		});

		o.sort((T o1, T o2) -> {
			return o1.compareTo(o2);
		});
		
		if(collection.size() != o.size()){
			return ((Integer)collection.size()).compareTo((Integer)o.size());
		}
		
		for(int i=0;i<collection.size(); i++){			
			counter += Math.signum(collection.get(i).compareTo(o.get(i)));
		}
		
		return (int)Math.signum(counter);
	}

	
}
