/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Wu_Joseph#2
 */

import java.util.*;

public class Opposite_Case {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter an input string: ");
		String string = input.nextLine();
		
		if(string.length()>15) {
			System.out.println("String length greater than 15, please enter another string");
		}else {
			modifyNprint(string);
		}
		input.close();
	}
	
	public static void modifyNprint(String string) {
		String output = "";
		for(int i = 0; i<string.length(); i++) {
			if(string.charAt(i)==Character.toUpperCase(string.charAt(i))) {
				output += Character.toLowerCase(string.charAt(i));
			}else {
				output += Character.toUpperCase(string.charAt(i));
			}
			System.out.println(output);
		}
	}

}
