import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input three your numbers: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		boolean resultEvenNumbers = JustOneNumber.checkEven(a, b, c);
		boolean resultOddumbers = JustOneNumber.checkOdd(a, b, c);

		String even = resultEvenNumbers ? "One of the numbers is even" : "";
		String odd = resultOddumbers ? "One of the numbers is odd" : "";
		
		String msg = String.format("%s\n" + "%s", even, odd);
		System.out.println(msg);

		scanner.close();

	}

}
