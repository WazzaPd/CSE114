/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab19
 */

public class Triangle extends Shape{
	private double base= 500, height=500;
	
	public Triangle() {
		base = 0;
		height = 0;
	}
	public Triangle(double x, double y) {
		super(x, y);
	}
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void print() {
		System.out.println("base: "+base+" height: "+height);
	}
	
	public static void main(String[] args) {
		Shape s1 = new Shape(200, 300);
		s1.print();
		Triangle t = new Triangle(5, 5);
		Shape s2 = t;
		s2.print();
		//Uses the triangles print;
		//Triangle t2=s1;
		//Type mismatch: cannot convert from Shape to Triangle
		//Parent can turn into child but child cannot turn into parent
		Triangle tptr = t;
		Shape sptr = tptr;
		tptr.print();
		//Uses the Triangle's print;
		sptr.print();
		//Uses the Triangle's print;
		//Both points to triangle t;
	}
}
