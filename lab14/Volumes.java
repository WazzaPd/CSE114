/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab #14
 */
import java.util.*;

public class Volumes {
	int gallons, quarts, cups;
	
	public Volumes(int gallons, int quarts, int cups) {
		this.gallons = gallons;
		this.quarts = quarts;
		this.cups = cups;
	}
	public void setGallons(int gallons) {
		this.gallons = gallons;
	}
	public void setQuarts(int quarts) {
		this.quarts = quarts;
	}
	public void setCups(int cups) {
		this.cups = cups;
	}
	
	public Volumes combine(Volumes other) {
		int gal, quart, cup;
		cup = this.cups + other.cups;
		quart = this.quarts + other.quarts + cup/4;
		gal = this.gallons + other.gallons + quart/4;
		Volumes combined = new Volumes(gal, quart%4, cup%4);
		return combined;
		
	}
	
	

	public static void main(String[] args) {
		int gallon, quart, cup;
		Volumes one, two, combined;
		Scanner input = new Scanner(System.in);
		System.out.print("Volume 1:");
		System.out.print("\nEnter gallons (int): ");
		gallon = input.nextInt();
		System.out.print("Enter quarts (int): ");
		quart = input.nextInt();
		System.out.print("Enter cups (int): ");
		cup = input.nextInt();
		one = new Volumes(gallon, quart, cup);
				
		System.out.print("Volume 2:");
		System.out.print("\nEnter gallonbs (int): ");
		gallon = input.nextInt();
		System.out.print("Enter quarts (int): ");
		quart = input.nextInt();
		System.out.print("Enter cups (int): ");
		cup = input.nextInt();
		input.close();
		two = new Volumes(gallon, quart, cup);
		
		combined = one.combine(two);
		System.out.println("Totals: Gallons: "+combined.gallons+" Quarts: "+combined.quarts+" Cups: "+combined.cups);
	}

}
