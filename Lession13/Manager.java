
public class Manager {

	public static double marks(int[] marks) {

		double average = 0;
		int index = 0;
		while (index < marks.length) {
			average += marks[index];
			index++;
		}

		return average / marks.length;

	}

}
