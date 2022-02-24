import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input number of marks");
		int count = scanner.nextInt();
		int[] marks = new int[count];
		int index = 0;

		while (index < marks.length) {
			System.out.printf("Input %d-mark: ", index + 1);
			marks[index] = scanner.nextInt();
			index++;
		}

		double result = Manager.marks(marks);
		String msg = String.format("Average mark = %.2f", result);
		System.out.println(msg);

		scanner.close();
	}

}
