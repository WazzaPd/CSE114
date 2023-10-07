/*
 * Joseph Wu
 * SBU ID: 115930340
 * CSE 114
 * Lab #6
 */

import java.util.*;

public class CreditCard {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String accountNumber;
		System.out.println("Enter your account number: ");
		accountNumber = input.next();
		
		int digits = accountNumber.length();
		
		if(digits<15 || digits>17) {
			System.out.println("Error");
		} else {
			int starter = Integer.valueOf(accountNumber.substring(0,1));
			switch(digits) {
			case 15:
				if (starter == 3) {
					System.out.println("American Express");
				} else {
					System.out.println("Error");
				}
				break;
			case 16:
				
				switch(starter) {
				case 4:
					System.out.println("Visa");
					break;
				case 5:
					System.out.println("MasterCard");
					break;
				case 6:
					System.out.println("Discover");
					break;
				default:
					System.out.println("Error");
				}
				
				break;
			case 17:
				int end = Integer.valueOf(accountNumber.substring(digits-2));
				if(starter == 8 && end == 92) {
					System.out.println("WildCard");
				}else {
					System.out.println("Error");
				}
				break;
			}
		}
		input.close();
	}

}
