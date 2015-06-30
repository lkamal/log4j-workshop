package org.logging.learn.log4j;

import org.logging.learn.Calculator;

public class Main {

	public static void main(String[] args) {
		
		Calculator calculator = new Log4jCalculator();
		
		int x = 6;
		int y = 4;
		
		int addition = calculator.add(x, y);
		System.out.println(x + " + " + y + " = " + addition);
		
		int substraction = calculator.substract(x, y);
		System.out.println(x + " - " + y + " = " + substraction);
		
	}

}
