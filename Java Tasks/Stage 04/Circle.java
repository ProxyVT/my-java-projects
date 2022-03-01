import java.util.Scanner;

public class Circle {

	public static String resultCircle() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		double radius = scanner.nextDouble();
		
		double circlePerimeter = 2 * Math.PI * radius; // Формула периметра круга (длинна окружности)
		double circleArea = Math.PI * Math.pow(radius, 2); // Формула площади круга

		System.out.printf("Perimeter (circumference length): %f\nArea: %f", circlePerimeter, circleArea);
		scanner.close();

		return null;

	}

}
