/*
 * Joseph Wu
 * SBU ID: 115930340
 * CSE 114
 * Lab #2
 */

import java.util.*;

public class AverageAcceleration {
	
	public static void main(String[] args) {
		double a;
		double v1;
		double v0;
		double t;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the v0, v1, and t: ");
		v0 = input.nextDouble();
		v1 = input.nextDouble();
		t = input.nextDouble();
		
		a = (v1-v0)/t;
		System.out.println("The average acceleration is "+a);
	}
	
}
