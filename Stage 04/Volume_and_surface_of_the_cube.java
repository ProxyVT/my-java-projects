import java.util.Scanner;

public class Volume_and_surface_of_the_cube {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the edge of the cube: ");

		double edge = scanner.nextInt();
		double cube_voulme = edge * edge * edge; // Формула объема куба
		double cube_surface = 6 * edge * edge; // Формула площади поверхности куба

		System.out.printf("Volume: %f\nSurface area: %f", cube_voulme, cube_surface);
		scanner.close();

	}
}
