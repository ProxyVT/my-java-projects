import java.util.Scanner;
 
public class Distance {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the distance between two cities in centimeters: ");
        int a = in.nextInt();
	int centimeters = a;
	double meters = centimeters * 0.01;
	double kilometers = meters * 0.001;
        
	System.out.printf("Distance in centimeters: %,d \n", centimeters);
        System.out.printf("Distance in meters: %,.2f \n", meters);
        System.out.printf("Distance in kilometers: %,.5f \n", kilometers);
		
        in.close();
    }
} 
