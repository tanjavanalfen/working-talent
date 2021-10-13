public class Main {

	public static void main(String[] args) {
		System.out.println(getDurationString(69, 42));
		System.out.println(getDurationString(1000));
	}
	
	public static String getDurationString(int minutes, int seconds) {
		if (minutes < 0 || seconds < 0 || seconds > 59)  // seconds are always sub-minutes, so can be left alone
			return "Invalid value";
		
		int hours = minutes / 60;  // int removes possible decimals
		minutes = minutes % 60; 
		return (hours + "h " + minutes + "m " + seconds + "s");
	}
	
	public static String getDurationString(int seconds) {
		if (seconds < 0)
			return "Invalid value";
		
		int minutes = seconds / 60;
		seconds = seconds % 60;
		return getDurationString(minutes, seconds);
	}

}
