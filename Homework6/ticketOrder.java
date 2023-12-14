/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Wu_Joseph#6
 */
import java.util.*;

public class ticketOrder {
	private String name;
	private Address address = new Address();
	private int numTickets;
	static int MAX = 16;
	
	public ticketOrder() {
		
	}
	public ticketOrder(String name, Address address, int numTickets) {
		this.name = name;
		this.address = address;
		if(numTickets>MAX) {
			this.numTickets = MAX;
			MAX = 0;
		} else {
			this.numTickets = numTickets;
			MAX -= numTickets;
		}
	}
	public String name() {
		return name;
	}
	public Address address() {
		return address;
	}
	public int numTickets() {
		return numTickets;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setNumTickets(int numTickets) {
		this.numTickets = numTickets;
	}
	public void PrintTicketOrder() {
		address.printAddress();
		System.out.println("Name of Person is: "+name
							+"\nNumber of tickets:"+numTickets);
	}
	public ticketOrder Input() {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		//address
		address.Input();
		//name
		do {
			System.out.println("Enter Your Name: ");
			name = input.next();
			if(alphabetical(name)) {
				continueInput = false;
			} else {
				System.out.println("Name is not alphabetical");
			}
		} while(continueInput);
		continueInput = true;
		//tickets
		do {
			try {
				System.out.println("Enter Number of tickets (Max 4): ");
				numTickets = input.nextInt();
				if(numTickets>4) {
					numTickets = 4;
				}
				if(numTickets>MAX) {
					this.numTickets = MAX;
					MAX = 0;
				} else {
					MAX -= numTickets;
				}
				continueInput = false;
			}
			catch(InputMismatchException e) {
				System.out.println("Error: enter a valid Integer");
				// Clear the invalid input from the scanner
                input.nextLine();
			}
		} while(continueInput);
		return this;
	}
	public boolean alphabetical(String string) {
		for(int i = 0; i<string.length(); i++) {
			char c = string.charAt(i);
			if(!Character.isLetter(c) && c!=' '){
				System.out.println(c);
				return false;
			}
		}
		return true;
	}
	public boolean isEqualTickets(ticketOrder other) {
		if(name.equals(other.name()) &&
				address.isEqualAddress(other.address())) {
			return true;
		}
		return false;
	}
}
