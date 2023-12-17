/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab24
 */

import java.util.Scanner;

public class HailStoneSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, length;

		do {
			System.out.print("Enter a positive integer: ");
			num = input.nextInt();
			if(num<=0)
				System.out.println("nUmber must be greater than 0.");
		}while(num <= 0);
		
		length = hailstone(num);
		System.out.println("length of hailstone sequence: "+ length);
	}
	
	public static int hailstone(int n) {
		return hailstoneHelper(n, 1);
	}
	
	public static int hailstoneHelper(int n, int length) {
		if(n == 1) {
			return length;
		}
		length++;
		if(n%2 ==0) {
			n/=2;
			return hailstoneHelper(n, length);
		}else {
			n = n*3 +1;
			return hailstoneHelper(n, length);
		}
	}

}
