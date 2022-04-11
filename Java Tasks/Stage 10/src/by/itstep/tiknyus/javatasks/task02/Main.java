package by.itstep.tiknyus.javatasks.task02;

import java.util.Scanner;

import by.itstep.tiknyus.javatasks.Printer;
import by.itstep.tiknyus.javatasks.task02.DigitsSequence;

public class Main {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
		do{
			Printer.printer("Input your number: ");
			DigitsSequence.number = scanner.nextInt();
			if (DigitsSequence.number < 10 && DigitsSequence.number >-10) {
				Printer.printer("Please enter a two-digit number! \n");
			}		
		} while (DigitsSequence.number < 10 && DigitsSequence.number >-10);

		String result = DigitsSequence.checkDigitsSequenceDecreasing() ? "Sequence of digits decreasing"
				: "No sequence";

//		Printer.printer(result);
		Printer.printer(DigitsSequence.checkDigitsSequenceIncreasing());
		scanner.close();

	}

}
