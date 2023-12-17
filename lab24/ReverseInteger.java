/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab24
 */

import java.util.Scanner;

public class ReverseInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("Enter a number: ");
		num = input.nextInt();
		System.out.print("Number in reverse: ");
		reverseDisplay(num);
	}
	
	public static void reverseDisplay(int value) {
		if(value <0) {
			System.out.print("-");
			value *= -1;
		}
		reverseDisplayHelper(value);
	}
	
	public static void reverseDisplayHelper(int value) {
		if(value <10) {
			System.out.println(value);
			return;
		}
		System.out.print(value%10);
		reverseDisplayHelper(value/10);
	}
}
