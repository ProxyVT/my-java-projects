import java.util.Scanner;

public class Square {

	public static String resultSquare() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter side A of the square: ");

		double sideA = scanner.nextInt();
		double squarePerimeter = sideA * 4; // Формула периметра квадрата
		double squareArea = Math.pow(sideA, 2); // Формула площади квадрата

		System.out.printf("Perimeter: %f\nArea: %f", squarePerimeter, squareArea);
		scanner.close();
		
		return null;

	}
	
}
