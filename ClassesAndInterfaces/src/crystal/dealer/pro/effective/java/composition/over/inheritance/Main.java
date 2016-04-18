package crystal.dealer.pro.effective.java.composition.over.inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import crystal.dealer.pro.effective.java.composition.over.inheritance.composition.InstrumentedSet;
import crystal.dealer.pro.effective.java.composition.over.inheritance.inheritance.InstrumentedHashSet;

public class Main {

	public static void main(String[] args){
		
		List<String> elements = new ArrayList<String>(Arrays.asList("Snap", "Crackle", "Pop"));
		InstrumentedHashSet<String> s = new InstrumentedHashSet<String>();		
		s.addAll(elements);
		
		InstrumentedSet<String> s2 = new InstrumentedSet<String>(new HashSet<String>());
		s2.addAll(elements);
		
		System.out.println("Added elements: " + elements.size());
		
		System.out.println("Inheritance wrong count:");
		System.out.println(s.getAddCount());
		
		System.out.println("Composition count:");
		System.out.println(s2.getAddCount());
		
	}
}
