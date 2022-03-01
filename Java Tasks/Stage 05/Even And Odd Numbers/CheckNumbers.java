
public class CheckNumbers {

	public static boolean evenOrOdd(int a, int b, int c) {  // Проверка чисел на четность/нечетность
		return a % 2 == 0 && b % 2 == 0 
				|| b % 2 == 0 && c % 2 == 0 
				|| a % 2 == 0 && c % 2 == 0;
	}

	public static boolean parity(int a, int b, int c) {    // Проверка тождественности четности/нечетности у всех чисел
		return a % 2 == 0 && b % 2 == 0 && c % 2 == 0
				|| a % 2 != 0 && b % 2 != 0 && c % 2 != 0;
	}

}
