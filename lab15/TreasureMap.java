/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab #15
 */

import java.util.Random;
import java.util.Scanner;

public class TreasureMap {
		private int rows, columns;
		private boolean[][] myGrid;
	
		public TreasureMap() {
			boolean newGrid[][] = {{false, true, true, false, true, false, true, false, false},
					{false, true, false, false, false, false, true, false, false},
					{false, true, false, true, true, false, false, true, true},
					{true, false, true, false, true, true, false, false, false},
					{false, true, false, false, true, false, false, true, false},
					{true, false, false, true, false, true, false, false, false,}};
			myGrid = newGrid;
		}
		
		public TreasureMap(int row, int col) {    
			this.rows = row;    
			this.columns = col;    
			myGrid = new boolean[row][col];    
			for(int i = 0; i<rows; i++) {     
				for(int a=0; a<columns; a++) {      
					if(Math.random()<0.5) {       
						myGrid[i][a]=true;      
						}     
					}    
				}   
			}
		
		public void printGrid() {
			for(int i = 0; i<rows; i++) {     
				for(int a=0; a<columns; a++) {  
					System.out.print(myGrid[i][a]+" ");
				}
				System.out.print("\n");
			}
		}


		public boolean hasTreasure(int row, int col) {
			int numRows = getNumRows();
			int numCols = getNumCols();
			if(row>=0 && row<numRows && col>=0 &&col<numCols) {
				if(myGrid[row][col]==true) {
					return true;
				}
			}
			return false;
		}

		public int numAdjacent(int row, int col) {
			int numRows = getNumRows();
			int numCols = getNumCols();
			boolean right = row+1<=numRows;
			boolean left = row-1>=0;
			boolean top = col-1>=0;
			boolean bot = col+1<=numCols;
			int count = 0;
			
			//check right side;
			if(right) {
				if(hasTreasure(row,col+1)) {
					count++;
				}
				if(top) {
					if(hasTreasure(row+1,col+1)) {
						count++;
					}
				}
				if(bot) {
					if(hasTreasure(row-1,col+1)) {
						count++;
					}
				}
			}
			//check left side;
			if(left) {
				if(hasTreasure(row,col-1)) {
					count++;
				}
				if(top) {
					if(hasTreasure(row+1,col-1)) {
						count++;
					}
				}
				if(bot) {
					if(hasTreasure(row-1,col-1)) {
						count++;
					}
				}
			}
			
			//check top and bottom
			if(top) {
				if(hasTreasure(row+1,col)) {
					count++;
				}
			}
			if(bot) {
				if(hasTreasure(row-1,col)) {
					count++;
				}
			}
			return count;
		}

		public int getNumRows() {
			return this.myGrid.length;
		}
			
		public int getNumCols() {
			return this.myGrid[0].length;
		}


	public static void main(String[] args) {
		System.out.println("Testcase Below VVV\n");
		TreasureMap theMap = new TreasureMap();
		System.out.println(theMap.hasTreasure(0, 2));
		System.out.println(theMap.hasTreasure(0, -1));
		System.out.println(theMap.hasTreasure(2, 3));
		System.out.println(theMap.hasTreasure(2, 2));
		System.out.println(theMap.hasTreasure(4, 9));
		System.out.println(theMap.numAdjacent(3, 3));
		System.out.println(theMap.numAdjacent(2, 4));
		System.out.println(theMap.numAdjacent(4, 7));
		
		TreasureMap newMap = new TreasureMap(3,3);
		System.out.println("\nNew Treasure Map Below VVV\n");
		newMap.printGrid();
		System.out.println("\n1,1 has tresure? "+newMap.hasTreasure(1, 1));
		System.out.println("How many treasure adjacent to 1,1: "+newMap.numAdjacent(1, 1));
		
		
	}

}
