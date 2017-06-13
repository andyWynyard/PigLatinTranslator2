package piglatin;

import java.util.Scanner;

public class ScannerInput implements Inputter {

	/* (non-Javadoc)
	 * @see piglatin.Inputter#getInput()
	 */
	@Override
	public String getInput(String s){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter: ");
		String inString = input.nextLine();
		return inString;
	}
}
