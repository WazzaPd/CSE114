/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab21
 */
public class InvalidCourseNumberException extends Exception{
	
	public InvalidCourseNumberException(String code) {
		super(code.substring(3, 6) + " is an invalid code number");
	}
}
