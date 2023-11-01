/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab #12
 */

import java.util.*;

public class QuadraticEquation {
	
	double a, b, c;
	
	public QuadraticEquation(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getA() {
		return this.a;
	}
	public double getB() {
		return this.b;
	}
	public double getC() {
		return this.c;
	}
	
	public double getDiscriminant() {
		return (Math.pow(b, 2)-(4*a*c));
	}
	public double getRoot1() {
		return (((b*-1)+Math.pow(getDiscriminant(), 0.5))/(2*a));
	}
	public double getRoot2() {
		return (((b*-1)-Math.pow(getDiscriminant(), 0.5))/(2*a));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a, b, c;
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		QuadraticEquation equation = new QuadraticEquation(a,b,c);
		
		double discriminant = equation.getDiscriminant();
		if(discriminant >0) {
			System.out.println("The equation has two roots "+equation.getRoot1() +" and "+equation.getRoot2());
		}else if(discriminant == 0) {
			System.out.println("The equatioin has one root: "+equation.getRoot1());
		}else {
			System.out.println("The equation has no real roots.");
		}
	
		input.close();
	}

}
