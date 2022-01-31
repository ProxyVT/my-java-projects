import java.util.Scanner;

public class Converter_Radians_and_Degrees {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Select the angle measurement type (radians or degrees) and enter a number");
		
		double number = scanner.nextInt();
		double one_degree = 180 / Math.PI;
		double one_radian = Math.PI / 180;
		double degrees = number * one_degree;
		double radians = number * one_radian;
		
		System.out.printf("%f degrees is %f radians\n", number, radians);
		System.out.printf("%f radians is %f degrees", number, degrees);

		scanner.close();

	}
}
