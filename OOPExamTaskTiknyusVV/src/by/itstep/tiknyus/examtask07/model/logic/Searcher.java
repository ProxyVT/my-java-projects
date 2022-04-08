package by.itstep.tiknyus.examtask07.model.logic;

import by.itstep.tiknyus.examtask07.model.entity.Apartment;
import by.itstep.tiknyus.examtask07.model.entity.abstracts.Device;
import by.itstep.tiknyus.examtask07.model.exception.DeviceIndexOutOfBoundException;

public class Searcher {

	// Price
	public static Device getMaxPriceDevice(Apartment apartment) {
		int index = 0;
		Device device = null;

		try {
			for (int i = 0; i < apartment.getDeviceSize(); i++) {
				if (apartment.get(index).getPrice() < apartment.get(i).getPrice()) {
					index = i;
				}
			}
			device = apartment.get(index);

		} catch (DeviceIndexOutOfBoundException e) {
			// ...``
		}

		return device;
	}

	public static Device getMinPriceDevice(Apartment apartment) {
		int index = 0;
		Device device = null;

		try {
			for (int i = 0; i < apartment.getDeviceSize(); i++) {
				if (apartment.get(index).getPrice() > apartment.get(i).getPrice()) {
					index = i;
				}
			}
			device = apartment.get(index);

		} catch (DeviceIndexOutOfBoundException e) {
			// ...``
		}

		return device;
	}
}
