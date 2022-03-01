import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter values A and B of the linear equation Ax + B = 0: ");
		double A = scanner.nextDouble();
		double B = scanner.nextDouble();

		double result = Equation.values(A, B);
		String check = Equation.error(A) ? "" : "For a correct result, A should not be equal to 0";

		String msg = String.format("x = %f\n" + "%s", result, check);
		System.out.println(msg);

		scanner.close();

	}

}
