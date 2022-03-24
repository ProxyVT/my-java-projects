import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input three your numbers: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		boolean resultAllNumbers = AllNumbers.checkAll(a, b, c);
		boolean resultEvenNumbers = AllNumbers.checkEven(a, b, c);
		boolean resultOddumbers = AllNumbers.checkOdd(a, b, c);
		String all = resultAllNumbers ? "All numbers are identical in parity" 
			: "Numbers have different parity";
		String even = resultEvenNumbers ? "All numbers even" : "";
		String odd = resultOddumbers ? "All numbers odd" : "";
		
		String msg = String.format("%s\n" + "%s" + "%s", all, even, odd);
		System.out.println(msg);

		scanner.close();

	}

}
