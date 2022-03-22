import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a four-digit number: ");
		int number = scanner.nextInt();
		
		boolean result = Palindrome.findPalindrome(number);

		String msg = result ? "It's palindrome" : "It's not palindrome";
		System.out.println(msg);

		scanner.close();
	}

}
