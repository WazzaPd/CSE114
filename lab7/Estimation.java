/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Wu_Joseph_Lab7
 */

import java.util.*;

public class Estimation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int n = input.nextInt();
		System.out.println("Enter your estimation: ");
		double estimation = input.nextDouble();
		
		while(Math.abs(estimation - Math.sqrt(n))>0.00001){
			estimation = ((n/estimation )+estimation)/2.0;
		}
		
		System.out.println("The approximated square root is: "+estimation);
		input.close();	
		}

}