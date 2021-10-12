public class Hello { 
	// class keyword defines class
	// Everything between { }  is class body
	
	public static void main(String[] args) {
		// public is access modifier
		
		System.out.println("Hello World");
		System.out.println("Hello, Me");
		
		int myFirstNumber = (10 + 5) + (2 * 10);  // variable declaration
		System.out.println("myFirstNumber: " + myFirstNumber);  // expression
		
		int mySecondNumber = 12;
		int myThirdNumber = myFirstNumber * 2;
		System.out.println(mySecondNumber + myThirdNumber);
		int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
		System.out.println(myTotal);
		
		int myLastOne = 1000 - myTotal;
		System.out.println(myLastOne);
	}
}
