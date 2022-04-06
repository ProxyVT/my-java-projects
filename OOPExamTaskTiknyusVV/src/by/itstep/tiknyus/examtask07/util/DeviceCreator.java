package by.itstep.tiknyus.examtask07.util;

import java.util.Random;

import by.itstep.tiknyus.examtask07.model.entity.Apartment;
import by.itstep.tiknyus.examtask07.model.entity.abstracts.Device;
import by.itstep.vikvik.examproject.model.entity.Bread;
import by.itstep.vikvik.examproject.model.entity.Milk;
import by.itstep.vikvik.examproject.model.entity.Orange;
import by.itstep.vikvik.examproject.model.entity.abstracts.Product;

public class DeviceCreator {

	public static final int DEVICE_COUNT = 10;

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
	
	public static Apartment getTypeDevice(int type){

        double price = random.nextDouble() % MAX_MILK_PRICE + MIN_MILK_PRICE;
        double fat = random.nextDouble() % 10;
        double volume = random.nextDouble() % 5000;

        Product product = new Milk(volume, fat, price);

        switch(type) {
            case 0: {
                String color = colors[random.nextInt(colors.length)];
                String flour = flours[random.nextInt(flours.length)];
                product = new Bread();
            } break;
            case 1: {

                product = new Orange();
            } break;
        }

        return product;
    }

	private static Device getDevice() {
		int type = random.nextInt(DEVICE_COUNT);
		return getTypeProduct(type);
	}

}
