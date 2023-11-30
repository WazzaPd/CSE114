/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab19
 */

public class Shape {
	private Point p;
	
	public Shape() {
		p = new Point();
	}
	public Shape(double x, double y) {
		p = new Point(x, y);
	}
	public Point p() {
		return p;
	}
	public void p(Point p) {
		this.p = p;
	}
	public void print() {
		p.print();
	}
}
