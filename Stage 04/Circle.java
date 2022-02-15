import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");

		double radius = scanner.nextInt();
		double circle_perimeter = 2 * Math.PI * radius; // Формула периметра круга (длинна окружности)
		double circle_area = Math.PI * radius * radius; // Формула площади круга

		System.out.printf("Perimeter (circumference length): %f\nArea: %f", circle_perimeter, circle_area);
		scanner.close();

	}
	
}
