package org.logging.learn.impl;

import org.logging.learn.Calculator;

public class SysoutLoggingCalculator implements Calculator {

	@Override
	public int add(final int x, final int y) {
		System.out.println("add invoked for : " + x + " + " + y);
		int result = x + y;
		System.out.println("add method result: " + result);
		return result;
	}

	@Override
	public int substract(final int x, final int y) {
		System.out.println("substract invoked for : " + x + " - " + y);
		int result = x - y;
		System.out.println("substract method result: " + result);
		return result;
	}
	
}
