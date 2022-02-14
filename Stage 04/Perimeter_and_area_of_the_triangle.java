import java.util.Scanner;


public class Perimeter_and_area_of_the_triangle {

	public static void main(String[] args) {

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
		
		double side_xy1_xy2 = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1)); // Формула нахождения 1-й стороны треугольника
		double side_xy2_xy3 = Math.sqrt((x3-x2) * (x3-x2) + (y3-y2) * (y3-y2)); // Формула нахождения 2-й стороны треугольника
		double side_xy3_xy1 = Math.sqrt((x3-x1) * (x3-x1) + (y3-y1) * (y3-y1)); // Формула нахождения 3-й стороны треугольника
		double triangle_perimeter = side_xy1_xy2 + side_xy2_xy3 + side_xy3_xy1; // Формула периметра треугольника
		double triangle_area = 0.5 * Math.abs((x2-x1) * (y3-y1) - (x3-x1)*(y2-y1)); // Формула площади треугольника
		System.out.printf("Perimeter: %f\nArea: %f", triangle_perimeter, triangle_area);
		scanner.close();

	}

}
