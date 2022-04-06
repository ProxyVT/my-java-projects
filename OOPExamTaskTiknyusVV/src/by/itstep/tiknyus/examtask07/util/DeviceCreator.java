package by.itstep.tiknyus.examtask07.util;

import java.util.Random;

import by.itstep.tiknyus.examtask07.model.entity.Apartment;
import by.itstep.tiknyus.examtask07.model.entity.abstracts.Device;
import by.itstep.tiknyus.examtask07.model.entity.Fridge;
import by.itstep.tiknyus.examtask07.model.entity.Kettle;
import by.itstep.tiknyus.examtask07.model.entity.Microwave;

public class DeviceCreator {

	public static final int DEVICE_COUNT = 3;

	// Fridge
	public static final double MAX_FRIDGE_WEIGHT_KILLOGRAMM = 100.0;
	public static final double MIN_FRIDGE_WEIGHT_KILLOGRAMM = 1.0;
	public static final int MAX_FRIDGE_POWER_WATTS = 300;
	public static final int MIN_FRIDGE_POWER_WATTS = 100;

	public static final int MAX_FRIDGE_FREEZER_SHELVES = 8;
	public static final int MIN_FRIDGE_FREEZER_SHELVES = 1;
	public static final String[] material = { "'Best'", "'First'", "'Second'" };

	// Kettle
	public static final double MAX_KETTLE_WEIGHT_KILLOGRAMM = 2.0;
	public static final double MIN_KETTLE_WEIGHT_KILLOGRAMM = 0.5;
	public static final int MAX_KETTLE_POWER_WATTS = 3000;
	public static final int MIN_KETTLE_POWER_WATTS = 1;

	// Microwave
	public static final double MAX_MICROWAVE_WEIGHT_KILLOGRAMM = 45.0;
	public static final double MIN_MICROWAVE_WEIGHT_KILLOGRAMM = 5.0;
	public static final int MAX_MICROWAVE_POWER_WATTS = 3500;
	public static final int MIN_MICROWAVE_POWER_WATTS = 500;

	public static final double MAX_MICROWAVE_CAPACITY_LITER = 50.0;
	public static final double MIN_MICROWAVE_CAPACITY_LITER = 15.0;

	// General device
	public static final double MAX_DEVICE_PRICE_DOLLAR = 5000.0;
	public static final double MIN_DEVICE_PRICE_DOLLAR = 1.0;

	private static Random random;

	static {
		random = new Random();
	}

	public static Apartment create(int count) {
		Apartment apartment = new Apartment();

		for (int i = 0; i < count; i++) {
			apartment.add(getDevice());
		}

		return apartment;
	}

	public static Device getTypeDevice(int type) {

		String panelMaterial = material[random.nextInt(material.length)];
		int shelves = random.nextInt() * (MAX_FRIDGE_FREEZER_SHELVES - MIN_FRIDGE_FREEZER_SHELVES + 1);
		double weight = random.nextDouble()
				* (Math.ceil(MAX_FRIDGE_WEIGHT_KILLOGRAMM) - Math.ceil(MIN_FRIDGE_WEIGHT_KILLOGRAMM) + 1);
		double price = random.nextDouble() * (MAX_DEVICE_PRICE_DOLLAR - MIN_DEVICE_PRICE_DOLLAR + 1);

		int power = random.nextInt() % MAX_FRIDGE_POWER_WATTS + MIN_FRIDGE_POWER_WATTS;

		boolean socketStatus = random.nextBoolean();

		Device device = new Fridge(panelMaterial, shelves, weight, price, socketStatus, power);

		switch (type) {
		case 0: {
			device = new Kettle();
		}
			break;
		case 1: {
			device = new Microwave();
		}
			break;
		}

		return device;
	}

	private static Device getDevice() {
		int type = random.nextInt(DEVICE_COUNT);
		return getTypeDevice(type);
	}

	public static Apartment create() {
		Apartment apartment = new Apartment();
		// ...

		return apartment;
	}

}
