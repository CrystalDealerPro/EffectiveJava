package crystal.dealer.pro.new_in_java_8;

import java.sql.Date;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args){
//		periodsAndDurations();
		
		functions();
		
		
	}
	
	
	private static void streams(){
		List<Integer> nums1 = Arrays.asList(new Integer[] { 5, 7, 1, 5, 7, 9, 4, 2, 2, 2 });
		List<Integer> nums2 = Arrays.asList(new Integer[] {4, 8, 5, 1, 1, 2, 3, 4, 5, 6 });
				
		System.out.println(nums1.size());
		System.out.println(nums2.size());
		
		System.out.println(nums1.toString());
		System.out.println(nums2.toString());
		
		System.out.println("Suma 1: " + nums1.stream().mapToInt(Integer::intValue).sum());
		System.out.println("Suma 2: " + nums2.stream().mapToInt(Integer::intValue).sum());
		
		System.out.println("AVG 1: " + nums1.stream().mapToInt(Integer::intValue).average().getAsDouble());
		System.out.println("AVG 2: " + nums2.stream().mapToInt(Integer::intValue).average().getAsDouble());
		
		List<String> strings = Arrays.asList(new String[] {"1", "2", "3", "4", "5"});
		
		String str = strings.stream().collect(Collectors.joining(","));
		
		System.out.println(str);
	}

	private static void dates(){
		
		LocalTime now = LocalTime.now();
		
		LocalDate date = LocalDate.parse("1993-05-15", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		Date sqlDate = Date.valueOf(date);
		
		System.out.println(sqlDate.toString());
		
		LocalDate date2 = LocalDate.of(2011, Month.JULY, 24);
		
		System.out.println(date2.toString());
	}

	private static void periodsAndDurations(){
		Period period = Period.between(LocalDate.of(1993, Month.MAY, 15), LocalDate.now());
		String pStr = "Years: " + period.getYears() + ", Months: " + period.getMonths() + ", Days: " + period.getDays();
		System.out.println(pStr);
		
		Duration duration = Duration.between(LocalTime.of(15, 36), LocalTime.of(23, 11));
		String dStr = "In Hours: " + duration.toHours() + ", In Nanoseconds: " + duration.toNanos();
		System.out.println(dStr);
	}

	private static void functions(){
		 Function<Integer,String> f = Function.<Integer>identity().andThen(( i -> { return "My ass." + i++ ;})).andThen( i -> { return "My ass" + i;});
	
		 String result = f.apply(20);
		 
		 System.out.println(result);
	}
}
