/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab23
 */

public class Cat extends Pet implements Noisemaker{

	public Cat(int age) {
		super(age);
	}

	@Override
	public void eat() {
		System.out.println("Cat is Eating");
	}

	@Override
	public void makeNoise() {
		System.out.println("Cat Meows");
		
	}
	
	
}
