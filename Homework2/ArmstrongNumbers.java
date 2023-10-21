/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Wu_Joseph#2
 */

import java.util.*;

public class ArmstrongNumbers {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter the Lower Limit: ");
		int lower = input.nextInt();
		System.out.print("Enter the Upper Limit: ");
		int upper = input.nextInt();
		
		int number = 0;
		int digits = 0;
		int temp = upper;
		while (temp != 0) {
            digits++;
            temp = temp/ 10;
        }
		int[] n = new int[digits];
		digits = 0;
		
		int total = 0;
		
		input.close();
		
		System.out.print("The Armstrong numbers between "+lower+" and "+upper+" are:");
		
		for (int current = lower; current<upper; current++) {
			number = current;
			while (number != 0) {
                digits++;
                number = number/ 10;
            }
			number = current;
			for (int a = digits-1; a >= 0; a--) {
				n[a] = (number%10);
				number /= 10;
			}
			for(int a = digits-1; a>= 0; a--) {
				total += Math.pow(n[a], digits);
			}
			if(total == current) {
				System.out.print(" "+total);
			}
			total = 0;
			digits = 0;
		}
	}

}
