
public class TestLoops3 {

	public static void main(String[] args) {
		
		int number = 5;
		int p = 1;
		int i = 2;
		
		while(i <= number) {
			p *= i;
			i++;
		}
		
		System.out.println(p);

	}

}
