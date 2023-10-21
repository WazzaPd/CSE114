/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Wu_Joseph#2
 */

import java.util.*;

public class Is_Binary {

	public static void main(String[] args) {
		//declare string numbers
		String numbers;
		//create scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Binary Sequence: ");
		//get user input, store in numbers
		numbers = input.next();
		String output = calc(numbers);
		System.out.println(output);
		input.close();
	}

	
	public static String calc(String numbers) {
		//create int flag for counting
		int count = 0;
		//create boolean flag for consecutive 11s
		boolean consecutive = false;
		
		//for loop to iterate over numbers
		for(int i = 0; i<numbers.length(); i++) {
			//if a non 1 or 0 number detected, set valid to false, break
			if(numbers.charAt(i)!=('1')&&numbers.charAt(i)!=('0')) {
				return ("The input word is not a valid binary number");
			}
			//raise count by 1 for every 1, when not 1, count = 0
			if(numbers.charAt(i)==('1')) {
				count++;
				//if count == 3, set consecutive to true
				if(count == 3) {
					consecutive = true;
				}
			}else {
				count = 0;
			}
		}
		if(consecutive) {
			return("The binary word is accepted");
		}else {
			return("The binary word is rejected");
		}
	}
}
