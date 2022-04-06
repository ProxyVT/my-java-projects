package by.itstep.tiknyus.javatasks.task03.controller;

import java.util.Scanner;

import by.itstep.tiknyus.javatasks.task03.model.logic.Poker;
import by.itstep.tiknyus.javatasks.view.Printer;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.print("Input number of players: ");
		
//		int playersNumber = scanner.nextInt();

		String b = Poker.deck();
		String result = String.format("%s", b);
		Printer.print(result);
		
		scanner.close();

	}

}