/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * ExtraCredit
 */

import java.util.ArrayList;

public class Playlist {
	String playlistTitle;
	ArrayList<Song> songs;
	
	public Playlist() {
		songs = new ArrayList<>();
	}
	
	public Playlist(String title) {
		this();
		playlistTitle = title;
	}
	
	public String getTitle() {
		return playlistTitle;
	}
	public void setTitle(String newTitle) {
		playlistTitle = newTitle;
	}
	
	public void addSong(Song song) {
		songs.add(song);
	}
	public void removeSong(String songTitle) {
		for(int i = 0; i<songs.size(); i++) {
			
			Song currentSong = songs.get(i);
			String curPlayTitle = currentSong.songName;
			
			if(curPlayTitle.equals(songTitle)) {
				songs.remove(i);
				break;
			}
		}
	}
	
	public void swapSongs(Song song1, Song song2) {
		int index1 = songs.indexOf(song1), 
			index2 = songs.indexOf(song2);
		
		if(index1 != -1 && index2 != -1) {
			songs.set(index1, song2);
			songs.set(index2, song1);
		}
	}
	
	public void sortSongs() {
		//iterate through list
		for(int i = 0; i<songs.size(); i++) {
			
			//swap if next comes first alphabetically
			for(int a = 1; a<songs.size(); a++) {
				Song current = songs.get(a-1);
				String curSongName = current.songName;
				String curArtistName = current.artistName;
				
				Song next = songs.get(a);
				String nextSongName = next.songName;
				String nextArtistName = next.artistName;
				
				int compared = alphabetFirst(curSongName, nextSongName);
				//if names equal
				if(compared == 0) {
					compared = alphabetFirst(curArtistName, nextArtistName);
					if(compared == 2) {
						this.swapSongs(current, next);
					}
				} else if(compared == 2) {
					this.swapSongs(current, next);
				}
			}
		}
	}
	
	public int alphabetFirst(String one, String two) {
		//equal return 0
		if(one.equals(two)) {
			return 0;
		}
		//find shorter length
		int length;
		if(one.length()< two.length()) {
			length = one.length(); 
		}else {
			length = two.length();
		}
		//one comes first return 1
		//two comes first return 2
		for(int i = 0; i<length; i++) {
			if(one.charAt(i) < two.charAt(i)) {
				return 1;
			}
			else if(two.charAt(i)<one.charAt(i)) {
				return 2;
			}
		}
		//return shorter String
		if(one.length()<two.length()) {
			return 1;
		} else {
			return 1;
		}
	}
	
	// Work in Progress
	public String playtime() {
		int min = 0;
		int seconds = 0;
		for (int i = 0; i<songs.size(); i++) {
			Song current = songs.get(i);
			String duration = current.duration;
			String minChars = "";
			String secondChars = "";
			for(int a = 0; a< duration.length();a++) {
				if(duration.charAt(a) == ':') {
					minChars = duration.substring(0, a);
					secondChars = duration.substring(a+1, a+3);
				}
			}
			min+= Integer.parseInt(minChars);
			seconds+= Integer.parseInt(secondChars);
		}
		min += seconds / 60;
		seconds %= 60;
		return(min+" min, "+seconds+" sec");
	}
	
	@Override
	public String toString() {
		String Songs = "";
		for (int i = 0; i<songs.size(); i++) {
			Song current = songs.get(i);
			Songs += (i+1)+". "+current.toString()+"\n";
		}
		return playlistTitle + " - "+playtime()+"\n"
				+ Songs;
	}
}
