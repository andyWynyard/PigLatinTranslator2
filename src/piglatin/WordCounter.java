package piglatin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter implements Translator {

	public WordCounter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String translate(String string) {
		//increment the counter each time a match is found and print out the result
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
		
		String finalString = 
			"Line count: " + lineCount + "\n" +
			"Word count: " + wordCount/2 + "\n" +
			"Character count: " + charCount + "\n";

		return finalString;
	}

}
