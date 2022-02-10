import java.util.Random;

public class DetectorMood {

	public static final int MOOD_COUNT = 5;
	public static final String HAPPY_MOOD = ":)";
	public static final String SAD_MOOD = ":(";
	public static final String NEUTRAL_MOOD = ":|";
	public static final String NERVOUS_MOOD = ":/";
	public static final String SHOUTED_MOOD = ":()";

	public static String detect() {

		Random random = new Random();

		int number = random.nextInt(MOOD_COUNT);
		String mood = HAPPY_MOOD;

		switch (number) {
		case 0:
			mood = SAD_MOOD;
			break;
		case 1:
			mood = NEUTRAL_MOOD;
			break;
		case 2:
			mood = NERVOUS_MOOD;
			break;
		case 3:
			mood = SHOUTED_MOOD;
			break;
		}

		return mood;
	}

}
