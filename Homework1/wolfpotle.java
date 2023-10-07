/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Homework #1
 */

import java.util.*;

public class wolfpotle {

	public static void main(String[] args) {
		final float chicken = 8.35f;
		final float steak = 9.70f;
		final float veggie = 8.85f;
		final float guacamole = 2.50f;
		final float salsa = 1.75f;
		final float chip = 1.95f;
		
		String protein = "";
		String topping = "";
		String chips = "";
		float total = 0.00f;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Select a protein (chicken, steak, veggie): ");
		protein = input.next();
		
		
		System.out.println("Select a topping (guacamole, salsa): ");
		topping = input.next();
		if (!(topping.equals("guacamole")| topping.equals("salsa"))) {
			System.out.println("Invalid topping selected");
		}
		
		
		System.out.println("Would you like a side order of chips? (yes|no): ");
		chips = input.next();
		if (!(chips.equals("yes")| chips.equals("no"))) {
			System.out.println("Invalid choice of chips selected");
		}
		
		switch(protein) {
			case "chicken":
				total += chicken;
				break;
			case "steak":
				total += steak;
				break;
			case "veggie":
				total += veggie;
				break;
		}
		switch (topping) {
			case "guacamole":
				total += guacamole;
				break;
			case "salsa":
				total += salsa;
				break;
		}
		switch(chips) {
			case "yes":
				total += chip;
				break;
		}
		
		System.out.println("Your total is: $"+total);
		input.close();
	}
}
