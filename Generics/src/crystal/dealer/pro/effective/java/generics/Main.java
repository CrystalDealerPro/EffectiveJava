package crystal.dealer.pro.effective.java.generics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import crystal.dealer.pro.effective.java.generics.vs.base.ValueInterface;
import crystal.dealer.pro.effective.java.generics.vs.base.ValueInterfaceImpl;
import crystal.dealer.pro.effective.java.generics.vs.base.ValueInterfaceImpl2;

public class Main {

	
	public static void main(String[] args){
		
		List<Integer> nums1 = Arrays.asList(new Integer[] { 5, 7, 1, 5, 7, 9, 4, 2, 2, 2 });
		List<Integer> nums2 = Arrays.asList(new Integer[] {4, 8, 5, 1, 1, 2, 3, 4, 5, 6 });
		
		ComparableList<Integer> compList1 = new ComparableList<Integer>(nums1);
		
		System.out.println(nums1.size());
		System.out.println(nums2.size());
		

		System.out.println(compList1.compareTo(nums2));
		
		System.out.println(nums1.toString());
		System.out.println(nums2.toString());
		
		System.out.println("Suma 1: " + nums1.stream().mapToInt(Integer::intValue).sum());
		System.out.println("Suma 2: " + nums2.stream().mapToInt(Integer::intValue).sum());
		
		System.out.println("AVG 1: " + nums1.stream().mapToInt(Integer::intValue).average().getAsDouble());
		System.out.println("AVG 2: " + nums2.stream().mapToInt(Integer::intValue).average().getAsDouble());
		
		List<String> strings = Arrays.asList(new String[] {"1", "2", "3", "4", "5"});
		
		String str = strings.stream().collect(Collectors.joining(","));
		
		System.out.println(str);
//		checkMethodsOnImplementations();
		
	}
	
	
	private static void arrayOfObjects(){
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
	
	
	private static void checkMethodsOnType(){
		ValueInterface v1 = () -> {
			return new BigDecimal(666);
		};
		
		ValueInterface v2 = () -> {
			return new BigDecimal(777);
		};
		
		ValueInterface biggest = ValueInterface.getBiggest(Arrays.asList(v1, v2));
		
		ValueInterface smallest = ValueInterface.getSmallest(Arrays.asList(v1, v2));
		
		if(v1 == smallest){
			System.out.println("SMALLEST IS OK");
		}
		
		if(v2 == biggest){
			System.out.println("BIGGEST IS OK");
		}
	}

	private static void checkMethodsOnImplementations(){
		
		ValueInterfaceImpl impl1 = new ValueInterfaceImpl();
		ValueInterfaceImpl2 impl2 = new ValueInterfaceImpl2();
		
		ValueInterface i1 = new ValueInterfaceImpl();
		ValueInterface i2 = new ValueInterfaceImpl2();
		
//		ValueInterfaceImpl implRes1 = (ValueInterfaceImpl) ValueInterface.getBiggest(Arrays.asList(new ValueInterface[] {impl1, impl2}));
		
		ValueInterfaceImpl implRes2 = (ValueInterfaceImpl) ValueInterface.getSmallest(Arrays.asList(new ValueInterface[] {impl1, impl2}));
		
//		ValueInterfaceImpl implRes3 =  (ValueInterfaceImpl) ValueInterface.getBiggest(Arrays.asList(new ValueInterface[] {i1, i2}));
		
		ValueInterfaceImpl implRes4 = (ValueInterfaceImpl) ValueInterface.getSmallest(Arrays.asList(new ValueInterface[] {i1, i2}));
		
		
//		System.out.println(implRes1.getValue());
		System.out.println(implRes2.getValue());
//		System.out.println(implRes3.getValue());
		System.out.println(implRes4.getValue());
	}
}
