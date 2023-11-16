/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab #14
 */

public class HourlyRate {
	private int monthlyPay;
	private int monthlyHours;
	
	public HourlyRate() {
		monthlyPay = 10000;
		monthlyHours = 140;
	}
	
	public float calculate() {
		return (float)this.monthlyPay/this.monthlyHours;
	}

	public static void main(String[] args) {
		HourlyRate job = new HourlyRate();
		System.out.printf("%.2f",job.calculate());
	}

}
