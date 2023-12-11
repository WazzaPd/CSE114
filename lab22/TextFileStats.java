/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab22
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TextFileStats {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter file name: ");
		String fileName = input.nextLine();
		
		File file = new File(fileName);
		
		try {
			Scanner fileReader = new Scanner(file);
			int charCount = 0, wordCount = 0, lineCount = 0;
			
			while(fileReader.hasNextLine()) {
				String line = fileReader.nextLine();
				
				for( char c: line.toCharArray()) {
					if(c== ' ') {
						wordCount++;
					}
					charCount++;
				}
				lineCount++;
			}
			System.out.println(charCount+" Characters");
			System.out.println(wordCount+" Words");
			System.out.println(lineCount+" Lines");
			
			fileReader.close();
			input.close();
		} catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
