/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab18
 */

import java.util.*;

public class polygonArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sides;
		ArrayList<Float> coords = new ArrayList<>();
		
		System.out.print("Enter the number of points: ");
		sides = input.nextInt();
		System.out.println("Enter the coordinates of the polygon points\n(Clockwise: x1, y1, x2, y2 ... xn, yn):");
		for(int i = 0; i<sides*2; i++) {
			coords.add(input.nextFloat());
		}
		input.close();
		
		ArrayList<Float> flippedCoords = new ArrayList<>();
		
		int cside = coords.size();
		for(int i = cside-1; i>0; i-=2) {
			flippedCoords.add(coords.get(i-1));
			flippedCoords.add(coords.get(i));
		}
		flippedCoords.add(coords.get(cside-2));
		flippedCoords.add(coords.get(cside-1));
		
		int size = flippedCoords.size();
		double part1=0;
		double part2=0;
		for(int i = 0; i<size-3;i+=2) {
			part1+=flippedCoords.get(i)*flippedCoords.get(i+3);
		}
		for(int i = 1; i<size-2;i+=2) {
			part2+=flippedCoords.get(i)*flippedCoords.get(i+1);
		}
		double area = (part1-part2)/2;
		System.out.print("The Total area is "+area);
	}

}
