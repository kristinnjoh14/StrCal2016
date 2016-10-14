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
		assertEquals(StringCalculator.add("1,2,3,4"), 10);
		assertEquals(StringCalculator.add("1,2,3,4,5"), 15);
		assertEquals(StringCalculator.add("3,7,6,4,1,9,2,8,5,5"), 50);
		assertEquals(StringCalculator.add("32,68"), 100);
		assertEquals(StringCalculator.add("100"), 100);
		assertEquals(StringCalculator.add("123,234,345,456,567"),1725);
		assertEquals(StringCalculator.add("123,234\n345,456\n567"),1725);
		assertEquals(StringCalculator.add("1\n2\n3"),6);
		//assertEquals(StringCalculator.add("21474836472147483647,1"), 21474836472147483648);
		//Huh, no clever behind the scenes magic to make 2^31 work, no long cast or anything
	}


}
