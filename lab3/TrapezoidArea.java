/*
 * Joseph Wu
 * SBU ID: 115930340
 * CSE 114
 * Lab #3
 */

import java.util.*;

public class TrapezoidArea {
	public static void main(String[] args) {
		
		float b1;
		float b2;
		float h;
		float area;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter base 1: ");
		b1 = input.nextFloat();
		
		System.out.println("Enter base 2: ");
		b2 = input.nextFloat();
		
		System.out.println("Enter the height: ");
		h = input.nextFloat();
		
		area = (b1+b2)*(h/2);
		System.out.println("The area of the trapezoid is: " + area);
	}
}
