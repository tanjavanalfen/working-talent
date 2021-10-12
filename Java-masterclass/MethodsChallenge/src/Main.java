
public class Main {

	public static void main(String[] args) {
		displayHighScorePosition("Alice", calculateHighScorePosition(1500));
		displayHighScorePosition("Bob", calculateHighScorePosition(900));
		displayHighScorePosition("Charlie", calculateHighScorePosition(400));
		displayHighScorePosition("David", calculateHighScorePosition(50));	
	}
	
	public static void displayHighScorePosition(String name, int highScorePosition) {
		System.out.println(name + " managed to get into position " + highScorePosition + " on the high score table.");
	}
	
	public static int calculateHighScorePosition(int playerScore) {
		if (playerScore > 1000)
			return 1;
		if (playerScore > 500 && playerScore < 1000)
			return 2;
		if (playerScore > 100 && playerScore < 500)
			return 3;
		else
			return 4;
	}
	
}
