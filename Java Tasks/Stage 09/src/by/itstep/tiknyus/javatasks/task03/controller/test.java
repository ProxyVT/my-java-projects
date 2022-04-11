package by.itstep.tiknyus.javatasks.task03.controller;

import java.util.Random;

public class test {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		
		for (int i = 0; i < 3; i++) {
			int a = random.nextInt(5);
			for (int c = 0; c < a; c++) {
				System.out.println(c);
				}
			}
		}

	}

