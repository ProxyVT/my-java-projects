package by.itstep.tiknyus.examtask07.model.logic;

import java.util.ArrayList;
import java.util.Arrays;

import by.itstep.tiknyus.examtask07.util.Data;

public class Sorting {
	
	public static String sortbyName(){
		
//		ArrayList<Data> cats = new ArrayList<Data>();
//		cats.add(new Cat("Бегемот"));
		String[] array = Data.colour;
		String lol = Arrays.toString(array);
		String alph = Arrays.sort(String[] array);
		return lol;
	}

}
