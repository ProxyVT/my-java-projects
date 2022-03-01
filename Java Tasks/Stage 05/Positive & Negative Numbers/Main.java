import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input three your numbers: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();

		boolean result = CheckNumbers.MorePositiveOrNegative(a, b, c);

		String msg = result ? "There are more positive numbers" : "There are more negative numbers";
		System.out.println(msg);

		scanner.close();

	}

}
