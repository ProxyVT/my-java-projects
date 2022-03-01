 import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount of numbers: ");
		int count = scanner.nextInt();
		double [] numbers = new double[count];
		int index = 0;
		
		while (index < numbers.length) {
			System.out.printf("Input %d-number", index + 1);
			numbers[index] = scanner.nextDouble();
			index++;
		}
		
		double arithmeticalResult = Average.arithmetical(numbers);
		double geometricalResult = Average.geometrical(numbers);
		String msg = String.format("The arithmetical mean of the numbers = %f\n"
				+ "The geometrical mean of the numbers = %f"
				, arithmeticalResult, geometricalResult);
		System.out.println(msg);
		
		scanner.close();
			
	}

}
