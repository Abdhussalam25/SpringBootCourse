package com.training.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.training.ArithMeticCalculator;

class ArithmeticCalculatorTest {

	@Test
	void testAddNumbers() {
		ArithMeticCalculator calc = new ArithMeticCalculator();
		
		int expected = 25;
		int actual = calc.addNumbers(12, 13);
		assertEquals(expected,actual);
		
	}
	
	@Test
	void testSubNumber() {
ArithMeticCalculator calc = new ArithMeticCalculator();
	
		int expected = -1;
		int actual = calc.subNumbers(12, 13);
		assertEquals(expected,actual,"Expected value is 1 but value is -1");
		
	}
	
}
