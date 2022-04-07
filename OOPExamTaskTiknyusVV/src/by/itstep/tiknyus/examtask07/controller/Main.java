package by.itstep.tiknyus.examtask07.controller;

import java.util.Scanner;

import by.itstep.tiknyus.examtask07.model.entity.Apartment;
import by.itstep.tiknyus.examtask07.model.logic.Calculator;
import by.itstep.tiknyus.examtask07.model.logic.Sorting;
import by.itstep.tiknyus.examtask07.util.DeviceCreator;
import by.itstep.tiknyus.examtask07.view.Printer;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Printer.print("Input number of devices:");
		int count = scanner.nextInt();
		Apartment apartment = DeviceCreator.create(count);

		int powerAll = Calculator.calcTotalPower(apartment);
		int powerPluggedIn = Calculator.calcPluggedInPower(apartment);
		
		
		String sort = Sorting.sortbyName();

		Printer.print(apartment);
		Printer.print("\nTotal power consumption: = " + powerAll 
				+ "\nincluding plugged in: " + powerPluggedIn);
		scanner.close();
		
		Printer.print("\n\n" + sort);

	}

}
