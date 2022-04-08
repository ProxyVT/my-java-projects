package by.itstep.tiknyus.examtask07.util;

public interface Data {

	// Fridge
		public static final double MAX_FRIDGE_WEIGHT_KILLOGRAMM = 100.0;
		public static final double MIN_FRIDGE_WEIGHT_KILLOGRAMM = 1.0;
		public static final int MAX_FRIDGE_POWER_WATTS = 300;
		public static final int MIN_FRIDGE_POWER_WATTS = 100;

		public static final int MAX_FRIDGE_FREEZER_SHELVES = 8;
		public static final int MIN_FRIDGE_FREEZER_SHELVES = 1;
		public static final String[] energy = { "'A++'", "'A++'", "'A+'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'" };

		// Kettle
		public static final double MAX_KETTLE_WEIGHT_KILLOGRAMM = 2.0;
		public static final double MIN_KETTLE_WEIGHT_KILLOGRAMM = 0.5;
		public static final int MAX_KETTLE_POWER_WATTS = 3000;
		public static final int MIN_KETTLE_POWER_WATTS = 1;

		public static final String[] colour = { "'White'", "'Black'", "'Green'", "'Blue'", "'Red'" };

		// Microwave
		public static final double MAX_MICROWAVE_WEIGHT_KILLOGRAMM = 45.0;
		public static final double MIN_MICROWAVE_WEIGHT_KILLOGRAMM = 5.0;
		public static final int MAX_MICROWAVE_POWER_WATTS = 3500;
		public static final int MIN_MICROWAVE_POWER_WATTS = 500;

		public static final double MAX_MICROWAVE_CAPACITY_LITER = 50.0;
		public static final double MIN_MICROWAVE_CAPACITY_LITER = 15.0;
		public static final String[] fit = { "'Built In'", "'Freestanding'" };

		// General device
		public static final double MAX_DEVICE_PRICE_DOLLAR = 5000.0;
		public static final double MIN_DEVICE_PRICE_DOLLAR = 1.0;
		
		//Switching block
		public static final int SHOW_DEVICES = 1;
		public static final int CALCULATE_DEVICES = 2;
		public static final int SORT_DEVICES = 3;
		public static final int EXIT_PROGRAMM = 4;
		public static final String ERROR_MESSAGE = "Wrong value, try again!";

}
