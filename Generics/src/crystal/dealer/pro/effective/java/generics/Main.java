package crystal.dealer.pro.effective.java.generics;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	
	public static void main(String[] args){
		
		List<Object> lista = new ArrayList<Object>();
		
		lista.add("fdsfds");
		lista.add(1287);
		lista.add(78432.532d);
		lista.add(124f);
		lista.add(321L);
		
		for(Object ob : lista){
			System.out.println(ob.getClass().toString());	
		}
	}
	
}
