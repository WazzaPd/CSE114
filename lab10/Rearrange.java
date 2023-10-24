/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab #10
 */
import java.util.*;

public class Rearrange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int size = input.nextInt();
		int[] arr = new int[size];
		
		System.out.print("Enter an array of 9 elements: ");		
		for(int i = 0; i<size; i++) {
			arr[i] = input.nextInt();
		}
		
		int[] newarr = moveAround(arr);
		System.out.print("The new array is:");
		for(int i = 0; i<newarr.length; i++) {
			System.out.print(" "+ newarr[i]);
		}
		
	}
	
	public static int[] moveAround(int[] arr) {
		int[] newarr = new int[arr.length];
		int[] neg = new int[arr.length];
		int[] pos = new int[arr.length];
		
		int negindex = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]<0) {
				neg[negindex] = arr[i];
				negindex++;
			}
		}
		
		int posindex = 0;
		for(int a = 0; a<arr.length; a++) {
			if(arr[a]>=0) {
				pos[posindex] = arr[a];
				posindex++;
			}
		}
		
		for(int i = 0; i<negindex; i++) {
			newarr[i] = neg[i];
		}
		for(int i = 0; i<posindex; i++) {
			newarr[negindex+i] = pos[i];
		}
		
		
		return newarr;
	}

}
