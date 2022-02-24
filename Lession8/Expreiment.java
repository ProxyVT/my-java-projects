public class Expreiment {

	public static void main(String[] args) {

		int a = 2;
		int b = 3;
		
		a += b;
		b = a - b;
		a -= b;

		System.out.printf("a = %d, b = %d\n", a, b);

	}
}
