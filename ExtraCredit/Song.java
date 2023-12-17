/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * ExtraCredit
 */

public class Song {
	String songName, artistName, duration;
	
	public Song(String songName, String artistName, String duration) {
		this.songName = songName;
		this.artistName = artistName;
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return songName+" by "+artistName+" ("+duration+")";
	}
}
