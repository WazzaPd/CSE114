/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab23
 */

public abstract class Pet implements Comparable<Pet>{
	int age;
	
	public abstract void eat();
	
	@Override
	public int compareTo(Pet pet) {
		return Integer.compare(this.age,  pet.age);
	}

	public Pet(int age) {
		this.age = age;
	}
}
