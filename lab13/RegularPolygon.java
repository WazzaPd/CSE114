/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab #13
 */

public class RegularPolygon {
	private int n;
	private double side, x, y;
	
	public RegularPolygon() {
		this.n = 3;
		this.side = 1;
		this.x = 0;
		this.y = 0;
	}
	
	public RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
		this.x = 0;
		this.y = 0;
	}
	
	public RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	public int getN() {
		return this.n;
	}
	public double getSide() {
		return this.side;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public void setN(int n) {
		this.n = n;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void getY(double y) {
		this.y = y;
	}
	
	public double getPerimeter() {
		return side*n;
	}
	public double getArea() {
		return (n*Math.pow(side,2))/(4*Math.tan(Math.PI/n));
	}

	public static void main(String[] args) {
		RegularPolygon triangle = new RegularPolygon();
		RegularPolygon hexagon = new RegularPolygon(6, 4);
		RegularPolygon polygon = new RegularPolygon(10,4,5.6, 7.8);
		System.out.println("Polygon One:\nPerimeter: "+triangle.getPerimeter()
		+"\nArea: "+triangle.getArea()+"\n");
		System.out.println("Polygon Two:\nPerimeter: "+hexagon.getPerimeter()
		+"\nArea: "+hexagon.getArea()+"\n");
		System.out.println("Polygon Three:\nPerimeter: "+polygon.getPerimeter()
		+"\nArea: "+polygon.getArea());
	}

}
