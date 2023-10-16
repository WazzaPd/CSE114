/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Wu_Joseph_Lab8
 */

public class Sum {

	public static void main(String[] args) {
		// call method
		summation();
	}
	
	public static void summation() {
		//print the werid thing
		System.out.println("i		s(i)");
		//print the line
		System.out.println("-------------");
		//initialize total as 0
		float total = 0;
		//for loop up 1 - 20
		for(int i = 1; i<=20; i++) {
			//total += i/(+1)
			total += (float)i/(float)(i+1);
			//print i then print total
			System.out.println(i+"		"+total);
		}
	}

}
