package StrCal;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testAdd() {
		assertEquals(StringCalculator.add(), 0);
	}

	@Test
	public void testAddString() throws Exception {
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
	@Test
	public void testOver9000() throws Exception {
		assertEquals(StringCalculator.add("1,1000"),1001);
		assertEquals(StringCalculator.add("1,2,1001,9001,3"),6);
	}
	@Test(expected = Exception.class)
	public void testOneNegative() throws Exception {
		StringCalculator.add("-1");
	}
	@Test(expected = Exception.class)
	public void testTwoNegatives() throws Exception {
		StringCalculator.add("-1,-14");
	}
	@Test(expected = Exception.class)
	public void testMoreNegatives() throws Exception {
		StringCalculator.add("-1,-6,-17,-53");
	}
	@Test
	public void testNewDelimiter() throws Exception {
		assertEquals(StringCalculator.add("//d\n1d2d3"),6);
		assertEquals(StringCalculator.add("//;\n1,2\n3;4"),10);
	}
	public void testBigDelimiter() throws Exception {
		assertEquals(StringCalculator.add("//delim\n1delim2delim3"),6);
	}

}
