/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * ExtraCredit
 */

import java.util.ArrayList;

public class User {
	String userName;
	ArrayList<Playlist> playlists;
	
	public User() {
		playlists = new ArrayList<>();
	}
	public User(String name) {
		this();
		userName = name;
	}
	
	public String getUserName() {
		return userName;
	}
	public String getUsername() {
		return userName;
	}
	public String getName() {
		return userName;
	}
	
	
	public void addPlaylist(Playlist playlist) {
		playlists.add(playlist);
	}
	
	public void removePlaylist(String playlistTitle) {
		for(int i = 0; i<playlists.size(); i++) {
		
			Playlist currentPlaylist = playlists.get(i);
			String curPlayTitle = currentPlaylist.playlistTitle;
			
			if(curPlayTitle.equals(playlistTitle)) {
				playlists.remove(i);
				break;
			}
		}
	}
	
	public ArrayList<Playlist> getallPlaylists() {
		return playlists;
	}
	
	public Playlist getPlaylist(String playTitle) {
		for(int i = 0; i<playlists.size(); i++) {
			
			Playlist currentPlaylist = playlists.get(i);
			String curPlayTitle = currentPlaylist.playlistTitle;
			
			if(curPlayTitle.equals(playTitle)) {
				return currentPlaylist;
			}
		}
		return null;
	}
	
	public void makeCollaborativePlaylist(String playlistTitle, User friend) {
		//find the playlist to add to friend
		Playlist adding = this.getPlaylist(playlistTitle);
		
		//add the playlist
		friend.addPlaylist(adding);
	}
	
	@Override
	public String toString() {
		return "This is User";
	}
}
