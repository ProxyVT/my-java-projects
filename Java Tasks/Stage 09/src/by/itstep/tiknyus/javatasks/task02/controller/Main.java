package by.itstep.tiknyus.javatasks.task02.controller;

import by.itstep.tiknyus.javatasks.task02.model.logic.Dice;
import by.itstep.tiknyus.javatasks.view.Printer;

public class Main {

	public static void main(String[] args) {
		System.out.print("Your results in dice game: ");

		int diceOne = Dice.firstDice();
		int diceTwo = Dice.secondDice();
		int score = diceOne + diceTwo;
		String result = String.format("\nEdge of the first dice: %d" 
									+ "\nEdge of the second dice: %d" 
									+ "\nScore: %d", diceOne, diceTwo, score);
		Printer.print(result);

	}

}