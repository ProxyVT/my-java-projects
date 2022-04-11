package by.itstep.tiknyus.javatasks.task01.controller;

import by.itstep.tiknyus.javatasks.task01.model.logic.CakeSimulator;
import by.itstep.tiknyus.javatasks.view.Printer;

public class Main {

	public static void main(String[] args) {
		System.out.print("Now you get your cake :)\n ");		
		
		String surprise = CakeSimulator.randomSurprise();
		String result = String.format("\nSurpirse!!!\n%s", surprise);
		Printer.print(result);
		
	}

}
