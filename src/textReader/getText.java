package textReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class getText {

	/**
	 * @param Method that returns how many times the word being searched for is in the text file.
	 * @return 
	 */
	public static int Read(String filePath, String word) //Method that returns how many times word is in the text file.
	{
		int counter = 0; // counter for the searched word
		File myTextFile = new File(filePath); //loads the File
		
		// Read file, if file not found, throw error
		try {
			@SuppressWarnings("resource")
			Scanner myReader = new Scanner(myTextFile); // Loads the Text File
			
			while (myReader.hasNext()) 
			{
				String readWord = myReader.next(); // Reads next string
				// String with punctuation marks add
				String period = word + ".";
				String comma = word + ",";
				String questionMark = word + "?";
				
				if (readWord.equalsIgnoreCase(word) || readWord.equalsIgnoreCase(period) 
					|| readWord.equalsIgnoreCase(comma) || readWord.equalsIgnoreCase(questionMark)) 
				{
					counter++; // If word exists, add to counter.					
				}
			}
					
		} 
		
		//-----------------------------------------------
		catch (FileNotFoundException e) //Throws exception if error occurs
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		return counter;
		
	}
	

	
}	

