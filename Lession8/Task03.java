import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input the day of the week as a number: ");
		int number = scanner.nextInt();

		switch(number) {
			case 1: day = "Monday"; break;
			case 2: day = "Tuesday"; break;
			case 3: day = "Wednesday"; break;
			case 4: day = "Thursday"; break;
			case 5: day = "Friday"; break;
			case 6: day = "Saturday"; break;
			case 7: day = "Sunday"; break;
			default: day = "There's no such day";
		}
		
		
//		if (number == 1) {
//			day = "Monday";
//		} else if (number == 2) {
//			day = "Tuesday";
//		} else if (number == 3) {
//			day = "Wednesday";
//		} else if (number == 4) {
//			day = "Thursday";
//		} else if (number == 5) {
//			day = "Friday";
//		} else if (number == 6) {
//			day = "Saturday";
//		} else if (number == 7) {
//			day = "Sunday";
//		}

		System.out.println(day);

		scanner.close();
	}
}
