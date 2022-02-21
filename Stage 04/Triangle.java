import java.util.Scanner;


public class Triangle {

	public static String resultTriangle() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter coordinate x1 and y1  of the triangle: ");
		double x1 = scanner.nextInt();
		double y1 = scanner.nextInt();
		System.out.println("Enter coordinate x2 and y2  of the triangle: ");
		double x2 = scanner.nextInt();
		double y2 = scanner.nextInt();
		System.out.println("Enter coordinate x3 and y3  of the triangle: ");
		double x3 = scanner.nextInt();
		double y3 = scanner.nextInt();
		
		double sideOne = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2); // Формула нахождения 1-й стороны треугольника
		double sideTwo = Math.sqrt(Math.pow((x3-x2), 2) + Math.pow((y3-y2), 2); // Формула нахождения 2-й стороны треугольника
		double sideThree = Math.sqrt(Math.pow((x3-x1), 2) + Math.pow((y3-y1), 2); // Формула нахождения 3-й стороны треугольника
		double trianglePerimeter = sideOne + sideTwo + sideThree; // Формула периметра треугольника
		double triangleArea = 0.5 * Math.abs((x2-x1) * (y3-y1) - (x3-x1)*(y2-y1)); // Формула площади треугольника
		
		System.out.printf("Perimeter: %f\nArea: %f", trianglePerimeter, triangleArea);
		scanner.close();
		
		return null;

	}

}
