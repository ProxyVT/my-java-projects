package by.itstep.tiknyus.examtask07.util;

import java.util.Scanner;

import by.itstep.tiknyus.examtask07.model.entity.Apartment;
import by.itstep.tiknyus.examtask07.model.logic.Calculator;
import by.itstep.tiknyus.examtask07.view.Printer;

public class Switcher {

	private static Scanner scanner;

	static {
		scanner = new Scanner(System.in);
	}

	public static int index = scanner.nextInt();

	public static void exitProgramm() {
		System.exit(0);
	}

	public static void switcherFirstStep(Apartment apartment) {
//		boolean sucess = false;
		
//		do{
			switch (index) {
		case 1:
			Printer.print("Input number of devices: ");
			int count = scanner.nextInt();
			apartment = DeviceCreator.create(count);
			Printer.print(apartment);
			break;
		case 2:
			exitProgramm();		
		default:
			Printer.print(Data.ERROR_MESSAGE);
//			switcherFirstStep(apartment);
//			return;
			break;
		}
//		} while (sucess);
	}

	public static void switcherSecondStep(Apartment apartment) {
		switch (index) {
		case 1:
			switcherFirstStep(apartment);
			Printer.print(apartment);
			break;
		default:
			exitProgramm();
			break;
		}
	}

	public static void calculatorSwitching(Apartment apartment) {

		switch (index) {
		case 1:
			int powerAll = Calculator.calcTotalPower(apartment);
			int powerPluggedIn = Calculator.calcPluggedInPower(apartment);
			Printer.print("\nTotal power consumption: = " + powerAll + "\nincluding plugged in: " + powerPluggedIn);
			scanner.close();
			break;

		default:
//			System.out.println("Wrong value");
			System.exit(0);
			break;
		}

	}
}
