public class PlayingCat {

	public static boolean isCatPlaying(boolean summer, int temperature) {
		if (temperature < 25)
			return false;
		if (temperature > 45)
			return false;
		if (temperature > 35 && !summer)
			return false;
		else
			return true;
	}
}