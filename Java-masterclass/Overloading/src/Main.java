public class Main {

	public static void main(String[] args) {
		System.out.println(calcFeetAndInchesToCentimeters(42, 7));
		System.out.println(calcFeetAndInchesToCentimeters(1000));
	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if (feet < 0 || inches < 0 || inches > 12)
			return -1;
		else
			return 2.54 * (12 * feet + inches);
	}

	public static double calcFeetAndInchesToCentimeters(double inches) {
		if (inches < 0)
			return -1;

		double remainingInches = inches % 12;
		double feet = (inches - remainingInches) / 12;
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
	}

}
