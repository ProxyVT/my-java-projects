package by.itstep.tiknyus.javatasks.task01.model.logic;

import java.util.Random;

public class CakeSimulator {

	public static final int SURPRISE_NUMBER = 7;

	public static final String FIRST_SURPRISE = "Four free hours of whirlpool";
	public static final String SECOND_SURPRISE = "Everything is free for you";
	public static final String THIRD_SURPRISE = "Free drink for you";
	public static final String FOURTH_SURPRISE = "You have already passed the exam";
	public static final String FIFTH_SURPRISE = "Coupon for a free car wash";
	public static final String SIXTH_SURPRISE = "Two movie tickets";
	public static final String SEVENTH_SURPRISE = "One more cake for you";
	

	public static String randomSurprise() {

		Random random = new Random();

		int number = random.nextInt(SURPRISE_NUMBER);
		
		String surprise = SEVENTH_SURPRISE;

		switch (number) {
		case 1: surprise = FIRST_SURPRISE;
		case 2: surprise = SECOND_SURPRISE;
		case 3: surprise = THIRD_SURPRISE;
		case 4: surprise = FOURTH_SURPRISE;
		case 5: surprise = FIFTH_SURPRISE;
		case 6: surprise = SIXTH_SURPRISE;
		}
		
		return surprise;
	}
	
}
