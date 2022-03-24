
public class Point {
	
	public static boolean checkPointPositionInRectangle(int x1, int y1, int x2, int y2, int x, int y) {
		return x > x1 && x < x2 && y < y1 && y > y2; 
	}

}
