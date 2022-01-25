import java.util.Scanner;
 
public class Size {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter file size in bytes: ");
        long size = in.nextInt();
	long bytes = size;
	long kilobytes = bytes / 1024;
	double megabytes = kilobytes / 1024;
	double gigabytes = megabytes / 1024;
	double terabytes = gigabytes / 1024;
	double petabytes = terabytes / 1024;
	double exabytes = petabytes / 1024;
        
	System.out.printf("File size in bytes: %,d \n", bytes);
        System.out.printf("File size in kilobytes: %,d \n", kilobytes);
        System.out.printf("File size in megabytes: %,f \n", megabytes);
        System.out.printf("File size in gigabytes: %,f \n", gigabytes);
        System.out.printf("File size in terabytes: %,f \n", terabytes);
        System.out.printf("File size in petabytes: %e \n", petabytes);
        System.out.printf("File size in exabytes: %e \n", exabytes);
		
        in.close();
    }
} 
