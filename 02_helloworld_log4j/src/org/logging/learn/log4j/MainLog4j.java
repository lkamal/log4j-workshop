package org.logging.learn.log4j;

import org.apache.log4j.Logger;

public class MainLog4j {

	// static or not?
	private static Logger logger = Logger.getLogger(MainLog4j.class);
	
	public static void main(final String[] args) {
		
		logger.info("Hello World!!!");
		logger.info("Learn logging");
		logger.info("With Kamal ");
		
	}

}