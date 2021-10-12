public class Main {

	public static void main(String[] args) {
		// String is sequence of characters
		// Treated as type, but it is a class!
		
		String myString = "This is a string";
		System.out.println("myString is equal to " + myString);
		myString = myString + ", and this is more.";  
		System.out.println("myString is equal to " + myString);
		myString = myString + " \u00A9 2019";
		System.out.println("myString is equal to " + myString);
		
		String numberString = "250.55";
		numberString = numberString + "49.95";  // appends to string, no numeric calculations
		System.out.println(numberString);
		
		String lastString = "10";
		int myInt = 50;
		lastString = lastString + myInt;
		System.out.println("LastString is equal to " + lastString);  // also appends to string
		
		// Strings are immutable. If changed, a new string is created and the old one discarded

	}

}
