import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter legs A and B of the right triangle: ");
		double legA = scanner.nextInt();
		double legB = scanner.nextInt();
			
		double hypotenuse = Math.sqrt((legA * legA) + (legB * legB));
		double perimeter = legA + legB + hypotenuse; // Формула периметра треугольника
		double area = 0.5 * (legA * legB); // Формула площади треугольника
			
		System.out.printf("Hypotenuse: %f\nPerimeter: %f\nArea: %f", hypotenuse,perimeter, area);
		scanner.close();

	}
	
}
