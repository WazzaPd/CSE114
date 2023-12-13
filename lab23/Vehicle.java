/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab23
 */

public abstract class Vehicle implements Comparable<Vehicle>{
	
	public abstract void move();
	
	int price;
	
	public Vehicle(int price) {
		this.price = price;
	}
	@Override
	public int compareTo(Vehicle vehicle) {
		return Integer.compare(this.price,  vehicle.price);
	}
	
	@Override
	public boolean equals(Object other) {
		if(other instanceof Vehicle) {
			return price == ((Vehicle) other).price;
		} else {
			return false;
		}
	}
}
