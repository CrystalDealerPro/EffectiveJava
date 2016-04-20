package crystal.dealer.pro.effective.java.function.passing;

//Java methods can't take delegates as arguments as it was in C#. Instead they can take Interfaces and then internally use their specific methods.
public class Main {

	public static void main(String[] args){
		
		String text = "Ala ma kota.";
		
		SubstringReplacer sr = new SubstringReplacer();
		ReplacementResolver rr = (String s) -> { 
			
				if(s.equals("Ala")){
					return "ALINA";
				}
				if(s.equals("ma")){
					return "NIC NI MA";
				}
				if(s.equals("kota")){
					return "NAWET PSA";
				}
				return null;
				
			};
			
		String replace1 = sr.replace(rr, text, "\\w+");
		
		String replace2 = sr.replace(new ReplacementResolver() {
				
				@Override
				public String replaceWith(String s) {
					if(s.equals("Ala")){
						return "BABCIA";
					}
					if(s.equals("ma")){
						return "STENIA";
					}
					if(s.equals("kota")){
						return "LUBI PLACKI";
					}
					return null;
				}
			},text, "(\\w+)");
			
		System.out.println(replace1);		
		System.out.println(replace2);
		
	}
}
