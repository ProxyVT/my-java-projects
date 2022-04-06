package by.itstep.tiknyus.examtask07.model.entity.abstracts;

public class Device {
	private int weight;
	private double price;
	private boolean socketStatus;
	private int powerConsumption;

	public Device() {
	}

	public Device(int weight, double price, boolean socketStatus, int powerConsumption) {
		super();
		this.weight = weight;
		this.price = price;
		this.socketStatus = socketStatus;
		this.powerConsumption = powerConsumption;
	}

	public int getWeight() {
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

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	@Override
	public String toString() {
		return "Device [weight=" + weight + ", price=" + price + ", socketStatus=" + socketStatus
				+ ", powerConsumption=" + powerConsumption + "]";
	}

}
