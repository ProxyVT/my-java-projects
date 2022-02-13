import java.util.Scanner;

public class Perimeter_and_area_of_the_circle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");

		double radius = scanner.nextInt();
		double circle_perimeter = 2 * Math.PI * radius; // Формула периметра круга
		double circle_area = Math.PI * Math.; // Формула площади круга

		System.out.printf("Perimeter: %f\nArea: %f", square_perimeter, square_area);
		scanner.close();

	}

}
