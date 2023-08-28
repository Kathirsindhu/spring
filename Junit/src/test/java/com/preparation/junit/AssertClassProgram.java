package com.preparation.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertClassProgram {
	@Test
	public void testEquals() {
		assertEquals(5, 5);
	}

	@Test
	public void testNull() {
		assertNull("nisha", null);
	}

	@Test
	public void testSame() {
		assertSame("nisha", "nisha");
	}

	@Test
	public void testArray() {
		int[] a = { 5, 3, 10 };
		int[] b = { 5, 3, 10 };

		assertArrayEquals(a, b);
	}

	@Test
	public void testNotEquals() {
		assertNotEquals(5, 4);
	}

	@Test
	public void testNotNull() {
		assertNotNull("kathir", "karthi");
	}

	@Test
	public void testNotSame() {
		assertNotSame("kathir", "vetri");
	}

	@Test
	public void testTrue() {
		assertTrue(10 < 20);
	}

	@Test
	public void testFalse() {
		assertFalse(10 == 20);
	}

}
