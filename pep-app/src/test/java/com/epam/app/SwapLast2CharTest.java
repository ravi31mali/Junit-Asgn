package com.epam.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.junit.Test;

public class SwapLast2CharTest {
	SwapLast2Char sl2c;
	@BeforeEach
	public void setUp()
	{
		 sl2c = new SwapLast2Char();
	}

	@Test
	public void test2char() {
		assertEquals("BA",sl2c.swap("AB"));
	}
	
	@Test
	public void test4char() {
		assertEquals("ABDC",sl2c.swap("ABCD"));
	}
	
	@Test
	public void testNchar() {
		
		assertEquals("ABCDEFGJH",sl2c.swap("ABCDEFGHJ"));
	}
	
	@Test
	public void test1char() {
		
		assertEquals("A",sl2c.swap("A"));
	}
	
	@Test
	public void test0char() {
		
		assertEquals("",sl2c.swap(""));
	}
	
}
