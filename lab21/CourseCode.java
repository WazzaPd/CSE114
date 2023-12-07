/* 
 * Joseph Wu
 * ID: 115930340
 * CSE 114
 * Lab21
 */

import java.util.Scanner;

public class CourseCode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String code = input.next();
		try {
			checkCourseCode(code);
			String one, two, three, four;
			one = code.substring(0,3);
			two = code.substring(3,6);
			three = code.substring(6,7);
			four = code.substring(7, 9);
			System.out.println("Department code: "+one);
			System.out.println("Course Number: "+two);
			System.out.println("Section Type: "+three);
			System.out.println("Section Number: "+four);
		}
		catch(InvalidCourseCodeLengthException ex) {
			ex.printStackTrace();
		}
		catch(InvalidCourseNumberException ex) {
			ex.printStackTrace();
		} 
		catch (InvalidDeptCodeException ex) {
			ex.printStackTrace();
		} catch (InvalidSectionNumberException e) {
			e.printStackTrace();
		} catch (InvalidSectionTypeException e) {
			e.printStackTrace();
		}
	}
	
	public static void checkCourseCode(String code) throws InvalidCourseCodeLengthException, InvalidDeptCodeException, InvalidCourseNumberException, InvalidSectionTypeException, InvalidSectionNumberException {
		checkLength(code);
		checkUpper(code);
		checkNumber(code);
		checkType(code);
		checkNumber2(code);
	}
	
	public static void checkLength(String code) throws InvalidCourseCodeLengthException{
		if(code.length() != 9) {
			throw new InvalidCourseCodeLengthException(code);
		}
	}
	public static void checkNumber(String code) throws InvalidCourseNumberException{
		String check = code.substring(3, 6);
		for (int i = 0; i<check.length(); i++) {
			if(!Character.isDigit(check.charAt(i))){
				throw new InvalidCourseNumberException(code);
			}
		}	
	}
	public static void checkUpper(String code) throws InvalidDeptCodeException{
		String check = code.substring(0, 3);
		for (int i = 0; i<check.length(); i++) {
			if(Character.toUpperCase(check.charAt(i)) != check.charAt(i)) {
				throw new InvalidDeptCodeException(code);
			}
		}
	}
	public static void checkNumber2(String code) throws InvalidSectionNumberException {
		String check = code.substring(7);
		for (int i = 0; i<check.length(); i++) {
			if(!Character.isDigit(check.charAt(i))){
				throw new InvalidSectionNumberException(code);
			}
		}	
	}
	public static void checkType(String code) throws InvalidSectionTypeException{
		char check = code.charAt(6);
		if(check != 'L' && check != 'R') {
			throw new InvalidSectionTypeException(code);
		}
	}
}
