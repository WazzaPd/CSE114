/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab #10
 */
import java.util.*;

public class Dominators {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int size = input.nextInt();
		int[] array = new int[size];
		
		System.out.print("Enter an array of 9 elements: ");		
		for(int i = 0; i<size; i++) {
			array[i] = input.nextInt();
		}
		
		int[] newarr = dominate(array);
		System.out.print("The dominators are:");
		for(int i = 0; i<size; i++) {
			if(newarr[i]!=0) {
				System.out.print(" "+newarr[i]);
			}
		}
	}
	
	public static int[] dominate(int[] array) {
		int[] newarr = new int[array.length];
		for(int i = 0; i < array.length-1;i++) {
			boolean dom = true;
			for(int a = i+1; a<array.length; a++) {
				if(array[i]<=array[a]) {
					dom = false;
					break;
				}
			}
			if(dom == true) {
				newarr[i] = array[i];
			}
		}
		return newarr;
		
	}
}
