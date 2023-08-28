package com.preparation.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	Calculator c = new Calculator();

	@Before
	public void print() {
		System.out.println("hello");
	}

	@Test
	public void testAdd() {
		c.add(10, 20);

	}

	@Test
	public void testsub() {
		c.sub();
	}

	@Test
	public void testMul() {
		System.out.println(c.multiple(10, 20));
	}

	@Test
	public void testDivi() {
		System.out.println(c.division());
	}

	@After
	public void printThis() {
		System.out.println("Bye");
	}
}
