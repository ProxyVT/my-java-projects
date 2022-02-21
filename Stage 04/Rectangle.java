import java.util.Scanner;

public class Rectangle {

	public static String resultRectangle() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sides A and B of the rectangle: ");
		double sideA = scanner.nextInt();
		double sideB = scanner.nextInt();
		
		double perimeter = 2 * (sideA + sideB); // Формула периметра прямоугольника
		double area = sideA * sideB; // Формула площади прямоугольника
		
		System.out.printf("Perimeter: %f\nArea: %f", perimeter, area);
		scanner.close();
		
		return null;

	}
	
}

