import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the edge of the cube: ");

		double edge = scanner.nextInt();
		double voulme = edge * edge * edge; // Формула объема куба
		double surface = 6 * edge * edge; // Формула площади поверхности куба

		System.out.printf("Volume: %f\nSurface area: %f", voulme, surface);
		scanner.close();

	}
	
}
