package by.itstep.tiknyus.examtask07.util;

import java.util.Random;

import by.itstep.tiknyus.examtask07.model.entity.Apartment;
import by.itstep.tiknyus.examtask07.model.entity.abstracts.Device;
import by.itstep.tiknyus.examtask07.model.entity.Fridge;
import by.itstep.tiknyus.examtask07.model.entity.Kettle;
import by.itstep.tiknyus.examtask07.model.entity.Microwave;

public class DeviceCreator {

	public static final int DEVICE_COUNT = 3;

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

		String energyRathing = Names.energy[random.nextInt(Names.energy.length)];
		int shelves = random.nextInt() * (Names.MAX_FRIDGE_FREEZER_SHELVES - Names.MIN_FRIDGE_FREEZER_SHELVES + 1);
		double weightFrdige = random.nextDouble()
				* (Names.MAX_FRIDGE_WEIGHT_KILLOGRAMM - Names.MIN_FRIDGE_WEIGHT_KILLOGRAMM + 1);
		int powerFridge = random.nextInt(Names.MAX_FRIDGE_POWER_WATTS);
		boolean socketStatus = random.nextBoolean();

		double price = random.nextDouble() * (Names.MAX_DEVICE_PRICE_DOLLAR - Names.MIN_DEVICE_PRICE_DOLLAR + 1);

		Device device = new Fridge(energyRathing, shelves, weightFrdige, price, socketStatus, powerFridge);

		switch (type) {
		case 0: {

			String color = Names.colour[random.nextInt(Names.colour.length)];
			boolean dryProtection = random.nextBoolean();
			double weightKettle = random.nextDouble()
					* (Names.MAX_KETTLE_WEIGHT_KILLOGRAMM - Names.MIN_KETTLE_WEIGHT_KILLOGRAMM + 1);
			int powerKettle = random.nextInt(Names.MAX_KETTLE_POWER_WATTS);

			device = new Kettle(color, dryProtection, weightKettle, price, socketStatus, powerKettle);
		}
			break;
		case 1: {

			double capacity = random.nextDouble()
					* (Names.MAX_MICROWAVE_CAPACITY_LITER - Names.MIN_MICROWAVE_CAPACITY_LITER + 1);
			String fitType = Names.fit[random.nextInt(Names.fit.length)];
			double weightMicrowave = random.nextDouble()
					* (Names.MAX_MICROWAVE_WEIGHT_KILLOGRAMM - Names.MIN_MICROWAVE_WEIGHT_KILLOGRAMM + 1);
			int powerMicrowave = random.nextInt(Names.MAX_MICROWAVE_POWER_WATTS);

			device = new Microwave(capacity, fitType, weightMicrowave, price, socketStatus, powerMicrowave);
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
