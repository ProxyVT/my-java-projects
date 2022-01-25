import java.util.Scanner;
 
public class Age {
   
    public static void main(String[] args) {
           
    	Scanner in = new Scanner(System.in);
    	System.out.print("Please enter your age in years: ");
    	int a = in.nextInt();
	int years = a;
	int months = years * 12;
	int weeks = months * 54;
	int days = weeks * 365;
	int hours = days * 24;
	long minutes = hours * 60L;
	long seconds = minutes * 60L;
	long milliseconds = seconds * 1000L;
        
	System.out.printf("Your age in years: %,d \n", years);
        System.out.printf("Your age in months: %,d \n", months);
        System.out.printf("Your age in weeks: %,d \n", weeks);
        System.out.printf("Your age in days: %,d \n", days);
        System.out.printf("Your age in hours: %,d \n", hours);
        System.out.printf("Your age in minutes: %,d \n", minutes);
        System.out.printf("Your age in seconds: %,d \n", seconds);
        System.out.printf("Your age in milliseconds: %,d \n", milliseconds);
        in.close();
    }
}
