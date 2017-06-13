package piglatin;

import java.util.Scanner;

/**
 * 
 * @author csgibson4, andyWynyard
 * 
 */

public class Driver {

	public static void main(String[] args) {
		
		Translator translator = new PigLatinTranslator();
		Inputter inputter = new FileInput();
		translator.translate(inputter.getInput("usdeclar.txt")); //change
		
		
		
		Inputter fileIn = new FileInput();
		Translator translator2 = new WordCounter();
		translator2.translate(fileIn.getInput("usdeclar.txt"));
		
	}
	
}
