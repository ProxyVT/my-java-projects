import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input three your numbers: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		boolean parity = CheckNumbers.evenOrOdd(a, b, c);
		boolean sameness = CheckNumbers.parity(a, b, c);

		String result1 = parity ? "More even numbers" : "More odd numbers";
		String result2 = sameness ? "Numbers have the same parity" 
				: "Numbers have different parity";
		String msg = String.format("%s\n" + "%s", result1, result2);
		System.out.println(msg);

		scanner.close();

	}

}
