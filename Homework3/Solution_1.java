/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Wu_Joseph#3
 */

import java.util.*;

public class Solution_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a phone number: ");
		String pNumber = input.next();
		
		System.out.println(phoneDigits(pNumber));
		
	}
	
	public static String phoneDigits(String pNumber) {
		String[] convert = {" "," ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		String number = "";
		
		boolean done = false;
		while(!done) {
			if(pNumber.indexOf("-") != -1) {
				int i = pNumber.indexOf("-");
				pNumber = pNumber.substring(0, i) + pNumber.substring(i+1);
			}else {
				done = true;
			}
		}
		pNumber = pNumber.toLowerCase();
		
		for (int i = 0; i<pNumber.length(); i++) {
			char current = pNumber.charAt(i);
			int curNum = 0;
			if(Character.isDigit(current)) {
				number+=current;
			}else {
				for(int find = 0; find<convert.length; find++) {
					if(convert[find].indexOf(current)!=-1) {
						curNum = find;
						break;
					}
				}
				number+=curNum;
			}
		}
		return number;
	}

}
