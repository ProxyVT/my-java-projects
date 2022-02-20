import java.util.Scanner;

public class Cube {

	public static String resultCube() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the edge of the cube: ");
		double edge = scanner.nextInt();

		double voulme = Math.pow(edge, 3); // Формула объема куба
		double surface = 6 * Math.pow(edge, 2); // Формула площади поверхности куба

		System.out.printf("Volume: %f\nSurface area: %f", voulme, surface);
		scanner.close();

		return null;

	}

}
