/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab21
 */

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class ProcessScores {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter file name: ");
		String filename = input.nextLine();
		File file = new File(filename);
		
		try {
			Scanner fileScanner = new Scanner(file);
			double total = 0;
			int amount = 0;
			
			while(fileScanner.hasNext()) {
				total += Integer.valueOf(fileScanner.next());
				amount++;
			}
			
			System.out.println("Total is: "+total);
			System.out.println("Average is: " + (total / amount));
			
			fileScanner.close();
			input.close();
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
