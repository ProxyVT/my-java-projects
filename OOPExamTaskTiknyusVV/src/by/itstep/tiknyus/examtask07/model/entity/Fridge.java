package by.itstep.tiknyus.examtask07.model.entity;

import by.itstep.tiknyus.examtask07.model.entity.abstracts.Device;

public class Fridge extends Device {
	private String panelMaterial;
	private int shelves;

	public Fridge() {
		super();
	}

	public Fridge(String panelMaterial, int shelves, double weight, double price, boolean socketStatus, 
			int power) {
		super(weight, price, socketStatus, power);
		this.panelMaterial = panelMaterial;
		this.shelves = shelves;
	}

	public String getPanelMaterial() {
		return panelMaterial;
	}

	public void setPanelMaterial(String panelMaterial) {
		this.panelMaterial = panelMaterial;
	}

	public int getShelves() {
		return shelves;
	}

	public void setShelves(int shelves) {
		if (shelves > 0) {
			this.shelves = shelves;
		}

	}

	@Override
	public String toString() {
		return "Fridge [panel material = " + panelMaterial + ", freezer shelves = " + shelves + "" + super.toString();
	}

}
