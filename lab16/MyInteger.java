/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab #16
 */

public class MyInteger {
	private int value;
	
	public MyInteger(int n) {
		this.value = n;
	}
	
	public int getValue(){
		return this.value;
	}
	public boolean isEven(MyInteger n) {
		return n.getValue()%2==0;
	}
	public boolean isOdd(MyInteger n) {
		return n.getValue()%2==1;
	}
	public boolean isPrime(MyInteger n) {
		for(int i = 2; i<Math.sqrt(n.getValue()); i++) {
			if(n.getValue()%i==0) {
				return false;
			}
		}
		return true;
	}
	public boolean equals(int n) {
		return value==n;
	}
	public boolean equals(MyInteger n) {
		return value==n.getValue();
	}

	public static void main(String[] args) {
//		int[][] arr = {{1, 7}, {1, 2}, {1, 1}, {4, 1}};
//		sort(arr);
//		for(int i = 0; i<arr.length; i++) {
//			System.out.print(arr[i][0]+",");
//			System.out.print(arr[i][1]+"  ");
//		}
		System.out.println("This is MyInteger VVV\n");
		MyInteger integer = new MyInteger(11);
		System.out.println("getValue: "+integer.getValue());
		System.out.println("isEven: "+integer.isEven(integer));
		System.out.println("isOdd: "+integer.isOdd(integer));
		System.out.println("isPrime: "+integer.isPrime(integer));
		System.out.println("equals 10 int: "+integer.equals(10));
		MyInteger newInt = new MyInteger(10);
		System.out.println("integer.value equals MyInteger: "+integer.equals(newInt));
	}

}
