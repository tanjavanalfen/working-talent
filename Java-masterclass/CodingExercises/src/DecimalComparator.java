public class DecimalComparator {

	public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
		double mod = 1000; // 3 decimal places

		double roundedX = (int) (x * mod) / mod; // casting to int cuts off decimal places
		double roundedY = (int) (y * mod) / mod;

		return roundedX == roundedY;
	}

}