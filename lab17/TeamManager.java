/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab #17
 */

import java.util.*;

public class TeamManager {
	enum Position {DEFENDER, MIDFIELDER, FORWARD};
	static class Player {
		String name;
	    Position position;
	
	    public Player(String name, Position position) {
	        this.name = name;
	        this.position = position;
	    }
	    
	    public String getName() {
	        return name;
	    } 
	    
	    public void setPosition(Position position) {
	        this.position = position;
	    } 
	    
	    @Override
	    public String toString() {
	    	return name+": "+position;
	    }
	}


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean quit = false;
		int choice = 0;
		ArrayList<Player> roster = new ArrayList<Player>();
		
		while(!quit){
			System.out.print("Menu:\n");
			System.out.print("1. Print Player List.\n");
			System.out.print("2. Add Player to roster.\n");
			System.out.print("3. Remove Player form Roster.\n");
			System.out.print("4. Change Player's Position.\n");
			System.out.print("5. Quit.\n");
			System.out.print("Enter Menu Choice: ");
			choice = input.nextInt();
			int size = roster.size();
			String name;
			int position;
			
			switch(choice){
				case 1:
					for (int i = 0; i < size; i++) {
			            System.out.println(roster.get(i));
			        }
					break;
				case 2:
					System.out.print("Enter player name: ");
					name = input.next();
					System.out.print("Enter player position (1 = defender, 2 = midfielder, 3 = forward): ");
					position = input.nextInt();
					Player newP = newPlayer(name, position);
					if(newP != null) {
						roster.add(newPlayer(name, position));
					}
					break;
				case 3:
					System.out.print("Enter name of player to remove: ");
					name = input.next();
					for(int i = 0; i<size; i++) {
						if(roster.get(i).name.equals(name)) {
							roster.remove(i);
							break;
						}
					}
					break;
				case 4:
					System.out.print("Enter name of player to reposition: ");
					name = input.next();
					System.out.print("Enter new position (1 = defender, 2 = midfielder, 3 = forward): ");
					position = input.nextInt();
					Player newP1 = newPlayer(name, position);
					if(newP1 != null) {
						for(int i = 0; i<size; i++) {
							if(roster.get(i).name.equals(name)) {
								roster.set(i, newP1);
							}
						}
					}
					break;
				case 5:
					quit = true;
					break;
			}
			
			System.out.print("\n");
		}
		input.close();
	}
	
	public static Player newPlayer(String name, int position) {
		switch(position) {
		case 1:
			Player p = new Player(name, Position.DEFENDER);
			return p;
		case 2:
			Player p1 = new Player(name, Position.MIDFIELDER);
			return p1;
		case 3:
			Player p2 = new Player(name, Position.FORWARD);
			return p2;
		}
		return null;
	}
}
