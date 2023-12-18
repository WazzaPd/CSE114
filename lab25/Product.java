/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab24
 */

public class Product {
	public static void main(String args[]) {
		int[] array = {1, 3, 6, 7, 8};
		System.out.println(Calculateproduct(array));
	}
	
	public static int Calculateproduct(int ar[]) {
		return Calculateproduct(ar, 0);
	}
	public static int Calculateproduct(int ar[], int index){
		if(index == ar.length) {
			return 1;
		}
		return ar[index] * Calculateproduct(ar, index+1);
	}
}
