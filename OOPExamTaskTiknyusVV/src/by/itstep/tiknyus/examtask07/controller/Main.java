package by.itstep.tiknyus.examtask07.controller;

import java.util.Scanner;

import by.itstep.tiknyus.examtask07.model.entity.Apartment;
import by.itstep.tiknyus.examtask07.model.logic.Calculator;
import by.itstep.tiknyus.examtask07.util.DeviceCreator;
import by.itstep.tiknyus.examtask07.view.Printer;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Printer.print("Input number of devices:");
		int count = scanner.nextInt();
		Apartment apartment = DeviceCreator.create(count);

		double total = Calculator.calcTotalPrice(apartment);

		Printer.print(apartment);
		Printer.print("\nTotal price = " + total);
		scanner.close();

	}

}
