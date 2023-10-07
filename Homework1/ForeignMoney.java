/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Homework #1
 */

import java.util.*;

public class ForeignMoney {

	public static void main(String[] args) {
		final int brick = 50*60*6;
		final int stack = 60*6;
		final int line = 6;
		int dots,bricks,stacks,lines;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of dots: ");
		dots = input.nextInt();
		
		bricks = (dots-(dots%brick))/brick;
		dots = dots%brick;
		
		stacks = (dots-(dots%stack))/stack;
		dots = dots%stack;
		
		lines = (dots-(dots%line))/line;
		dots = dots%line;
		
		System.out.println("The number of dots is the same as:\n"
				+bricks+" bricks\n"
				+stacks+" stacks\n"
				+lines+" lines\n"
				+dots+" dots");
		input.close();
	}

}
