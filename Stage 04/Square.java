import java.util.Scanner;

public class Square {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter side A of the square: ");

		double sideA = scanner.nextInt();
		double perimeter = sideA * 4; // Формула периметра квадрата
		double area = sideA * sideA; // Формула площади квадрата

		System.out.printf("Perimeter: %f\nArea: %f", perimeter, area);
		scanner.close();

	}
	
}
