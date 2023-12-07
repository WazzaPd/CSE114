/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab21
 */
public class InvalidDeptCodeException extends Exception{
	public InvalidDeptCodeException(String code) {
		super(code.substring(0, 3) + " is not a valid Department");
	}
}
