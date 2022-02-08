import java.util.Scanner;

public class Task11 {

	public static boolean checkPositiveNumber(int a, int b, int c) { 
		return a > 0 || b > 0 || c > 0;		
	}
	
	public static boolean checkMorePositiveNumber(int a, int b, int c) { 
		return a > 0 && b > 0 || b > 0 && c > 0 || a > 0 && c > 0;		
	}
	
	public static void main(String [] args) {
		// input block
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input your numbers");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		// logic
		
		boolean result = checkPositiveNumber(a, b, c);
		
		//output block
		
		String msg = result ? "Yes" : "No";
		System.out.println(msg);
		
		result = checkMorePositiveNumber(a, b, c);
		msg = result ? "Yes, we have more positive numbers" : "No";
		System.out.println(msg);
		
		scanner.close();
	}

}
