import java.util.Scanner;

class TestCool {
	public static void negative() {
		String actual = Task10.findSeason(month: "Cool");
	}
}

	public class Task10 {
	
	public static String findSeason(String month){
	
	// logic block
	String season = "There's no such season";

	switch (month) {
	case "december":
	case "january":
	case "february":
		season = "Winter";
		break;
	case "march":
	case "april":
	case "may":
		season = "Spring";
		break;
	case "june":
	case "july":
	case "august":
		season = "Summer";
		break;
	case "september":
	case "october":
	case "november":
		season = "Autumn";
		break;

	}
	
	return season;
}


	public static void main(String[] args) {
		
		// input block
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your month: ");
		String month = scanner.next().toLowerCase();
		
		String msg = findSeason(month);
		
		// output block
		System.out.println(msg);

		scanner.close();
	}

}
