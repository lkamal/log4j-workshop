package org.logging.learn.use;

import org.logging.learn.Calculator;
import org.logging.learn.impl.*;

public class Main {

	public static void main(String[] args) {
		
		Calculator calculator;
		
//		calculator = new NoLogCalculator();
		calculator = new SysoutLoggingCalculator();
		
		int x = 6;
		int y = 4;
		
		int addition = calculator.add(y, x);
		System.out.println(x + " + " + y + " = " + addition);
		
		System.out.println();		
		
		int substraction = calculator.substract(y, x);
		System.out.println(x + " - " + y + " = " + substraction);
		
	}

}
