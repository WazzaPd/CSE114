/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Wu_Joseph_Lab9
 */

import java.util.*;

public class Move {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size, countOnes;
		int[] nums, numsCopy;
		
		System.out.print("Enter the size of the array: ");
		size = input.nextInt();
		nums = new int[size];
		numsCopy = new int[size];
		System.out.print("Enter an array of " +size + " elements: ");
		for(int i = 0; i < size; i++) {
			nums[i] = input.nextInt();
		}
		countOnes = 0;
		int indexCopiedArray = 0;
		for(int i : nums) {
			if(i==1) {
				countOnes++;
			} else {
				numsCopy[indexCopiedArray] = i;
				indexCopiedArray++;
			}
		}
		for(int i = nums.length - countOnes; i<nums.length; i++) {
			numsCopy[i] = 1;
		}
		System.out.print("Original array is: ");
		for(int i = 0; i<nums.length; i++) {
			System.out.print(nums[i]+ " ");
		}
		System.out.print("\nAfter moving all 1's to the end of the array: ");
		for(int i = 0; i<numsCopy.length; i++) {
			System.out.print(numsCopy[i]+ " ");
		}
	}

}
