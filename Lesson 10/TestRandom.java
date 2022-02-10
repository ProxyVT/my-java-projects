import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int bound = 5;
		
//		nextInt(max - min) + min  формула расчета диапозона значений для рандома
		
		System.out.println(random.nextDouble(-200, 150));
		System.out.println((char)random.nextInt(69, 150));
	}

}

