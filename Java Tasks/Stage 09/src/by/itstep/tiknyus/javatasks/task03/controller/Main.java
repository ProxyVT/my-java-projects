package by.itstep.tiknyus.javatasks.task03.controller;

import java.util.Scanner;

import by.itstep.tiknyus.javatasks.task03.model.logic.Poker;
import by.itstep.tiknyus.javatasks.view.Printer;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Printer.print("Input number of players: \n");
		Poker.numberOfPlayers = scanner.nextInt();
		Poker.errorCheck();

		Printer.print("Player's cards: \n");
		Poker.playersCards();

		Printer.print("Cards on the table: \n");
		Poker.rankTable();

		scanner.close();

	}

}