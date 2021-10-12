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

	}

}
