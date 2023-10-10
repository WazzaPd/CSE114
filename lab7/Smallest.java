/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Wu_Joseph_Lab7
 */

public class Smallest {
	public static void main(String args[]) {
		int estimate = 0;
		while(Math.pow(4, estimate)<100000) {
			estimate++;
		}
		System.out.println("The smallest interger such that 4^m > 100,000 is "+ estimate);
	}
}
