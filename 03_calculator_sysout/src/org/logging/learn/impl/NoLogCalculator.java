package org.logging.learn.impl;

import org.logging.learn.Calculator;

public class NoLogCalculator implements Calculator {

	@Override
	public int add(final int x, final int y) {
		return x + y;
	}

	@Override
	public int substract(final int x, final int y) {
		return x - y;
	}
	
}
