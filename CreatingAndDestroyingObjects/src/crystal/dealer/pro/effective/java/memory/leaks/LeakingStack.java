package crystal.dealer.pro.effective.java.memory.leaks;

import java.util.Arrays;
import java.util.EmptyStackException;

public class LeakingStack {
	// Can you spot the "memory leak"?

	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;
	
	public LeakingStack() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}
	
	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}
	
	public Object pop() {
		if (size == 0)
			throw new EmptyStackException();
		
		//UNCOMMENT TO PREVENT MEMORY LEAKS DUE TO OBSOLETE REFERENCES		
		//elements[size] = null;
		
		return elements[--size];
	}
	
	/**
	* Ensure space for at least one more element, roughly
	* doubling the capacity each time the array needs to grow.
	*/
	private void ensureCapacity() {
		
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}
	
}
