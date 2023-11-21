/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab #16
 */

public class sort {
	public static void main(String[] args) {
		int[][] arr = {{0, 1}, {1, 1}, {0, 0}, {-1,10}, {1, 10}, {2,5}};
		//int[][] arr = {{1, 7}, {1, 2}, {1, 1}, {4, 1}};
		sort(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i][0]+",");
			System.out.print(arr[i][1]+"  ");
		}
	}
	
	public static void sort(int[][] m) {
		int length = m.length;
		int width = m[0].length;
		int[][] newM = new int[length][width];
		
		//iterate through each element
		for(int i = 0; i<length-1; i++) {
			//check next num, if next num is equal to curr num
			int cur1 = m[i][0];
			int next1 = m[i+1][0];
			int cur2 = m[i][1];
			int next2 = m[i+1][1];
			//check next num, if next num is equal to curr num
			if(cur1==next1) {
				//check second num
				if(next2<cur2) {
					m[i][0] = next1;
					m[i][1] = next2;
					m[i+1][0] = cur1;
					m[i+1][1] = cur2;
					//if also lower than num before it, swap
					backwards(i, m);
				}
			} else if(next1<cur1) {
				m[i][0] = next1;
				m[i][1] = next2;
				m[i+1][0] = cur1;
				m[i+1][1] = cur2;
				backwards(i,m);
			}
		}
	}
	
	public static void backwards(int i, int[][] m) {
		for(;i>0; i--) {
			int curr1 = m[i][0];
			int curr2 = m[i][1];
			int before1 = m[i-1][0];
			int before2 = m[i-1][1];
			//if smaller swap with before
			if(curr1<before1 || (curr1==before1 && curr2<before2)) {
				m[i][0] = before1;
				m[i][1] = before2;
				m[i-1][0] = curr1;
				m[i-1][1] = curr2;
			} else {
				break;
			}
		}
	}
}
