/*
 * Joseph Wu
 * SBU ID: 115930340
 * CSE 114
 * Lab #4
 */

import java.util.*;

public class ImperialToMetric {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double inches;
		double feet;
		double meters;
		
		System.out.println("Enter the number of inches: ");
		inches = input.nextInt();
		
		System.out.println("Enter the number of feet: ");
		feet = input.nextInt();
		meters = (0.3048*feet) + ((inches/12)*0.3048);
		System.out.println("The length is: " + meters);
	}
}
