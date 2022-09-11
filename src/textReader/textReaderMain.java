package textReader;

import java.util.Scanner;

public class textReaderMain {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath; //User file path input
		String wordSearched; //  the word user is searching for
		
		System.out.println("Enter the file path for your text file (include the file name as well).");
		Scanner in = new Scanner(System.in);
		filePath = in.next().replace('/', '\\'); //Load the file
		
		System.out.println("What would shall we look for?");
		wordSearched = in.next(); // This is the word that will be searched for
		
		 // Takes the file path and the word we are searching for and returns how many times it appears in the text
		int wordTimes = getText.Read(filePath, wordSearched);
		
		System.out.println("The word " + wordSearched + " appears " + wordTimes + " times in the text file");
		
		in.close();
	}

}
