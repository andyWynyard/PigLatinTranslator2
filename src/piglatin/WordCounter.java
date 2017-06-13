package piglatin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter implements Translator {

	public WordCounter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String translate(String string) {
		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;

		Pattern p1 = Pattern.compile("\\n", Pattern.CASE_INSENSITIVE);
		Matcher m1 = p1.matcher(string);
		Pattern p2 = Pattern.compile("\\b", Pattern.CASE_INSENSITIVE);
		Matcher m2 = p2.matcher(string);
		Pattern p3 = Pattern.compile(".", Pattern.CASE_INSENSITIVE);
		Matcher m3 = p3.matcher(string);

		while (m1.find()) {
				lineCount++;
			
		}
		while (m2.find()) {
				wordCount++;
			
		}
		while (m3.find()) {
				charCount++;
			

		}
		System.out.println("Line count: " + lineCount);
		System.out.println("Word count: " + wordCount);
		System.out.println("Character count: " + charCount);
//		System.out.println(m1.groupCount());
//		System.out.println(m2.groupCount());
//		System.out.println(m3.groupCount());

		return null;
	}

}
