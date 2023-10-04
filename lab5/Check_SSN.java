/*
 * Joseph Wu
 * SBU ID: 115930340
 * CSE 114
 * Lab #5
 */

import java.util.*;

public class Check_SSN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a SSN: ");
		
		String ssn = input.next();
		
		int count = 0;
		int no = 0;
		if(ssn.length()!=11) {
			no = 1;
		}else {
			if(!(Character.isDigit(ssn.charAt(0)))){
				no = 1;
			}
			if(!(Character.isDigit(ssn.charAt(1)))){
				no = 1;
			}
			if(!(Character.isDigit(ssn.charAt(2)))){
				no = 1;
			}
			if((Character.isDigit(ssn.charAt(3)))){
				no = 1;
			}
			if(!(Character.isDigit(ssn.charAt(4)))){
				no = 1;
			}
			if(!(Character.isDigit(ssn.charAt(5)))){
				no = 1;
			}
			if((Character.isDigit(ssn.charAt(6)))){
				no = 1;
			}
			if(!(Character.isDigit(ssn.charAt(7)))){
				no = 1;
			}
			if(!(Character.isDigit(ssn.charAt(8)))){
				no = 1;
			}
			if(!(Character.isDigit(ssn.charAt(9)))){
				no = 1;
			}
			if(!(Character.isDigit(ssn.charAt(10)))){
				no = 1;
			}
		}
		if(no==1) {
			System.out.println(ssn+" is an invalid social security number");
		} else {
			System.out.println(ssn +" is a valid social security number");
		}
		input.close();
		
//		int i = 0;
//		for(i = 0; i<ssn.length(); i++) {
//			if (i < 3 && !(Character.isDigit(ssn.charAt(i))) && count!=3) {
//				no = 1;
//				break;
//			}
//			else if(3<i && i<6  && !(Character.isDigit(ssn.charAt(i))) && count!=2){
//				no = 1;
//				break;
//			}
//			else if(6<i && i<11  && !(Character.isDigit(ssn.charAt(i))) && count!=4){
//				no = 1;
//				break;
//			}
//			else {
//				count = 0;
//			}
//			count++;
//		}
//		if(no==1) {
//			System.out.println(ssn+" is an invalid social security number");
//		} else {
//			System.out.println(ssn +" is a valid social security number");
//		}
//		input.close();
	}
}
