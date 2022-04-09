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
			// Step one
		public static final int CREATE_DEVICES = 1;
		public static final int EXIT_PROGRAMM_STEP_ONE = 2;
		public static final int BACK = 4;
			// Step two
		public static final int CALCULATE_DEVICES = 1;
		public static final int SEARCH_DEVICES = 2;
		public static final int SORT_DEVICES = 3;
		public static final int EXIT_PROGRAMM_STEP_TWO = 4;
		
			// Calculator switch
		public static final int TOTAL_POWER = 1;
		public static final int PLUGGED_IN = 2;
		public static final int TWO_VALUES = 3;
		
			// Max min searcher
		public static final int MAX = 1;
		public static final int MIN = 2;
		
			// Values
		public static final int PRICE = 1;
		public static final int WEIGHT = 2;
		public static final int POWER_CONSUMPTION = 3;
		public static final int NAME = 4;
		public static final int BACKWARD = 5;
		
		
		
		public static final String ERROR_MESSAGE = "Wrong value, try again!";

}
