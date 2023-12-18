/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab24
 */

public class countUppercase {
	public static void main(String args[]) {
		System.out.println(count("WolFIE"));
	}
	public static int count(String str) {
		return count(str, 0);
	}
	
	public static int count(String str, int high) {
		//Base Case
		if(high >= str.length()) {
			return 0;
		}
		//check if character is uppercase
		if(Character.isUpperCase(str.charAt(high))) {
			return 1+count(str, high +1);
		} else {
			return count(str, high+1);
		}
	}
}
