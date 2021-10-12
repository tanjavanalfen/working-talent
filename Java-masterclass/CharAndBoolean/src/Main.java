
public class Main {

	public static void main(String[] args) {
		// Char primitive type 
		char myChar = 'D';  // single quotes indicates character
//		char myChar = 'AB';  // can't have more than one character
		
		// char occupies 16 bits, so it can store Unicode characters
		char myUnicodeChar = '\u0044';  // Unicode for 'D'
		System.out.println(myChar);
		System.out.println(myUnicodeChar);
		
		char myCopyrightChar = '\u00A9';
		System.out.println(myCopyrightChar);
		
		
		// Boolean primitive type
		boolean myTrueBoolean = true;
		boolean myFalseBoolean = false;
		
		boolean isCustomerOver21 = true;
		
	}

}
