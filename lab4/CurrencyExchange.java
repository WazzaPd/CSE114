/*
 * Joseph Wu
 * SBU ID: 115930340
 * CSE 114
 * Lab #4
 */

import java.util.*;

public class CurrencyExchange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final float USD = (float)0.136195;
		final float EUR = (float)0.127132;
		final float GBP = (float)0.109262;
		
		System.out.println("Enter CYN Amount: ");
		int amount = input.nextInt();
		System.out.println("Exchange rate	USD		EUR		GBP");
		System.out.println(amount+" CYN	" + (amount*USD)+" USD	"+ (amount*EUR)+" EUR	"+ (amount*GBP)+" GBP");
	}
}
	
//		String base = "";
//		String converted = "";
//		double initial;
//		double result;
//		
//		System.out.println("Select a base currancy (CYN, USD, EUR, GBP): ");
//		base = input.next();
//		System.out.println("Enter Amount: ");
//		initial = input.nextFloat();
//		System.out.println("Convert to (CYN, USD, EUR, GBP): ");
//		converted = input.next();
//		
//		switch(base) {
//			case "CYN":
//				switch(converted) {
//				case "CYN":
//					result = initial;
//					System.out.println("Converted "+base+" to "+converted+": "+result);
//					break;
//				case "USD":
//					result = initial*USD;
//					System.out.println("Converted "+base+" to "+converted+": "+result);
//					break;
//				case "EUR":
//					result = initial*EUR;
//					System.out.println("Converted "+base+" to "+converted+": "+result);
//					break;
//				case "GBP":
//					result = initial*GBP;
//					System.out.println("Converted "+base+" to "+converted+": "+result);
//					break;
//				}
//				break;
//			case "USD":
//				switch(converted) {
//				case "CYN":
//					result = initial/USD;
//					System.out.println("Converted "+base+" to "+converted+": "+result);
//					break;
//				case "USD":
//					result = initial;
//					System.out.println("Converted "+base+" to "+converted+": "+result);
//					break;
//				case "EUR":
//					result = (initial/USD)*EUR;
//					System.out.println("Converted "+base+" to "+converted+": "+result);
//					break;
//				case "GBP":
//					result = (initial/USD)*GBP;
//					System.out.println("Converted "+base+" to "+converted+": "+result);
//					break;
//				}
//				break;
//			case "EUR":
//				switch(converted) {
//				case "CYN":
//					result = initial/EUR;
//					System.out.println("Converted "+base+" to "+converted+": "+result);
//					break;
//				case "USD":
//					result = (initial/EUR)*USD;
//					System.out.println("Converted "+base+" to "+converted+": "+result);
//					break;
//				case "EUR":
//					result = initial;
//					System.out.println("Converted "+base+" to "+converted+": "+result);
//					break;
//				case "GBP":
//					result = (initial/EUR)*USD;
//					System.out.println("Converted "+base+" to "+converted+": "+result);
//					break;
//				}
//				break;
//			case "GBP":
//				switch(converted) {
//				case "CYN":
//					result = initial/GBP;
//					System.out.println("Converted "+base+" to "+converted+": "+result);
//					break;
//				case "USD":
//					result = (initial/GBP)*USD;
//					System.out.println("Converted "+base+" to "+converted+": "+result);
//					break;
//				case "EUR":
//					result = (initial/GBP)*EUR;
//					System.out.println("Converted "+base+" to "+converted+": "+result);
//					break;
//				case "GBP":
//					result = initial;
//					System.out.println("Converted "+base+" to "+converted+": "+result);
//					break;
//				}
//				break;
//		}
//	}
//}


//public class CurrencyExchange {
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//	
//		String base = "";
//		String converted = "";
//		float initial;
//		float result;
//		float medium;
//		System.out.println("Select a base currancy (CYN, USD, EUR, GBP): ");
//		
//		base = input.next();
//		System.out.println("Enter Amount: ");
//		initial = input.nextFloat();
//		
//		System.out.println("Convert to (CYN, USD, EUR, GBP): ");
//		
//		converted = input.next();
//		
//		if (base.equals("CYN")) {
//			if (converted.equals("CYN")) {
//				
//				result = initial;
//				System.out.println("Converted "+base+" to "+converted+": "+result);
//			
//			} else if (converted.equals("USD")) {
//				
//				result = (float) (initial*0.136195);
//				System.out.println("Converted "+base+" to "+converted+": "+result);
//				
//			} else if (converted.equals("EUR")) {
//				
//				result = (float) (initial*0.127132);
//				System.out.println("Converted "+base+" to "+converted+": "+result);
//				
//			} else if (converted.equals("GBP")) {
//				
//				result = (float) (initial*0.109262);
//				System.out.println("Converted "+base+" to "+converted+": "+result);
//				
//			} else {
//				System.out.println("Invalid currency entered: " + converted);
//			}
//		} else if (base.equals("USD")) {
//			if (converted.equals("CYN")) {
//				medium = 1/0.136195
//			} else if (converted.equals("USD")) {
//				
//			} else if (converted.equals("EUR")) {
//				
//			} else if (converted.equals("GBP")) {
//				
//			} else {
//				System.out.println("Invalid currency entered: " + converted);
//			}
//			
//		} else if (base.equals("EUR")) {
//			if (converted.equals("CYN")) {
//				
//			} else if (converted.equals("USD")) {
//				
//			} else if (converted.equals("EUR")) {
//				
//			} else if (converted.equals("GBP")) {
//				
//			} else {
//				System.out.println("Invalid currency entered: " + converted);
//			}
//			
//		} else if (base.equals("GBP")) {
//			if (converted.equals("CYN")) {
//				
//			} else if (converted.equals("USD")) {
//				
//			} else if (converted.equals("EUR")) {
//				
//			} else if (converted.equals("GBP")) {
//				
//			} else {
//				System.out.println("Invalid currency entered: " + converted);
//			}
//			
//		} else {
//			System.out.println("Invalid currency entered: " + base);
//		}
//	}
//}



