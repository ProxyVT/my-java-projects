import java.util.Scanner;

public class RightTriangle {

	public static String resultRightTriangle() {
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter legs A and B of the right triangle: ");
		double legA = scanner.nextInt();
		double legB = scanner.nextInt();
			
		double hypotenuse = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
		double rightTriangelPerimeter = legA + legB + hypotenuse; // Формула периметра треугольника
		double rightTriangleArea = 0.5 * (legA * legB); // Формула площади треугольника
			
		System.out.printf("Hypotenuse: %f\nPerimeter: %f\nArea: %f", hypotenuse, rightTriangelPerimeter, rightTriangleArea);
		scanner.close();
		
		return null;

	}
	
}
