/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Wu_Joseph#3
 */

import java.util.*;

public class Solution_3 {

	public static void main(String[] args) {
		int[] array = interlaceArrays(new int[]{10,9,8}, new int[]{1,2,3}, 5, 20);
		
		if(array == null) {
			System.out.println(array);
		}else {
			for (int element: array) {
				System.out.print(element+" ");
			}
		}	
	}
	
	public static int[] interlaceArrays(int[] a1, int[] a2, int step, int maxE1) {
		//get sizes of a1 and a2
		int size1 = a1.length;
		int size2 = a2.length;
		//Declare and initialize a1 and a2 index to 0
		int index1 = 0, index2 = 0, index =0;
		int smaller = 0, larger = 0;
		
		//find larger, e1 or a1+a2
		if(maxE1 > size1+size2) {
			smaller= size1+size2;
			larger = maxE1;
		} else {
			smaller = maxE1;
			larger = size1+size2;
		}
		
		//if larger <= 0 then return null
		if(maxE1<=0 || step <= 0) {
			return null;
		} else{
		
			//declare new array size based on what smaller
			int[] interlaced = new int[smaller];
			
			//for loop based on max E1, add step
			for(int track = 0; track<maxE1;) {
		
				boolean a1Done = false;
				//for a1
				for(int reach = index1+step; index1<reach; index1++) {
					//if i is less than a1 size
					// else break
					if (index1<size1) {
						interlaced[index] = a1[index1];
						index++;
						track++;
					}else {
						a1Done = true;
						break;
					}
				}
				
				boolean a2Done = false;
				//for a2
				for(int reach = index2+step; index2<reach; index2++) {
					//if i is less than a1 size
					// else break
					if (index2<size2) {
						interlaced[index] = a2[index2];
						index++;
						track++;
					}else {
						a2Done = true;
						break;
					}
				}
				
				//If both lists have been parsed, exit
				if(a1Done&&a2Done) {
					break;
				}
			}
		return interlaced;
		}
	}
}
