/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab23
 */

public class Taxi extends Vehicle implements Noisemaker{

	public Taxi(int price) {
		super(price);
	}

	@Override
	public void move() {
		System.out.println("Taxi Moves");
	}
	
	public void makeNoise() {
		System.out.println("Taxi goes vroom vroom");
	}

}
