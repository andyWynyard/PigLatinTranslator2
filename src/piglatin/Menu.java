package piglatin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	Scanner input = new Scanner(System.in);

	public Menu() {
	}

	public void start() { //main menu
			System.out.println("\nMain Menu");
			System.out.println("Please choose an option below: ");
			System.out.println("1) Translate into Pig Latin from File");
			System.out.println("2) Translate into Pig Latin from Keyboard Input");
			System.out.println("3) Word Count from File");
			System.out.println("4) Word Count from Keyboard Input");
			System.out.println("0) Quit Program");
			inputHandle();
		}
	
	public void inputHandle() { //try to take input and initiate the correct method based on menu choice
		outer: try {
			Translator plTranslator = new PigLatinTranslator();
			Translator wordCounter = new WordCounter();
			
			Inputter fileInput = new FileInput();
			Inputter scanInput = new ScannerInput();
			
			String outputString = "";
			
			System.out.print("  >>> ");
			int choice = input.nextInt();
			switch (choice) {
			case 0:
				System.out.println("\nHave a great day!");
				break outer;
			case 1: //Pig Latin from file
				System.out.print("File name: ");
				String filechoice = input.next();
				outputString = plTranslator.translate(fileInput.getInput(filechoice));
				break;
			case 2: //Pig Latin from scanner
				outputString = plTranslator.translate(scanInput.getInput(""));
				break;
			case 3: //Word Count from file
				System.out.print("File name: ");
				String filechoice2 = input.next();
				outputString = wordCounter.translate(fileInput.getInput(filechoice2));
				break;
			case 4: //Word Count from Scanner
//Currently buggy when dealing with /n taken in through the scanner
				outputString = wordCounter.translate(scanInput.getInput(""));
				break;
			default: //Not a valid option
				System.out.println("\nPlease choose a valid number input!");
				break;
			}
			System.out.println(outputString);
			start();
		} catch (InputMismatchException ime) {
			System.out.println("\nPlease choose a valid menu item!");
			System.out.println("\nRestart program");
		}
	}

}
