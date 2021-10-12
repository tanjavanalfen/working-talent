package academy.learnprogramming;

public class Main {

	public static void main(String[] args) {
		int myValue = 10000;
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Integer minimum value = " + myMinIntValue);
		System.out.println("Integer maximum value = " + myMaxIntValue);
		System.out.println("Busted MAX value = " + (myMaxIntValue + 1));  // overflow
		System.out.println("Busted MIN value = " + (myMinIntValue - 1));  // underflow
//		int myMaxIntTest = 2147483648;  // out of range
		
		
		// byte has 8 bits
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte minimum value = "  + myMinByteValue);
		System.out.println("Byte maximum value = "  + myMaxByteValue);
		
		// short has 16 bits
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short minimum value = "  + myMinShortValue);
		System.out.println("Short maximum value = "  + myMaxShortValue);

		long myLongValue = 100L;  // L forces long, instead of int
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Long minimum value = "  + myMinLongValue);
		System.out.println("Long maximum value = "  + myMaxLongValue);
//		long bigLongLiteralValue = 2147483648;  // still treated like int
		long bigLongLiteralValue = 2147483648L;
		System.out.println(bigLongLiteralValue);
		
		
		int myTotal = (myMinIntValue / 2);
//		byte myNewByteValue = (myMinByteValue / 2);  // treated as int
		byte myNewByteValue = (byte) (myMinByteValue / 2);  // casting
		short myNewShortValue = (short) (myMinShortValue / 2);
	}

}
