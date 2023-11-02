/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Wu_Joseph#3
 */

import java.util.*;

public class Solution_4 {

	public static void main(String[] args) {
		int[] arr = closeSum(new int[] {-2, 13 ,-1, 3, 9, 5, -9, 4, 10});
		
	}
	
	public static int[] closeSum(int[] a) {
		int size = a.length;
		int[] newarr = new int[size*2];
		int newindex = 0;
		int closestSum = Integer.MAX_VALUE;
		//get the closest sum possible
		for(int i = 0; i<size; i++) {
			int check = a[i];
			
			for(int b = i+1; b<size; b++) {
				int against = a[b];
				int sum = Math.abs(0-(check+against));
				if(sum<closestSum && sum!=0) {
					closestSum = sum;
				}
			}
		}
		
		//get all pairs that make that sum
		for(int i = 0; i<size; i++) {
			int check = a[i];
			
			for(int b = i+1; b<size; b++) {
				int against = a[b];
				int sum = Math.abs(0-(check+against));
				if(sum==closestSum) {
					newarr[newindex]=check;
					newindex++;
					newarr[newindex] = against;
					newindex++;
					System.out.print("("+check+", "+against+") ");
					break;
				}
			}
		}
		
		//resize newarr
		int[] sumArr = new int[newindex];
		for(int i = 0; i<newindex; i++) {
			sumArr[i] = newarr[i];
		}
		
		return sumArr;
	}

}
