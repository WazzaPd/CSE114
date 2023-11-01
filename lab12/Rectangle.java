/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab #12
 */

public class Rectangle {
	double width, height;
	
	//if no parameters when calling rectangle, set to 1
	public Rectangle() {
		this.width = 1;
		this.height = 1;
	}
	
	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}
	
	public double getArea() {
		return width*height;
	}
	
	public double getPerimeter() {
		return (width*2)+(height*2);
	}
	
	public static void main(String[] args) {
		Rectangle rectOne = new Rectangle(4, 40);
		Rectangle rectTwo = new Rectangle(3.5, 35.9);
		System.out.println("Rectangle one: \nWidth: "+rectOne.width
				+" \nHeight: "+rectOne.height+" \nArea: "+rectOne.getArea()+
				" \nPerimeter: "+ rectOne.getPerimeter()+"\n");
		System.out.println("Rectangle two: \nWidth: "+rectTwo.width
				+" \nHeight: "+rectTwo.height+" \nArea: "+rectTwo.getArea()+
				" \nPerimeter: "+ rectTwo.getPerimeter());
		
	}

}
