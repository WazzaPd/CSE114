/** 
 * Exercises the basic functionality of a Checking and SavingsAccount
 *
*/
public class AccountsDriver{
	public static final double INTEREST_RATE = 0.01;  // 1%

    public static void main( String[] args ){
        CheckingAccount checking = new CheckingAccount( 100.0, "checking123" );
        SavingsAccount savings = new SavingsAccount( 1000.0, "savings124", INTEREST_RATE );

        CheckingAccount checkingCopy = new CheckingAccount( 100.0, "checking123" );
        SavingsAccount savingsCopy = new SavingsAccount( 1000.0, "savings124", INTEREST_RATE );

        if( checking.equals( checkingCopy ) == false ){
            System.err.println("ERROR: The following objects are equal:");
            System.err.println( checking );
            System.err.println( checkingCopy );
        }

        if( savings.equals( savingsCopy ) == false ){
            System.err.println("ERROR: The following objects are equal:");
            System.err.println( savings );
            System.err.println( savingsCopy );
        }

        int electricBillCheckNum = 2123;
        double electricBill = 60.34;
        double futureCar = 200.0;

        checking.processCheck( electricBillCheckNum, electricBill );

        savings.deposit( futureCar );
        savings.applyInterest( );

        if( checking.equals( checkingCopy ) == true ){
            System.err.println("ERROR: The following objects are NOT equal:");
            System.err.println( checking );
            System.err.println( checkingCopy );
        }

        if( savings.equals( savingsCopy ) == true ){
            System.err.println("ERROR: The following objects are NOT equal:");
            System.err.println( savings );
            System.err.println( savingsCopy );
        }
    }
}


