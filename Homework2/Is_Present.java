/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Wu_Joseph#2
 */

import java.util.*;

public class Is_Present {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter First string: ");
		String stringOne = input.nextLine();
		System.out.print("Enter Second string: ");
		String stringTwo = input.nextLine();	
		
		present(stringOne, stringTwo);
		
		input.close();
	}
	
	public static void present(String one, String two) {
		int occurs = 0;
		int index = 0;
		while(one.indexOf(two, index+two.length())!=-1) {
			index = one.indexOf(two, index+two.length());
			occurs++;
		}
		if (occurs == 0) {
			System.out.println("OUTPUT: "+two+" Not present in "+one);
		}else {
			System.out.println("OUTPUT: "+two+" occurs "+occurs+" times in "+one);
			System.out.println("Last occurrence is at index "+index);
		}
	}

}
