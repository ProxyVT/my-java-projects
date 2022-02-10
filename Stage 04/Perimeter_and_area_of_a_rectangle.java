import java.util.Scanner;

public class Perimeter_and_area_of_a_rectangle {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sides a and b of the rectangle:");
		double side_a = scanner.nextInt();
		double side_b = scanner.nextInt();
		
		double rectangle_perimeter = side_a * 2 + side_b * 2;
		double rectangle_square = side_a * side_b;
		
		System.out.printf("%f and %f", rectangle_perimeter, rectangle_square);
		scanner.close();
	}
}
