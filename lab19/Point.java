/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab19
 */

public class Point {
	private double x_coord, y_coord;
	
	public Point() {
		x_coord = 0;
		y_coord = 0;
	}
	public Point(double x_coord, double y_coord) {
		this.x_coord = x_coord;
		this.y_coord = y_coord;
	}
	public double getX() {
		return x_coord;
	}
	public double getY() {
		return y_coord;
	}
	public void setX(double x_coord) {
		this.x_coord=x_coord;
	}
	public void setY(double y_coord) {
		this.y_coord=y_coord;
	}
	public void print() {
		System.out.println("Point: ("+x_coord+", "+y_coord+")");
	}
}
