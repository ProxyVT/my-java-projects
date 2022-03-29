import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input three your numbers: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		boolean resultEvenNumbers = OnlyOneNumber.checkEven(a, b, c);
		boolean resultOddumbers = OnlyOneNumber.checkOdd(a, b, c);

		String even = resultEvenNumbers ? "Only one even number" : "";
		String odd = resultOddumbers ? "Only one odd number" : "";
		
		String msg = String.format("%s\n" + "%s", even, odd);
		System.out.println(msg);

		scanner.close();

	}
	
}

