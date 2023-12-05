/**
 * Simple representation of a bank account
 *
*/

import java.text.NumberFormat;  // look at //https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html


public class SimpleBankAccount{
    // fields (instance variables)
    private double balance;
    private String accountId;

    /**
     * Constructor for objects of class SimpleBankAccount
     */
    public SimpleBankAccount(){
        balance = 0.0;
        accountId = "";
    }

    /**
     * Constructor for objects of class SimpleBankAccount
     */
    public SimpleBankAccount( double bal, String id ){
        balance = bal;
        accountId = id;
    }

    /**
     * Add money to the balance
     *
     */
    public void deposit( double amount ){
        balance += amount;
    }

    /**
     * Remove money from the balance
     */
    public boolean withdraw( double amount ){
        if( balance - amount >= 0 ){
            balance -= amount;
            return true;
        }else{
            return false;
        }
    }

    /**
     * Get the balance
     *
     */
    public double getBalance(){
         return balance;
    }

    /**
     * Set account ID
     *
     * @param the account ID
     */
    public void setAccountId(String id){
         accountId = id;
    }


    /**
     * Get the account ID
     *
     */
    public String getAccountId(){
         return accountId;
    }

    /**
     * Produces a string representation of the balance
     */
    public String toString( ){
        // display balance as currency
        String balanceStr = NumberFormat.getCurrencyInstance().format( balance );
        return "\033[4mBalance\033[0m for account \033[4m" + accountId + "\033[0m: " + "\033[4m" + balanceStr + "\033[0m";
    }
    @Override
	public boolean equals(Object obj) {
		double objBalance = 0;
	    String objAccountId = "";
	    double objInterestRate;
	    int objCheckNum;
		if(obj instanceof SavingsAccount) {
			objBalance = ((SavingsAccount) obj).getBalance();
			objAccountId = ((SavingsAccount) obj).getAccountId();
			objInterestRate = ((SavingsAccount) obj).interest();
		} else if(obj instanceof CheckingAccount) {
			objBalance = ((CheckingAccount) obj).getBalance();
			objAccountId = ((CheckingAccount) obj).getAccountId();
			objCheckNum = ((CheckingAccount) obj).check();
		}
		
		if(getBalance()==objBalance && getAccountId().equals(objAccountId)){
			return true;
		}
		return false;
	}
}
