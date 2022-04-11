package by.itstep.tiknyus.javatasks.task01;

public class SameDigits {

	public static int number;
	public static boolean digitsEquals;

	public static boolean checkSameDigits() {
		int lastDigit = number % 10;
		while (number > 0) {
			int currentDigit = number % 10;
			number /= 10;
			digitsEquals = lastDigit == currentDigit;
		}
		return digitsEquals;

	}
}
