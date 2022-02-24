public class TestLoops2 {
	public static void main(String[] args) {

		int number = 100;
		int count = 0;

		while (number != 0) {

			number = number / 2;
			count++;
		}

		System.out.println(count);
	}
}
