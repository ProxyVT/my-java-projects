import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter integer coordinates of the rectangle (x1,y1,x2,y2): ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		System.out.println("Enter integer coordinates of the point (x,y): ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		boolean result = Point.checkPointPositionInRectangle(x1, y1, x2, y2, x, y);

		String msg = result ? "Point inside the rectangle" : "Point outside the rectangle";
		System.out.println(msg);

		scanner.close();
	}

}
