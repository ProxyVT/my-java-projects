package by.itstep.tiknyus.javatasks.task02;

public class DigitsSequence {

	public static int number;
	public static boolean digitsSequence;

	public static boolean checkDigitsSequenceDecreasing() {
		int lastDigit = number % 10;
		while (number > 0) {
			int currentDigit = number % 10;
			number /= 10;
			digitsSequence = lastDigit < currentDigit;
		}
		return digitsSequence;

	}

	public static boolean checkDigitsSequenceIncreasing() {
		
		int firstDigit = number;

		while (number > 9) {
			int currentDigit = number / 10;
			digitsSequence = firstDigit > currentDigit;
		}

		return digitsSequence;
	}

}
