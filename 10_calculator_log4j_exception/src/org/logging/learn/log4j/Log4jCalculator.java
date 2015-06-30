package org.logging.learn.log4j;

import org.apache.log4j.Logger;
import org.logging.learn.Calculator;

public class Log4jCalculator implements Calculator {

	private static Logger logger = Logger.getLogger(Log4jCalculator.class);
	
	@Override
	public int add(final int x, final int y) {
		logger.debug("add invoked for : " + x + " + " + y);
		int result = x + y;
		logger.debug("add method result: " + result);
		return result;
	}

	@Override
	public int substract(final int x, final int y) {
		logger.debug("substract invoked for : " + x + " - " + y);
		int result = x - y;
		logger.debug("substract method result: " + result);
		return result;
	}

	@Override
	public int divide(final int x, final int y) {
		logger.debug("divide invoked for : " + x + " / " + y);
		
		if (y == 0) {
			throw new ArithmeticException("division by 0 is not allowed");
		}
		
		int result = x/y;
		logger.debug("substract method result: " + result);
		return result;
	}
	
}
