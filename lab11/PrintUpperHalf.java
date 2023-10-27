/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab #11
 */
import java.util.*;

public class PrintUpperHalf {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input: ");
		String line = input.nextLine();
		
		//Find number of ints in line
		int count = 0;
		for(int i = 0; i<line.length(); i++) {
			if(line.charAt(i)!= ' ') {
				count++;
			}
		}
		int[][] arr = new int[count][count];
		int index = 0;
		// initailize first row of 2d array
		for(int i = 0; i<line.length(); i++) {
			if(line.charAt(i)!= ' ') {
				arr[0][index] = Integer.parseInt(line.substring(i,i+1));
				index++;
			}
		}	
		// initialize rest of two d array
		for (int i = 1; i<count; i++) {
			for (int a = 0; a<count; a++) {
				arr[i][a] = input.nextInt();
			}
		}
		
		Print(arr);
	}
	
	public static void Print(int[][] arr) {
		int size = arr.length;
		System.out.println("Output");
		for(int i = 0; i<size; i++) {
			for(int a = 0; a<size; a++) {
				if(a<i) {
					System.out.print("  ");
				}else {
					System.out.print(arr[i][a]+" ");
				}
			}
			System.out.print("\n");
		}
	}

}
