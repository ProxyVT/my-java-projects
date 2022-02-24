import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input a: ");
		int a = scanner.nextInt();
		
		System.out.print("Input b: ");
		int b = scanner.nextInt();
		
		System.out.print("Input c: ");
		int c = scanner.nextInt();
		
		boolean pA = a > 0;
	    boolean pB = b > 0;
		boolean pC = c > 0;
		
		boolean morePositiveNumbers = pA && pB || pB && pC || pA && pC;
		boolean moreNegativeNumbers = !morePositiveNumbers;
		
		String smg = morePositiveNumbers ? "More positive numbers" : "Negative answer"; 
		System.out.println(smg);
		
		scanner.close();
	}

}
