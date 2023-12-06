/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Wu_Joseph#5
 */

import java.util.ArrayList;

public class CarRepairShop {
	Car cars[] = new Car[50];
	RepairTicket tickets[] = new RepairTicket[100];
	int num=0;
		
	public int addNewCar(String vin, String make, int year) {
		for(int i =0; i< cars.length; i++) {
			if(cars[i]!=null) {
				String curCarVIN = cars[i].VIN;
				if(curCarVIN.equals(vin)) {
					return -1;
				}
			}
		}
		for(int i =0; i< cars.length; i++) {
			if(cars[i]==null) {
				cars[i]=new Car(vin, make, year);
				return i;
			}
		}
		return -1;
	}

	public int addRepairTicket(String vin, double cost, String description) {
		for(int i =0; i< cars.length; i++) {
			if(cars[i]!=null) {
				String curCarVIN = cars[i].VIN;
				if(curCarVIN.equals(vin)) {
					this.num++;
					//add ticket
					for(int a = 0;a<tickets.length;a++) {
						if(tickets[a]==null) {
							tickets[a] = new RepairTicket(vin, description, cost, num);
							return num;
						}
					}
				}
			}
		}
		return -1;
	}

	public double getRepairCost(int ticketNum) {
		for(int i =0; i< tickets.length; i++) {
			if(tickets[i]!=null) {
				int currentTicketNum = tickets[i].num;
				if(currentTicketNum == ticketNum) {
					double repairCost = tickets[i].cost;
					return repairCost;
				}
			}
		}
		return -1;
	}

	public double getTotalRepairCosts(String vin) {
		double totalCost = 0;
		for(int i =0; i< tickets.length; i++) {
			if(tickets[i]!=null) {
				String currentTicketVIN = tickets[i].VIN;
				if(currentTicketVIN.equals(vin)) {
					totalCost += tickets[i].cost;
				}
			}
		}
		if (totalCost != 0) {
			return totalCost;
		}else {
			return 0;
		}
	}

	public String getWorstCarMake() {
		makes makeList[] = new makes[50];
		//iterate through tickets
		for (int i = 0; i<cars.length; i++) {
			if(cars[i]!=null) {
				String currMake = cars[i].make;
				String currVIN = cars[i].VIN;
				boolean isElement = false;
				int makeIndex = 0;
				
				//if element is an element of makes, add 1
				for(int a = 0; a<makeList.length; a++) {
					if(makeList[a]!=null) {
						if(makeList[a].make.equals(currMake)){
							isElement = true;
							makeIndex = a;
							break;
						}
					}
				}
				if(isElement) {
					for(int b = 0; b<tickets.length; b++) {
						if(tickets[b]!=null) {
							String ticketVin = tickets[b].VIN;
							if(currVIN.equals(ticketVin)) {
								makeList[makeIndex].addOne();
								isElement = true;
							}
						}
					}
				}else {
				//if element not a element of makes, create new make
					makes newMake = new makes(currMake);
					for(int b = 0; b<tickets.length; b++) {
						if(tickets[b]!=null) {
							String ticketVin = tickets[b].VIN;
							if(currVIN.equals(ticketVin)) {
								newMake.addOne();
							}
						}
					}
					for(int z = 0; z<makeList.length; z++) {
						if(makeList[z]==null) {
							makeList[z] = newMake;
							break;
						}
					}
				}
			}
		}
//		for(int a = 0; a<makeList.length; a++) {
//			if(makeList[a]!=null) {
//				System.out.println(makeList[a].make+": "+makeList[a].numRepairs);
//			}
//		}
		//find largest
		String largestMake ="";
		int largeNum = 0;
		//iterate through list of makes
		for(int a = 0; a<makeList.length; a++) {
			if(makeList[a]!=null) {
				if(makeList[a].numRepairs>largeNum) {
					largeNum = makeList[a].numRepairs;
					largestMake = makeList[a].make;
				}
			}
		}
		if(largestMake.equals("")) {
			return null;
		} else {
			return largestMake;
		}
	}

	public boolean updateRepairCost(int ticketNum, double newCost) {
		for(int i =0; i< tickets.length; i++) {
			if(tickets[i]!=null) {
				int currentTicketNum = tickets[i].num;
				if(currentTicketNum == ticketNum) {
					tickets[i].cost = newCost;
					return true;
				}
			}
		}
		return false;
	}

	public boolean deleteRepair(int ticketNum) {
		for(int i =0; i< tickets.length; i++) {
			if(tickets[i]!=null) {
				int currentTicketNum = tickets[i].num;
				if(currentTicketNum == ticketNum) {
					tickets[i] = null;
					return true;
				}
			}
		}
		return false;
	}

	public boolean deleteAllRepairsForCar(String VIN) {
		boolean exists = false;
		for(int i =0; i< tickets.length; i++) {
			if(tickets[i]!=null) {
				String currentTicketVIN = tickets[i].VIN;
				if(currentTicketVIN.equals(VIN)) {
					tickets[i]=null;
					exists = true;
				}
			}
		}
		return exists;
	}

	public boolean deleteCarAndRepairs(String VIN) {
		boolean exists = false;
		for(int i =0; i< tickets.length; i++) {
			if(tickets[i]!=null) {
				String currentTicketVIN = tickets[i].VIN;
				if(currentTicketVIN.equals(VIN)) {
					tickets[i]=null;
					exists = true;
				}
			}
		}
		for(int i =0; i< cars.length; i++) {
			if(cars[i]!=null) {
				String currCarVIN = cars[i].VIN;
				if(currCarVIN.equals(VIN)) {
					cars[i] = null;
					exists = true;
				}
			}
		}
		return exists;
	}
}

class makes{
	String make;
	int numRepairs;
	
	public makes(String make) {
		this.numRepairs = 0;
		this.make = make;
	}
	
	public void addOne() {
		this.numRepairs++;
	}
}

class Car {
	String VIN;
	String make;
	int year;
	
	public Car(String VIN, String make, int year) {
		this.VIN = VIN;
		this.make = make;
		this.year = year;
	}

}

class RepairTicket {
	String VIN;
	String description;
	double cost;
	int num;
	
	public RepairTicket(String VIN, String description, double cost, int num) {
		this.VIN = VIN;
		this.description = description;
		this.cost = cost;
		this.num = num;
	}
}