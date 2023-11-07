/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab #13
 */

public class Stock {
	String symbol, name;
	double previousClosingPrice, currentPrice;
	
	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}
	
	public double getChangePercent(){
		return ((currentPrice-previousClosingPrice)/previousClosingPrice)*100.0;
	}

	public static void main(String[] args) {
		Stock oracleStock = new Stock("ORCL", "Oracle Corporation");
		oracleStock.previousClosingPrice = 34.5;
		oracleStock.currentPrice = 34.35;
		
		System.out.println("Percent Change: "+oracleStock.getChangePercent()+"% change");
	}

}
