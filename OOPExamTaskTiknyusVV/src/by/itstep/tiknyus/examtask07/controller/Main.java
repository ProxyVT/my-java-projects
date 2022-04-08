package by.itstep.tiknyus.examtask07.controller;

import java.util.Collections;
import java.util.Scanner;

import by.itstep.tiknyus.examtask07.model.entity.Apartment;
import by.itstep.tiknyus.examtask07.model.entity.abstracts.Device;
import by.itstep.tiknyus.examtask07.model.logic.Calculator;
import by.itstep.tiknyus.examtask07.model.logic.Searcher;
import by.itstep.tiknyus.examtask07.model.logic.Sorter;
import by.itstep.tiknyus.examtask07.util.DeviceCreator;
import by.itstep.tiknyus.examtask07.util.Switcher;
import by.itstep.tiknyus.examtask07.view.Printer;

public class Main {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
		Printer.print("Welcome to programme 'House Equipments'. Follow instructions below: \n\n" 
		+ "Chose your action: "
				+ "\n1. Input number of devices"
				+ "\n2. Exit programm\n");
		
		Switcher.switcherFirstStep(null);
		
//		Printer.print("Input first nubmer");
		// Devices shown
//		int count = scanner.nextInt();
//		Apartment apartment = DeviceCreator.create(count);
//		Printer.print(apartment);
//		
//		Printer.print("Chose your next move:" + 
//		"\n 2: Calculate total power: ");
//		
//		Switcher.calculatorSwitching(apartment);
//		Printer.print("\n Total power consumption: " + apartment);
//		Printer.print(apartment);
//		int powerAll = Calculator.calcTotalPower(apartment);
//		int powerPluggedIn = Calculator.calcPluggedInPower(apartment);
//
//		Printer.print("\nTotal power consumption: = " + powerAll + "\nincluding plugged in: " + powerPluggedIn);
//		scanner.close();
//		
//		Printer.print("\n\nSorting asc: \n");
//        Sorter.sortByNameAsc(apartment);
//        Printer.print(apartment);
//        
//        Printer.print("\nSorting desc: \n");
//        Sorter.sortByNameDesc(apartment);
//        Printer.print(apartment);
//        
//        Printer.print("\nSorting: \n");
//        Searcher.searchName(apartment);;
//        Printer.print(apartment);
        
//        Printer.print("\nMax price: \n");
//		Device maxPrice = new Device();
//		maxPrice = Calculator.getMaxPriceDevice(apartment);
//        Printer.print("\n\nDevice with max price = \n" + maxPrice);

	}

}
