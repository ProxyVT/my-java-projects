import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input the day of the week as a number: ");
		int number = scanner.nextInt();
		String day = "There's no such day"; // If number not equal 1-7

		if (number == 1) {
			day = "Monday";
		} else if (number == 2) {
			day = "Tuesday";
		} else if (number == 3) {
			day = "Wednesday";
		} else if (number == 4) {
			day = "Thursday";
		} else if (number == 5) {
			day = "Friday";
		} else if (number == 6) {
			day = "Saturday";
		} else if (number == 7) {
			day = "Sunday";
		}
		
		System.out.println(day);
		
		scanner.close();
	}
}
