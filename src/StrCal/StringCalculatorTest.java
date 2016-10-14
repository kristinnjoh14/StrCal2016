package StrCal;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testAdd() {
		assertEquals(StringCalculator.add(), 0);
	}

	@Test
	public void testAddString() {
		assertEquals(StringCalculator.add(""), 0);
		assertEquals(StringCalculator.add("7"), 7);
		assertEquals(StringCalculator.add("1,3"), 4);
		//assertEquals(StringCalculator.add("21474836472147483647,1"), 21474836472147483648);
		//Huh, no clever behind the scenes magic to make 2^31 work, no long cast or anything
		
	}


}
