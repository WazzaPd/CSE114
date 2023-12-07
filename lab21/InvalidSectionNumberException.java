/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab21
 */
public class InvalidSectionNumberException extends Exception{
	
	public InvalidSectionNumberException(String code) {
		super(code.substring(7) + " is an invalid Section Number");
	}
}
