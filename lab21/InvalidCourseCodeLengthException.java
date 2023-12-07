/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab21
 */

public class InvalidCourseCodeLengthException extends Exception{
	private int leng;
	
	public InvalidCourseCodeLengthException(String message){
		super("Invalid Course Length " + message.length());
		this.leng = message.length();
	}
	
	public int getLeng() {
		return leng;
	}
}
