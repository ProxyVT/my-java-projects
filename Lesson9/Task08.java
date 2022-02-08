import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your month: ");
		
		String month = scanner.next().toLowerCase();
		
		String season = "There's no such season";
		
		switch(month) {
		case "december":
		case "january":
		case "february": season = "Winter"; break;
		case "march":
		case "april":
		case "may": season = "Spring"; break;
		case "june":
		case "july":
		case "august": season = "Summer"; break;
		case "september":
		case "october":
		case "november": season = "Autumn"; break;
		
		}

		System.out.println(season);
		
		scanner.close();
	}

}
