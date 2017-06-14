package piglatin;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PigLatinTranslator implements Translator {
	
	
	
	public PigLatinTranslator() {
		
	}
	
	/* (non-Javadoc)
	 * @see piglatin.Translator#translate(java.lang.String)
	 */
	@Override
	public String translate(String s){
		String[] sArr = s.split("\\b");
		String finalString = "";
		
		for (String string : sArr) {
			Pattern p1 = Pattern.compile("\\b[b-d,f-h,j-n,p-t,v-z][aeiou].*\\b", Pattern.CASE_INSENSITIVE);
			Matcher m1 = p1.matcher(string);
			Pattern p2 = Pattern.compile("\\b[b-d,f-h,j-n,p-t,v-z]{2}.*\\b", Pattern.CASE_INSENSITIVE);
			Matcher m2 = p2.matcher(string);
			Pattern p3 = Pattern.compile("\\b[aeiou].*\\b", Pattern.CASE_INSENSITIVE);
			Matcher m3 = p3.matcher(string);
			StringBuilder stringBuilder = new StringBuilder();
			
			string = string.toLowerCase();
			
			if (m1.matches()){
				string = stringBuilder.append(string).append(string.toCharArray()[0]).append("ay").substring(1);
			}
			else if (m2.matches()) {
				string = stringBuilder.append(string).append(string.toCharArray()[0]).append(string.toCharArray()[1]).append("ay").substring(2);
			}
			else if (m3.matches()) {
				string = stringBuilder.append(string).append("way").toString();
				
			}
			
			finalString = finalString + string;
		}

		return finalString;
		
	}

}
