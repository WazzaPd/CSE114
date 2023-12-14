/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Wu_Joseph#6
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Address {
	private String streetName, city;
	private int houseNum, zipcode;
	
	public Address() {
		
	}
	public Address(String streetName, int houseNum, String city, int zipcode) {
		this.streetName = streetName;
		this.houseNum = houseNum;
		this.city = city;
		this.zipcode = zipcode;
	}
	
	public String streetName() {
		return streetName;
	}
	public String city() {
		return city;
	}
	public int houseNum() {
		return houseNum;
	}
	public int zipcode() {
		return zipcode;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public void printAddress() {
		System.out.println("Address is: "+houseNum+" "+streetName+", "+city+", "+zipcode);
	}
	public boolean isEqualAddress(Address other) {
		if(streetName.equals(other.streetName()) &&
				city.equals(other.city()) &&
				houseNum == other.houseNum() &&
				zipcode == other.zipcode()
			) {
			return true;
		}
		return false;
	}
	public Address Input() {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		//streetName
		do {
			System.out.println("Enter Your Street: ");
			streetName = input.nextLine();
			if(alphabetical(streetName)) {
				continueInput = false;
			} else {
				System.out.println("Street is not alphabetical");
			}
		} while(continueInput);
		continueInput = true;
		//houseNum
		do {
			try {
				System.out.println("Enter House Number: ");
				houseNum = input.nextInt();
				continueInput = false;
			}
			catch(InputMismatchException e) {
				System.out.println("Error: enter a valid Integer");
				// Clear the invalid input from the scanner
                input.nextLine();
			}
		} while(continueInput);
		continueInput = true;
		// Clear the newline character left by nextInt()
        input.nextLine();
		//city
		do {
			System.out.println("Enter Your City: ");
			city = input.nextLine();
			if(alphabetical(city)) {
				continueInput = false;
			} else {
				System.out.println("City is not alphabetical");
			}
		} while(continueInput);
		continueInput = true;
		//zipcode
		do {
			try {
				System.out.println("Enter Zipcode: ");
				zipcode = input.nextInt();
				continueInput = false;
			}
			catch(InputMismatchException e) {
				System.out.println("Error: enter a valid Integer");
				// Clear the invalid input from the scanner
                input.nextLine();
			}
		} while(continueInput);
		// Clear the newline character left by nextInt()
        input.nextLine();
		return this;
	}
	
	public boolean alphabetical(String string) {
		for(int i = 0; i<string.length(); i++) {
			char c = string.charAt(i);
			if(!Character.isLetter(c) && c!=' '){
				return false;
			}
		}
		return true;
	}
}
