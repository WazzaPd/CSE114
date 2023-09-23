/*
 * Joseph Wu
 * SBU ID: 115930340
 * CSE 114
 * Lab #2
 */

import java.util.*;

public class Energy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double water;
		double intemp;
		double fintemp;
		double CalcEnergy;
		
		System.out.println("Enter the amount of water in kilograms: ");
		water = input.nextDouble();
		System.out.println("Enter the initial temperature: ");
		intemp = input.nextDouble();
		System.out.println("Enter the final temperature: ");
		fintemp = input.nextDouble();
		CalcEnergy = (water*(fintemp - intemp)) * 4184;
		System.out.println("\nThe energy needed is " + CalcEnergy);
	}
}
