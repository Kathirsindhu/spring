package com.preparation.junit;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertSame;

import org.junit.Test;

public class Reversestringunit {
	Reversestring r = new Reversestring();

	@Test
	public void test() {
		assertEquals(r.getReverse("madam"), "madam");
	}
}
