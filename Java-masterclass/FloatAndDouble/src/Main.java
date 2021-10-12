
public class Main {

	public static void main(String[] args) {
		// float has 32 bits
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float minimum value = " + myMinFloatValue);
		System.out.println("Float maximum value = " + myMaxFloatValue);
		
		// double has 64 bits
		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double minimum value = " + myMinDoubleValue);
		System.out.println("Double maximum value = " + myMaxDoubleValue);
		
		int myIntValue = 5 / 3;  // removes decimals from number
		float myFloatValue = 5f / 3f;
//		float myFloatValue1 = 5.25;  // default is double
		float myFloatValue2 = 5.25f;
		float myFloatValue3 = (float) (5.25);
		double myDoubleValue = 5d / 3d;
		double myDoubleValue1 = 5.0 / 3.0;
		System.out.println("MyIntValue = " + myIntValue);
		System.out.println("MyFloatValue = " + myFloatValue);  // includes decimal .0
		System.out.println("MyDoubleValue = " + myDoubleValue);  // includes decimal .0

	}

}
