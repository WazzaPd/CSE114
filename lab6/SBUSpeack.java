/*
 * Joseph Wu
 * SBU ID: 115930340
 * CSE 114
 * Lab #6
 */

import java.util.*;

public class SBUSpeack {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input: ");
		String sentence = input.nextLine();
		
		int index = sentence.length()-4;
		String wolf = sentence.substring(index);
		if(wolf.equals("wolf")) {
			sentence += "mageddon";
		}
		else if(sentence.substring(sentence.length()-2).equals("er")) {
			sentence = sentence.substring(0,sentence.length()-2) + "ah";
		}
		else if(sentence.substring(sentence.length()-3).equals("ork")) {
			sentence = sentence.substring(0,sentence.length()-3) + "awk";
		}
		
		for (int i = 0; i<sentence.length()-1;i++) {
			if(sentence.substring(i, i+2).equals("oo")) {
				sentence = sentence.substring(0,i) + "ee" + sentence.substring(i+2);
				break;
			}
		}
		for (int i = 0; i<sentence.length();i++) {
			if(sentence.charAt(i) == 'r') {
				sentence = sentence.substring(0,i) + "l" + sentence.substring(i+1);
			}
			else if((sentence.charAt(i) == 'l')) {
				sentence = sentence.substring(0,i) + "r" + sentence.substring(i+1);
			}
		}
		System.out.println("Output:\n" + sentence);
		input.close();
	}

}
