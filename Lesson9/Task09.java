import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		
		for(int a = 0; a < 100; a++) {
		int b = 3;
		int c = 5;
		
		boolean divine_argument = (a % b == 0) || (a % c == 0);		
		
		
		System.out.println(a);
		}
	}

}
