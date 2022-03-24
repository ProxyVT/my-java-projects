public class CheckAllNumbers {

	public static boolean evenOrOdd(int a, int b, int c) {
		return a % 2 == 0 && b % 2 == 0 
				|| b % 2 == 0 && c % 2 == 0 
				|| a % 2 == 0 && c % 2 == 0;
	}
