/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab #11
 */
import java.util.*;

public class DivideStudents {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the grades for the two groups: ");
		int[][] arr = new int[2][8];
		double totalGroup1 = 0;
		double totalGroup2 = 0;
		for (int i = 0; i<8; i++) {
			arr[0][i] = input.nextInt();
			totalGroup1+=arr[0][i];
		}
		for (int i = 0; i<8; i++) {
			arr[1][i] = input.nextInt();
			totalGroup2+=arr[1][i];
		}
		
		System.out.println("Average for group 1 is: "+totalGroup1/8.00);
		System.out.println("Average for group 2 is: "+totalGroup2/8.00);
	}
}
