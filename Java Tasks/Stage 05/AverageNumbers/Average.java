public class Average {

	
	public static double arithmetical (double[] numbers) {   // Вычисление среднего арифметического для ряда чисел
		
		double average = 0;
		int index = 0;
		while (index < numbers.length) {
			average += numbers[index];
			index++;
		}
		
		return Math.abs(average) / numbers.length;
				
	}
	
	public static double geometrical (double[] numbers) {   // Вычисление среднего геометрического для ряда чисел
		
		double average = 0;
		int index = 0;
		while (index < numbers.length) {
			average += numbers[index];
			index++;
		}
		
		return Math.sqrt(Math.abs(average)) ;
	}
	
}
