package crystal.dealer.pro.effective.java.casting;

public class Main {

	public static void main(String[] args){
		
		CastingClass cc = new CastingClass(432, "CC");
		CastingInterface ci = new CastingClass(123, "CI");
		CastingSubclass cs = new CastingSubclass(1, "CS");
		AnotherCastingClass acc = new AnotherCastingClass();
		
		performUnknownCasts(cc, ci, cs, acc);
		
	}
	
	
	private static void performUnknownCasts(Object... args){
		
		for(Object o : args){
			try{
				CastingClass cc = (CastingClass)o;
				
				if(cc == null){
					System.out.println("CC is null.");
				}else{
					System.out.println("CC cast successfull.");
					cc.castingAction();					
				}
			}catch(Exception e){
				System.out.println("CC ERROR: " + e.getMessage());
			}
			
			try{
				
				CastingInterface ci = (CastingInterface)o;
				
				if(ci == null){
					System.out.println("CI is null.");
				}else{
					System.out.println("CI cast successfull.");
					ci.castingAction();
				}
			}catch(Exception e){
				System.out.println("CI ERROR: " + e.getMessage());
			}
			try{
				
				CastingSubclass cs = (CastingSubclass)o;
				
				if(cs == null){
					System.out.println("CS is null.");
				}else{
					System.out.println("CS cast successfull.");
					cs.castingAction();	
				}
			}catch(Exception e){
				System.out.println("CS ERROR: " + e.getMessage());
			}
			
			try{
				
				AnotherCastingClass acc = (AnotherCastingClass)o;
				
				if(acc == null){
					System.out.println("ACC is null.");
				}else{
					System.out.println("ACC cast successfull.");
					System.out.println(acc.toString());
				}
			}catch(Exception e){
				System.out.println("ACC ERROR: " + e.getMessage());
			}
			
			
		}
	}
}
