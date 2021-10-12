public class Main {

	public static void main(String[] args) {
		// operator:   special symbols performing operation(s)
		// operand:    object that is manipulated by an operator
		// expression: combination of variables, literals, method return values and operators
		
		int result = 1 + 2;  // 1 + 2 = 3
		System.out.println("1 + 2 = " + result);
		int previousResult = result;
		System.out.println("previousResult = " + previousResult);
		result = result - 1;  // 3 - 1 = 2, but previousResult remains as it was
		System.out.println("previousResult = " + previousResult);
		
		result = result * 10;  // 2 * 10 = 20
		System.out.println("2 * 10 = " + result);
		
		result = result / 5;  // 20 / 5 = 4
		System.out.println("20 / 5 =  " + result);
		
		result = result % 3;  // remainder of (4 / 3) = 1
		System.out.println("4 % 3 = " + result);
		
		
		result++;		// equal to result = result + 1;
		result--;  		
		result += 2;  	
		result -= 2;	
		result *= 10;	
		result /= 3;  	
		
		
		boolean isAlien = false;
		if (isAlien == true)
			System.out.println("It is not an alien!");
			System.out.println("And I am scared of aliens");  // Outside of if-codeblock, so executed regardless
			
		if (isAlien == false) {  // with codeblock, it's within the if-statement
			System.out.println("It is not an alien!");
			System.out.println("And I am scared of aliens");
		}
		
		int topScore = 80;
		if (topScore != 100) {  // ==, != >, >=, <, <=
			System.out.println("You got the high score!");
		}
		int secondTopScore = 60;
		if ((topScore > secondTopScore) && (topScore < 100)) {  // logical AND operator: both must be true
			System.out.println("Greater than second top score and less than 100");
		}
		
		
		if ((topScore > 90) || (secondTopScore <= 90)) {  // logical OR operator: one of both must be true
			System.out.println("Either of both of the conditions are true");  // only right operator is true
		}
		
		
		int newValue = 50;
//		if (newValue = 50) {  // assigns 50 to newValue, can't check truth value of int
//			System.out.println("This is an error");
//		}
		if (newValue == 50) {
			System.out.println("This is true");
		}
		boolean isCar = false;
//		if (isCar = true) {  // evaluates to true, so can be compiled
//			System.out.println("This is not supposed to happen");
//		}
		if (!isCar) {  // NOT isCar (or isCar == false) 
			System.out.println("This is supposed to happen");
		}
		
		isCar = true;
		boolean wasCar = isCar ? true : false;  // (condition) ? (value if true) : (value if false)
		if (wasCar) {
			System.out.println("wasCar is true");
		}
		
		
		// Summary of operators via docs.oracle.com
		
		// Operator precedence table
		
		
		// Challenge
		double doubleVariable = 20.00;
		double secondDouble = 80.00;
		double multipliedSum = (doubleVariable + secondDouble) * 100.00;
		double remainder = multipliedSum % 40.00;
		boolean isZero = remainder == 0;
		System.out.println("isZero = " + isZero);
		
		if (!isZero)
			System.out.println("Got some remainder");

	}

}
