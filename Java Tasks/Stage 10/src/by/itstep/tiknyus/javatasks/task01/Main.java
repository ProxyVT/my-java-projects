package by.itstep.tiknyus.javatasks.task01;

import java.util.Scanner;

import by.itstep.tiknyus.javatasks.Printer;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		do{
			Printer.printer("Input your number: ");
			SameDigits.number = scanner.nextInt();
			if (SameDigits.number < 10 && SameDigits.number >-10) {
				Printer.printer("Please enter a two-digit number! \n");
			}		
		} while (SameDigits.number < 10 && SameDigits.number >-10);

		String result = SameDigits.checkSameDigits() ? "Digits in the number are the same"
				: "Digits in the number are different";

		Printer.printer(result);
		scanner.close();

	}

}
