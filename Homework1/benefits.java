/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Homework #1
 */

import java.util.*;

public class benefits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float q1,q2,q3,q4;
		float average_weekly_wage;
		
		System.out.println("Enter last four quarters of income (q1 q2 q3 q4): ");
		q1 = input.nextFloat();
		q2 = input.nextFloat();
		q3 = input.nextFloat();
		q4 = input.nextFloat();
		
		if(q2+q3 > 0) {
			average_weekly_wage = (float)((q1+q2)/26);
		} else {
			average_weekly_wage = q1/13;
		}
		
		float weekly_benefit_amount = average_weekly_wage/2;
		float maximum_benefit_credit;
		
		if(weekly_benefit_amount *26 < 0.36*(q1+q2+q3+q4)) {
			maximum_benefit_credit = weekly_benefit_amount *26;
		}else {
			maximum_benefit_credit = (float)(0.36*(q1+q2+q3+q4));
		}
		
		System.out.println("Your Maximum Benefit Credits: $"+maximum_benefit_credit);
		input.close();
	}
}
