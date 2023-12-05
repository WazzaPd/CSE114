/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab20
 */

public class CheckingAccount extends SimpleBankAccount{
	private int checkNum;
	
	public CheckingAccount() {
		super();
	}
	public CheckingAccount(double balance, String accountID) {
		super(balance, accountID);
	}
	public boolean processCheck( int checkNum, double amount) {
		if(this.checkNum == checkNum) {
			return false;
		} 
		this.checkNum=checkNum;
		withdraw(amount);
		return true;
	}
	public int check() {
		return checkNum;
	}
	
	@Override
	public String toString() {
		return "\033[4m" + "Checking" + "\033[0m" + " Account:\n"
				+ super.toString() + 
				"\nLast processed" + " check number: " + "\033[4m" + checkNum + "\033[0m\n";
	}
}
