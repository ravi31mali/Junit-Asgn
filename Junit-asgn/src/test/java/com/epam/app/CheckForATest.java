package com.epam.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckForATest {
	CheckForA checkForA;

	@Before
	public void init()
	{
		checkForA = new CheckForA();
	}
	@Test
	public void testRemoveA() {
		assertEquals("test fails for ABCD",checkForA.removeA("ABCD"),"BCD");
		assertEquals("test fails for AACD",checkForA.removeA("AACD"),"CD");
		assertEquals("test fails for BACD",checkForA.removeA("BACD"),"BCD");
		assertEquals("test fails for BBAA",checkForA.removeA("BBAA"),"BBAA");
		assertEquals("test fails for AABAA",checkForA.removeA("AABAA"),"BAA");
	}

}
