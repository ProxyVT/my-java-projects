import java.util.Scanner;

public class Shapes {

	public static final int CUBE = 1;
	public static final int CIRCLE = 2;
	public static final int RECTANGLE = 3;
	public static final int SQUARE = 4;
	public static final int TRIANGLE = 5;
	public static final int RIGHT_TRIANGLE = 6;
	public static int number;						// �������� ������������� �������� ������

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose the number of the shape you want:\n" + "\nCube - 1\n" + "Circle - 2\n"
				+ "Rectangle - 3\n" + "Square - 4\n" + "Triangle - 5\n" + "Right Triangle - 6\n" + "\nEnter your number:");
		number = scanner.nextInt();

		switch (number) {
		case CUBE:
			Cube.resultCube();
			break;
		case CIRCLE:
			Circle.resultCircle();
			break;
		case RECTANGLE:
			Circle.resultRectangle();
			break;
		case SQUARE:
			Circle.resultSquare();
			break;
		case TRIANGLE:
			Circle.resultTriangle();
			break;
		case RIGHT_TRIANGLE:
			Circle.resultRightTriangle();
			break;
		default:
			System.out.println("Wrong value!");
		}
		
		scanner.close();
	}

}
