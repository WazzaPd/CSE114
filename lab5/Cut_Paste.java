/*
 * Joseph Wu
 * SBU ID: 115930340
 * CSE 114
 * Lab #5
 */

import java.util.*;

public class Cut_Paste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String sentence = input.next();
		
		System.out.print("Enter a value for spin: ");
		int spin = input.nextInt();
		
		int length = sentence.length();
		int index = length+(spin%length);
		String senA;
		String senB;
		
		index = index%length;
		senA = sentence.substring(index);
		senB = sentence.substring(0, index);
		
		String combine = senA+senB;
		System.out.print("Spined string: "+combine);
		input.close();
	}
}
