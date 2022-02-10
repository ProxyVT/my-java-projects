
public class Dragon {

	public String name;
	public int age;
	public boolean isfire;
	
	public Dragon(String n, int a, boolean fire) {
		name = n;
		age = a;
		isfire = fire;
	}

	public int countHeads() {
		int heads = 3;

		if (age <= 200) {
			heads += age * 3;
		} else if (age <= 300) {
			heads += 200 * 3 + (age - 200) * 2;
		} else if (age > 300) {
			heads += 200 * 3 + 100 * 2 + (age - 300);
		}
		
		return heads;

	}
}
