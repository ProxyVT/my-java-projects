
public class Task1 {

	public static int sumAllNumberDigits(int number) {
		
		int sum = 0;

		while (number > 0) {

			sum += number % 10;
			number /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {

		int number = 12045;

		System.out.println(sumAllNumberDigits(number));
	}

}
