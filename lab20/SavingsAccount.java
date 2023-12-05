/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab20
 */

public class SavingsAccount extends SimpleBankAccount{
	private double interestRate;
	
	public SavingsAccount() {
		super();
	}
	public SavingsAccount(double balance, String accountID, double interestRate) {
		super(balance, accountID);
		this.interestRate = interestRate;
	}
	public void applyInterest() {
		double balance = getBalance();
		deposit(interestRate*balance);
	}
	public double interest() {
		return interestRate;
	}
	
	@Override
	public String toString() {
		return "\033[4mChecking\033[0m Account:\n"
				+ super.toString() + 
				"\n\033[4mAPR\033[0m: \033[4m" + interestRate*100 + "\033[0m%\n";
	}
}
