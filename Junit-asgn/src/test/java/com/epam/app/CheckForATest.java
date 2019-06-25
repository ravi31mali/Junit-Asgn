package com.epam.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CheckForATest {
	CheckForA checkForA;

	@BeforeEach
	public void init()
	{
		checkForA = new CheckForA();
	}
	@Test
	public void testRemoveA() {
		assertEquals("BCD",checkForA.removeA("ABCD"));
		assertEquals("CD",checkForA.removeA("AACD"));
		assertEquals("BCD",checkForA.removeA("BACD"));
		assertEquals("BBAA",checkForA.removeA("BBAA"));
		assertEquals("BAA",checkForA.removeA("AABAA"));
	}

}
