public class Main {

	public static void main(String[] args) {
		byte byteVariable = 8;
		short shortVariable = 16;
		int intVariable = 32;
		long longVariable = 50000 + 10 * (byteVariable + shortVariable + intVariable);
		System.out.println(longVariable);
		
		short shortTotal = (short) (1000 + 10 * (byteVariable + shortVariable + intVariable));

	}

}
