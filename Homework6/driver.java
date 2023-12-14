/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Wu_Joseph#6
 */
import java.util.*;

public class driver {

	public static void main(String[] args) {
		//max set to 16
		//Location of max: static int of ticketOrder class
		
		ArrayList<ticketOrder> list = new ArrayList<>();
		while (ticketOrder.MAX != 0) {
			ticketOrder ticket = new ticketOrder();
			ticket.Input();
			list.add(ticket);
		}
		
		System.out.println("The list before deleting all duplicates is:");
		for(int i = 0; i<list.size(); i++) {
			list.get(i).PrintTicketOrder();
		}
		
		deleteDuplicate(list);
		
		System.out.println("\nThe list after deleting all duplicates is:");
		for(int i = 0; i<list.size(); i++) {
			list.get(i).PrintTicketOrder();
		}
	}
	
	public static void deleteDuplicate(ArrayList<ticketOrder> list) {
		for (int i = 0; i<list.size(); i++) {
			for(int a = i+1; a<list.size(); a++) {
				if( list.get(i).isEqualTickets(list.get(a))) {
					list.remove(i);
					i--;
					break;
				}
			}
		}
	}

}
