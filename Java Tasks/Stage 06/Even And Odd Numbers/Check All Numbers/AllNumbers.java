
public class AllNumbers {

	public static boolean checkAll(int a, int b, int c) {
		return a % 2 == 0 && b % 2 == 0 && c % 2 == 0 
				|| a % 2 != 0 && b % 2 != 0 && c % 2 != 0;
	}

	public static boolean checkEven(int a, int b, int c) {
		return a % 2 == 0 && b % 2 == 0 && c % 2 == 0;
	}

	public static boolean checkOdd(int a, int b, int c) {
		return a % 2 != 0 && b % 2 != 0 && c % 2 != 0;
	}
	
}
