/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Wu_Joseph#3
 */

import java.util.*;

public class Solution_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 integers: ");
		int[] array = new int[10];
		for(int i = 0; i<10; i++) {
			array[i] = input.nextInt();
		}
		
		int[] distinct = deleteDuplicate(array);
		
		System.out.print("The distinct integers are:");
		for(int i =0; i<distinct.length; i++) {
			System.out.print(" "+distinct[i]);
		}
	}
	
	public static int[] deleteDuplicate(int[] list) {
		int size = list.length;
		int[] duplicate = new int[size];
		
		int index = 0;
		for(int i = 0; i<size; i++) {
			boolean original = true;
			for(int find = 0; find<size; find++) {
				if(duplicate[find] == list[i]) {
					original = false;
					break;
				}
			}
			if(original) {
				duplicate[index] = list[i];
				index++;
			}
		}
		
		int[] resized = new int[index];
		for(int i = 0; i<index;i++) {
			resized[i] = duplicate[i];
		}
		
		return resized;
	}
}
