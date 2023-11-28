/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab18
 */

import java.util.*;

public class combine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> List1 = new ArrayList<>();
		ArrayList<Integer> List2 = new ArrayList<>();
		System.out.print("Enter five integer for list1: ");
		for(int i = 0; i<5; i++) {
			List1.add(input.nextInt());
		}
		System.out.print("Enter five integers for list2: ");
		for(int i = 0; i<5; i++) {
			List2.add(input.nextInt());
		}
		input.close();
		ArrayList<Integer> newList = union(List1, List2);
		System.out.print("The combined list is ");
		for(int i = 0; i<newList.size(); i++) {
			System.out.print(newList.get(i)+" ");
		}
	}
	public static ArrayList<Integer> union( ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> newList = new ArrayList<>();
		for(int i = 0; i<list1.size();i++) {
			newList.add(list1.get(i));
		}
		for(int i = 0; i<list2.size();i++) {
			newList.add(list2.get(i));
		}
		return newList;
	}
}
