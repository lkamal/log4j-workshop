package org.logging.learn.log4j;

import org.apache.log4j.Logger;
import org.logging.learn.Calculator;

public class Log4jCalculator implements Calculator {

	private static Logger logger = Logger.getLogger(Log4jCalculator.class);
	
	@Override
	public int add(final int x, final int y) {
		logger.info("add invoked for : " + x + " + " + y);
		int result = x + y;
		logger.info("add method result: " + result);
		return result;
	}

	@Override
	public int substract(final int x, final int y) {
		logger.info("substract invoked for : " + x + " - " + y);
		int result = x - y;
		logger.info("substract method result: " + result);
		return result;
	}
	
}
