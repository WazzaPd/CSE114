/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Wu_Joseph_Lab8
 */

import java.util.*;

public class Password {

	public static void main(String[] args) {
		//get password and store in string
		Scanner input = new Scanner(System.in);
		boolean valid = false;
		boolean upper = false;
		boolean lower = false;
		boolean exclamation = false;
		String password;
		//loop until password valid
		do {
			System.out.println("Please enter a password: ");
			password = input.next();
			//check if less than 10 or longer than 20, if so, try again
			if(password.length()<10) {
				System.out.println("The password is too short. Must be at least 10 characters.");
			} else if(password.length()>20) {
				System.out.println("The password is too long. Must be no more than 20 characters.");
			} else{
				for(int i = 0; i<password.length(); i++) {
					//check if there is upper
					if(Character.isUpperCase(password.charAt(i))) {
						upper = true;
					}
					//check if there is lower
					if(Character.isLowerCase(password.charAt(i))) {
						lower = true;
					}
					//check if there is exclamation
					if(password.charAt(i) == '!') {
						exclamation = true;
					}
				}
				//if there is upper and lower, valid
				if(upper&&lower) {
					valid = true;
				}
				//else if there is upper, valid
				else if(upper&&!exclamation) {
					valid = true;
				}
				//else if there is lower and exclamation, valid
				else if(lower&&exclamation) {
					valid = true;
				}
				//else invalid and print that it needs exclamation
				else {
					System.out.println("The password is all lowercase, so it must contain the character ! to be secure.");
				}
			}
			
		} while(!valid);
		System.out.println("Your password "+password+" is secure");
	}

}
