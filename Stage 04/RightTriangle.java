import java.util.Scanner;

public class RightTriangle {

	public static String resultRightTriangle() {
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter legs A and B of the right triangle: ");
		double legA = scanner.nextDouble();
		double legB = scanner.nextDouble();
			
		double hypotenuse = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
		double rightTriangelPerimeter = legA + legB + hypotenuse; // Формула периметра прямоугольного треугольника
		double rightTriangleArea = 0.5 * (legA * legB); // Формула площади прямоугольного треугольника
			
		System.out.printf("Hypotenuse: %f\nPerimeter: %f\nArea: %f", hypotenuse, rightTriangelPerimeter, rightTriangleArea);
		scanner.close();
		
		return null;

	}
	
}
