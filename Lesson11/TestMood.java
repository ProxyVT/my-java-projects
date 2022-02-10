public class TestMood {

	public static void main(String[] args) {

		String expected = DetectorMood.HAPPY_MOOD;

		boolean flag = false;

		int iteration = 2 * DetectorMood.MOOD_COUNT;

		while (iteration > 0) {
			String actual = DetectorMood.detect();
			if (expected.equals(actual)) {
			flag = true;
			System.out.println("test passed...");
			}
			iteration--;
		}

		if (!flag) {
			System.out.println("test failed...");
		}
	}
}
