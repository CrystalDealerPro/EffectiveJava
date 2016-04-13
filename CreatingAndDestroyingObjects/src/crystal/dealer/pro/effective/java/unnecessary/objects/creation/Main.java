package crystal.dealer.pro.effective.java.unnecessary.objects.creation;

import java.util.Calendar;

public class Main {

	private static final int ITERATIONS = 300000;
	
	public static void main(String[] args){
		babies();
		autoboxing();
	}
	
	private static void babies(){
		Calendar c = Calendar.getInstance();
		c.set(1992, 5, 21);
		
		BabyCorrect babyCorrect = new BabyCorrect(c.getTime());
		BabySlow babySlow = new BabySlow(c.getTime());
		
		long start = System.currentTimeMillis();
		
		for(int i=0; i < ITERATIONS; i++){
			babyCorrect.isBabyBoomer();		
		}
		
		long stop1 = System.currentTimeMillis();
		
		for(int i=0; i < ITERATIONS; i++){
			babySlow.isBabyBoomer();
		}
		
		long stop2 = System.currentTimeMillis();
		
		System.out.println("Correct execution time for " + ITERATIONS + " iterations: " + (stop1 - start) + "ms.");
		System.out.println("Slow execution time for " + ITERATIONS + " iterations: " + (stop2 - stop1) + "ms.");
	}

	private static void autoboxing(){
		
		long start = System.currentTimeMillis();
		
		//This loop creates 2^31 unnecessary Long objects.
		Long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		long stop1 = System.currentTimeMillis();
		
		//This loop does the same as the previous one but much faster.
		long sum2 = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum2 += i;
		}
		System.out.println(sum2);
		
		long stop2 = System.currentTimeMillis();
		
		System.out.println("Boxed loop execution time: " + (stop1 - start) + "ms.");
		System.out.println("Primitive loop execution time: " + (stop2 - stop1) + "ms.");
	}
}
