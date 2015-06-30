package org.logging.learn.main;

import org.apache.log4j.Logger;
import org.logging.learn.Calculator;
import org.logging.learn.log4j.Log4jCalculator;

public class Main {

	private static Logger logger = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		Calculator calculator = new Log4jCalculator();
		
		int x = 6;
		int y = 4;
		
		int addition = calculator.add(x, y);
		logger.info(x + " + " + y + " = " + addition);
		
		int substraction = calculator.substract(x, y);
		logger.info(x + " - " + y + " = " + substraction);
		
	}

}
