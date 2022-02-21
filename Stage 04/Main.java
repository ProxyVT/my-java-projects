import java.util.Scanner;

public class Main {

	public static final int CUBE = 1;
	public static final int CIRCLE = 2;
	public static final int RECTANGLE = 3;
	public static final int SQUARE = 4;
	public static final int TRIANGLE = 5;
	public static final int RIGHT_TRIANGLE = 6;
	public static int number;		    // Номер требуемой фигуры 

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose the number of the shape you want:\n" + "\nCube - 1\n" + "Circle - 2\n"
				+ "Rectangle - 3\n" + "Square - 4\n" + "Triangle - 5\n" + "Right Triangle - 6\n" + "\nEnter your number:");
		number = scanner.nextInt();

		switch (number) {   // Ввод пользователем данных расчета фигур
		case CUBE:
			Cube.resultCube(); 
			break;
		case CIRCLE:
			Circle.resultCircle();
			break;
		case RECTANGLE:
			Rectangle.resultRectangle();
			break;
		case SQUARE:
			Square.resultSquare();
			break;
		case TRIANGLE:
			Triangle.resultTriangle();
			break;
		case RIGHT_TRIANGLE:
			RightTriangle.resultRightTriangle();
			break;
		default:
			System.out.println("Wrong value!");
		}
		
		scanner.close();
	}

}
