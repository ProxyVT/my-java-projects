import java.util.Scanner;

public class Perimeter_and_area_of_a_rectangle {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sides a and b of the rectangle:");
		double a = scanner.nextInt();
		double b = scanner.nextInt();
		
		double perimeter = a + a + b + b;
		double square = a * b;
		
		System.out.printf("%f and %f", perimeter, square);
		scanner.close();
	}
}
