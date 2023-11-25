/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Homework #4
 */

public class Homework4Methods {

	public static void main(String[] args) {
		int[][] nums = {{1, 2, 3},{-1, -2, -3, -4, -5},{6, 7, 8, 9},{10, 11}};
		
		rotateRight(nums,7);
		
		System.out.println("rotateRight(nums,7) results:\n");
		for(int i = 0; i<nums.length; i++) {
			for(int a = 0; a<nums[i].length; a++) {
				System.out.print(nums[i][a]+" ");
			}
			System.out.println();
		}
		
		int[][] nums2D = new int[][]{
			{5,5,0,5,2},{1,2,2,2,2},{2,4,2,2,2},
			{2,2,2,2,2},{3,3,2,2,2},{4,4,2,2,0},
			{4,2,2,2,8}};
			
		System.out.println("\nprintRuns(nums2D,4) Results:\n");
		printRuns(nums2D,4);


	}
	
	public static void rotateRight(int[][] matrix, int numCols) {
		//shift for every row
		for(int i =0; i<matrix.length; i++) {
			//shift numCols amount of times
			for(int a = 0;a<numCols; a++) {
				//shift one to the right
				int store = matrix[i][0];
				int current = 0;
				for(int b = 0; b<matrix[i].length; b++) {
					if(b!=matrix[i].length-1) {
						current = store;
						store = matrix[i][b+1];
						matrix[i][b+1] = current;
					}else {
						matrix[i][0] = store;
					}
				}
			}
		}
	}
	public static void printRuns(int[][] values, int runLength) {
		int rows = values.length;
		int cols = values[0].length;
		
		//check horizontal runs
		for(int i = 0; i<rows;i++) {
			for(int a = 0; a<=cols-runLength; a++) {
				boolean run = true;
				int check = values[i][a];
				for(int b = a; b<a+runLength;b++) {
					if(values[i][b]!=check) {
						run = false;
						break;
					}
				}
				if(run) {
					System.out.println("Row "+i+", columns "+a+"-"+(a+runLength-1));
				}
			}
		}
		
		//check Vertical runs
		for(int i = 0; i<cols;i++) {
			for(int a = 0; a<=rows-runLength; a++) {
				boolean run = true;
				int check = values[a][i];
				for(int b = a; b<a+runLength;b++) {
					if(values[b][i]!=check) {
						run = false;
						break;
					}
				}
				if(run) {
					System.out.println("Column "+i+", rows "+a+"-"+(a+runLength-1));
				}
			}
		}
	}
}
