package crystal.dealer.pro.effective.java.function.passing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubstringReplacer {

	public String replace(ReplacementResolver replacer, String text, String regex){
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);
		String t = text;
		
		while(m.find())
		{

			String gr = m.group();
			
			String replacement = replacer.replaceWith(gr);
			t = t.replace(gr, replacement);
		}
		
		return t;
	}
}
