package piglatin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileInput implements Inputter {

	public FileInput() {

	}

	@Override
	public String getInput(String fileName) {
		//Take file input and concatenate onto a string to be passed to the translator and word counter
		String temp = "";
		try (BufferedReader bufIn = 
                new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = bufIn.readLine()) != null) {
            	temp = temp + line + "\n";
            }
        }
        catch (IOException e) {
            System.err.println(e);
        }
		
		return temp;
	}

}
