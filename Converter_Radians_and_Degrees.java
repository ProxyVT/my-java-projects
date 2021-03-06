import java.util.Scanner;

public class Converter_Radians_and_Degrees {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Select the angle measurement type (radians or degrees) and enter a number: ");
		
		double number = scanner.nextInt();   // Вводимое число радиан или градусов
		double one_radian = 57.295780;      // Количество градусов в одном радиане
		double one_degree = 0.017453;	   // Количество радиан в одном градусе
		double degrees = number * one_radian;	// Формула перевода из радиан в градусы
		double radians = number * one_degree;	// Формула перевода из градусов в радианы
		
		System.out.printf("%f radians is %f degrees\n", number, degrees);
		System.out.printf("%f degrees is %f radians", number, radians);
		
		scanner.close();

	}
}
