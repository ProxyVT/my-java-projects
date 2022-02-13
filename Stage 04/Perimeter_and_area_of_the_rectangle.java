import java.util.Scanner;

public class Perimeter_and_area_of_the_rectangle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sides a and b of the rectangle: ");
		
		double side_a = scanner.nextInt();
		double side_b = scanner.nextInt();
		double rectangle_perimeter = 2 * (side_a + side_b); // Формула периметра прямоугольника
		double rectangle_area = side_a * side_b; // Формула площади прямоугольника
		
		System.out.printf("Perimeter: %f\nArea: %f", rectangle_perimeter, rectangle_area);
		scanner.close();

	}
}

