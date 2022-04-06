package by.itstep.tiknyus.examtask07.model.entity;

import by.itstep.tiknyus.examtask07.model.entity.abstracts.Device;
import by.itstep.tiknyus.examtask07.model.exception.DeviceIndexOutOfBoundException;

public class Apartment {
	private Device[] devices;

	public Apartment() {
		devices = new Device[0];
	}

	public Apartment(Device[] device) {
		super();
		this.devices = devices;
	}
	
	public Device get(int index) throws DeviceIndexOutOfBoundException {
        if (index >= 0 && index < devices.length) {
            return devices[index];
        } else {
            throw new DeviceIndexOutOfBoundException();
        }
    }

	public int getDeviceSize() {
		return devices.length;
	}

	public void add(Device device) {
		Device[] temp = new Device[devices.length + 1];
		int i = 0;
		for (; i < devices.length; i++) {
			temp[i] = devices[i];
		}
		temp[i] = device;
		devices = temp;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder("List of devices:\n");

		for (Device device : devices) {
			builder.append(device).append("\n");
		}

		return builder.toString();
	}

}
