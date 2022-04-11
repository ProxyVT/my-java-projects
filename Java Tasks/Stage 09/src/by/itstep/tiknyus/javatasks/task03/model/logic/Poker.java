package by.itstep.tiknyus.javatasks.task03.model.logic;

import java.util.Random;

import by.itstep.tiknyus.javatasks.view.Printer;

public class Poker {

	public static final int MAX_PLAYERS = 10;
	public static final int MIN_PLAYERS = 2;
	public static final int CARDS_PLAYERS_NUMBER = 2;
	public static final int CARDS_TABLE_NUMBER = 5;
	public static final int CARDS_RANK = 13;
	public static final int CARDS_SUIT = 4;
	public static int randomCard;
	public static int numberOfPlayers;
	public static String suit = " clubs\n";
	public static String value = "Two";
	public static String errorMsg = "Wrong player number!";

	private static Random random;

	static {
		random = new Random();
	}

	public static String errorCheck() {
		if (numberOfPlayers < MIN_PLAYERS || numberOfPlayers > MAX_PLAYERS) {
			Printer.print(errorMsg);
			System.exit(0);
		}
		return errorMsg;
	}

	public static String suitSwitcher() {

		randomCard = random.nextInt(CARDS_SUIT);
		switch (randomCard) {
		case 1:
			suit = " diamonds\n";
			break;
		case 2:
			suit = " hearts\n";
			break;
		case 3:
			suit = " spades\n";
			break;
		}

		return suit;

	}

	public static void suitTable() {
		for (int i = 0; i < CARDS_PLAYERS_NUMBER; i++) {
			Printer.print(Poker.nameString());
		}
	}

	public static void playersCards() {
		for (int i = 0; i < numberOfPlayers; i++) {
			Poker.suitTable();
			Printer.print("\n");
		}
	}

	public static String rankSwitcher() {

		randomCard = random.nextInt(CARDS_RANK);
		switch (randomCard) {
		case 1:
			value = "Three";
			break;
		case 2:
			value = "Four";
			break;
		case 3:
			value = "Five";
			break;
		case 4:
			value = "Six";
			break;
		case 5:
			value = "Seven";
			break;
		case 6:
			value = "Eight";
			break;
		case 7:
			value = "Nine";
			break;
		case 8:
			value = "Ten";
			break;
		case 9:
			value = "Jack";
			break;
		case 10:
			value = "Queen";
			break;
		case 11:
			value = "King";
			break;
		case 12:
			value = "Ace";
			break;
		}

		return value;

	}

	public static void rankTable() {
		for (int i = 0; i < CARDS_TABLE_NUMBER; i++) {
			Printer.print(Poker.nameString());
		}
	}

	public static String nameString() {
		return Poker.rankSwitcher() + Poker.suitSwitcher();
	}

}
