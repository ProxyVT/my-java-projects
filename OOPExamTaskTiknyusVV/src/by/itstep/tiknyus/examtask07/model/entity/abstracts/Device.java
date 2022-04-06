package by.itstep.tiknyus.examtask07.model.entity.abstracts;

public class Device {
	private double weight;
	private double price;
	private boolean socketStatus;
	private int power;

	public Device() {
	}

	public Device(double weight, double price, boolean socketStatus, int power) {
		super();
		this.weight = weight;
		this.price = price;
		this.socketStatus = socketStatus;
		this.power = power;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isSocketStatus() {
		return socketStatus;
	}

	public void setSocketStatus(boolean socketStatus) {
		this.socketStatus = socketStatus;
	}

	public double getPowerConsumption() {
		return power;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.power = powerConsumption;
	}

	@Override
	public String toString() {
		return ", weight = " + weight + ", price = " + price + ", socket status = " + socketStatus
				+ ", power = " + power + "]";
	}

}
