package by.itstep.tiknyus.javatasks.task02.model.logic;

import java.util.Random;

public class Dice {
	
	public static final int FINAL_EDGE = 6;
	
	public static final int FIRST_EDGE = 1;
	public static final int SECOND_EDGE = 2;
	public static final int THIRD_EDGE = 3;
	public static final int FOURTH_EDGE = 4;
	public static final int FIFTH_EDGE = 5;
	
	public static int firstDice() {
		
		Random random = new Random();
		
		int number = random.nextInt(FINAL_EDGE);
		int diceEdge = FINAL_EDGE;
		
		switch (number) {
		 case 1: diceEdge = FIRST_EDGE; break;
		 case 2: diceEdge = SECOND_EDGE; break;
		 case 3: diceEdge = THIRD_EDGE; break;
		 case 4: diceEdge = FOURTH_EDGE; break;
		 case 5: diceEdge = FIFTH_EDGE; break;
		 }
		
		return diceEdge;
	}
	
	public static int secondDice() {
		
		Random random = new Random();
		
		int number = random.nextInt(FINAL_EDGE);
		int diceEdge = FINAL_EDGE;
		
		switch (number) {
		 case 1: diceEdge = FIRST_EDGE; break;
		 case 2: diceEdge = SECOND_EDGE; break;
		 case 3: diceEdge = THIRD_EDGE; break;
		 case 4: diceEdge = FOURTH_EDGE; break;
		 case 5: diceEdge = FIFTH_EDGE; break;
		 }
		
		return diceEdge;
	}

}