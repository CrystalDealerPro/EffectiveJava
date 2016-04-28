package crystal.dealer.pro.effective.java.generics.vs.base;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;

public interface ValueInterface {

	BigDecimal getValue();
	
	/**
	 * Generic method.
	 * @param list
	 * @return
	 */
	static <T extends ValueInterface> T getBiggest(List<T> list){
		list.sort(new Comparator<T>() {

			@Override
			public int compare(T o1, T o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
			
		});

		return list.get(0);
	}
	
	/**
	 * Method using the base type. 
	 * @param list
	 * @return
	 */
	static ValueInterface getSmallest(List<ValueInterface> list){
		list.sort(new Comparator<ValueInterface>() {
			
			@Override
			public int compare(ValueInterface o1, ValueInterface o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		return list.get(list.size() - 1);
	}
}
