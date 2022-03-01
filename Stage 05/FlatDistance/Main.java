import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter coordinates x1 and y1: ");
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		System.out.println("Enter coordinates x2 and y2: ");
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();

		double result = Distance.calculation(x1, y1, x2, y2);
		String msg = String.format("Distance between two points: %f", result);
		System.out.println(msg);

		scanner.close();

	}

}
