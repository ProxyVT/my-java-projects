package by.itstep.tiknyus.examtask07.model.logic;

import by.itstep.tiknyus.examtask07.model.entity.Apartment;
import by.itstep.tiknyus.examtask07.model.entity.abstracts.Device;
import by.itstep.tiknyus.examtask07.model.exception.DeviceIndexOutOfBoundException;

public class Calculator {
	public static double calcTotalPrice(Apartment apartment) {
        double total = 0;

        try {
            for (int i = 0; i < apartment.getDeviceSize(); i++) {
                Device device = apartment.get(i);
                total += device.getPrice();
            }

        } catch (DeviceIndexOutOfBoundException exc) {
            System.err.println(exc);
        }

        return total;
    }

}
