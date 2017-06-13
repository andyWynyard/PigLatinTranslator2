package piglatin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileInput implements Inputter {

	public FileInput() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getInput(String fileName) {
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
		
		//System.out.println(temp);
		return temp;
	}

}
