package by.itstep.tiknyus.javatasks.task03.model.logic;

import java.util.Random;

public class Poker {
	
	public static final int MAX_PLAYERS = 10;
	public static final int MIN_PLAYERS = 2;
	public static final int CARDS_NUMBER = 5;
	public static final int CARDS_RANK = 12;
	public static final int CARDS_SUIT = 4;
	public static String card;
	public static String defaultCard;
	
//	public static int num() {
//		Random random = new Random();	
//		for (int i = 0; i < CARDS_NUMBER - 1; i++) {
//			int deckCards = random.nextInt(CARDS_SUIT);
//			System.out.println(deckCards);
//		}
//		return random.nextInt(CARDS_SUIT);
//	}
	
//	public static String deck(int playersNumber){
//		
//		String error = "Wrong players number";
//		
//		if(playersNumber < MIN_PLAYERS || playersNumber > MAX_PLAYERS) {
//			return error;
//		}
//		
//		Random random = new Random();
//		
//		for (int i = 0; i < CARDS_NUMBER; i++) {
//			int deckCards = random.nextInt(CARDS_SUIT);
//		}
//		
	public static String deck(){
		defaultCard = "clubs";
		Random random = new Random();
		int deckCards = random.nextInt(CARDS_SUIT);
		
		switch (deckCards) {
		 case 2: card = "diamonds"; break;
		 case 3: card = "hearts"; break;
		 case 4: card = "spades"; break;
		}
		return defaultCard;
			 
	}			
}