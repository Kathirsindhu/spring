package com.preparation.junit;

public class Reversestring {
	public String getReverse(String a) {
		// char[] c = a.toCharArray();
		String b = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		return b;
	}
}
