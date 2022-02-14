import java.util.Scanner;

public class Perimeter_and_area_of_the_right_triangle {

	public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter legs a and b of the right triangle: ");
			double leg_a = scanner.nextInt();
			double leg_b = scanner.nextInt();
			
			double triangle_hypotenuse = Math.sqrt((leg_a*leg_a) + (leg_b*leg_b));
			double triangle_perimeter = leg_a + leg_b + triangle_hypotenuse; // Формула периметра треугольника
			double triangle_area = 0.5 * (leg_a * leg_b); // Формула площади треугольника
			
			System.out.printf("Hypotenuse: %f\nPerimeter: %f\nArea: %f", triangle_hypotenuse,triangle_perimeter, triangle_area);
			scanner.close();

	}
}
