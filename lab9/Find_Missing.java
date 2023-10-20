/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Wu_Joseph_Lab9
 */

import java.util.*;

public class Find_Missing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = input.nextInt() - 1;
		System.out.println("Enter an array of size " +(size+1)+": ");
		int[] nums;
		nums = new int[size];
		for(int i = 0; i < size; i++) {
			nums[i] = input.nextInt();
		}
		boolean missing = true;
		for(int i = 1; i <=size; i++) {
			for(int a = 0; a<nums.length; a++) {
				if(nums[a]==i) {
					missing = false;
					break;
				}
			}
			if(missing) {
				System.out.println("The missing number is "+i);
				break;
			}
			missing = true;
			if(i==size) {
				for(int a = 0; a<nums.length; a++) {
					if(nums[a]==i+1) {
						missing = true;
						break;
					}
				}
				if(missing) {
					System.out.println("The missing number is "+(i+1));
					break;
				}
			}
		}
		input.close();
	}

}
