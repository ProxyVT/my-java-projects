import java.util.Scanner;
 
public class Mass {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter mass of the dinosaur in grams: ");
        int mass = in.nextInt();
	int grams = mass;
	double kilograms = grams * 0.001;
	double centners = kilograms * 0.01;
	double tons = centners * 0.1;
	double kilotons = tons * 0.001;
        
	System.out.printf("Mass of the dinosaur in grams: %,d \n", grams);
        System.out.printf("Mass of the dinosaur in kilograms: %,.3f \n", kilograms);
        System.out.printf("Mass of the dinosaur in centners: %,.5f \n", centners);
        System.out.printf("Mass of the dinosaur in tons: %,.6f \n", tons);
        System.out.printf("Mass of the dinosaur in kilotons: %,.9f \n", kilotons);
		
        in.close();
    }
}
