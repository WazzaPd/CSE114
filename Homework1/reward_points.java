/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Homework #1
 */

import java.util.*;

public class reward_points {
	public static void main(String[] args) {
		System.out.println("Enter your purchase (category purchase_total current_points): ");
		final float gas = 0.05f;
		final float dining = 0.1f;
		final float other = 0.01f;
		
		String category ="";
		float purchase = 0.00f;
		int points = 0;
		int current_points = 0;
		
		Scanner input = new Scanner(System.in);
		category = input.next();
		purchase = input.nextFloat();
		current_points = input.nextInt();
		
		switch(category) {
		case "gas":
		case "groceries":
			points = (int)(purchase*gas);
			break;
		case "dining":
			points = (int)(purchase*dining);
			break;
		default:
			points = (int)(purchase*other);
			break;
		}
		
		//bonus 5 for at least 10
		if(points>=10) {
			points+=5;
		}
		
		points += current_points;
		System.out.println("New Amount of Points: "+points);
		input.close();
	}
}
