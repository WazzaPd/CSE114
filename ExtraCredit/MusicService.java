/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * ExtraCredit
 */

import java.util.ArrayList;

public class MusicService {
	static ArrayList<User> users = new ArrayList<>();
	
	public static void addUser(User user) {
		users.add(user);
	}
	
	public static void removeUser(String Username) {
		for(int i = 0; i<users.size(); i++) {
			User current = users.get(i);
			String curUserName = current.userName;
			if(curUserName.equals(Username)) {
				users.remove(i);
			}
		}
	}
	public static ArrayList<Playlist> getUserPlaylists(User u1) {
		int index = users.indexOf(u1);
		if(index != -1) {
			return users.get(index).playlists;
		} 
		return null;
	}
}
