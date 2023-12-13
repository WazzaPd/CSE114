/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab23
 */

public class Ship extends Boat{

	public Ship(int price) {
		super(price);
	}
	
	@Override
	public void move() {
		System.out.println("Ship Moves");
	}
	
	public void dropAnchor() {
		System.out.println("Ship is Dropping Anchor");
	}

}
