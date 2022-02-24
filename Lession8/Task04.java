import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input your symbol: ");
		String s = scanner.next();
		char symbol = s.charAt(0);
		
		symbol = Character.toLowerCase(symbol);
		
		boolean result = false;
		
		switch(symbol) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'y': result = true;
			
		}
		
		String msg = result ? "Yes, it's vowel." : "Not, it's not vovel.";
		
		System.out.println(msg);
		
		scanner.close();
	}

}
