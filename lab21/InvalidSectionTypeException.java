/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab21
 */
public class InvalidSectionTypeException extends Exception{
	public InvalidSectionTypeException(String code) {
		super(code.charAt(6)+" is an invalid Section");
	}
}
