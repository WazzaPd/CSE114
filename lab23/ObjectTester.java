/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab23
 */

public class ObjectTester {
	public static void main(String args[]) {
		Pet p1 = new Cat(5);
		p1.eat(); //Invoke cat eat() method
		((Cat)p1).makeNoise(); // Cat's makeNoise();

		Pet p2 = new Fish(4);
		p2.eat(); //Invokes Fish eat() method

		Vehicle v = new Ship(1200);
		v.move(); // ships move() method
		((Boat)v).move();  // ships move() method
		//Vehicle -> Boat -> Ship
		//Boat and ship have move() methods. but Ship is lowest in Hierarchy.
		//Java will look for the move() method in the lowest position, then move upwards in hierarchy
		((Ship)v).dropAnchor(); 

		Taxi t = new Taxi(1800);
		t.makeNoise(); //taxi makeNoise() method
		t.move(); // taxi move() method

		Noisemaker n1 = new Cat(3);
		n1.makeNoise();
		Noisemaker n2 = new Taxi(500);
		n2.makeNoise();

		System.out.println(p1.compareTo(p2)); // p1 = pet; p2 = pet --> 1
		System.out.println(v.compareTo(t)); // v = vehicle; t = taxi --> -1
		System.out.println(v.equals(t)); // v = vehicle; t = Taxi; -->false
		
		// Errors below. Why?
		//System.out.println(t.compareTo(p1)); t = taxi; p1 = pet --> can't compare vehicle to pet
		//Cat c = p1; c = cat; p1 = pet --> Goes back to concept of polymorphism
		// cant't instantiate a child class with parent class;
		//Noisemaker n3 = p1; //p1 is a pet does not implement Noisemaker;

	}
}
