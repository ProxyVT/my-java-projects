import java.util.Scanner;

public class Task2 {

	public static boolean searchPerfectNumber(int number) {

		int div = 1;
		int sum = 0;
		int n = number / 2; // Сокращение итераций за счет того, чтобы убрать половину делителей
							// (после которых произведение на делитель больше числа)
		while (div < n) {
			if (number % div == 0) {
				sum += div;
			}
			div++;
		}

		return sum == number;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Print number");
		int number = scanner.nextInt();

		String msg = searchPerfectNumber(number) ? "It's perfect number" 
				: "It's not perfect number";
		System.out.println(msg);
		scanner.close();

	}

}
