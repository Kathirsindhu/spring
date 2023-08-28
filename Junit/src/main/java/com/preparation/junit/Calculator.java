package com.preparation.junit;

public class Calculator {
	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public void sub() {
		int a = 10;
		int b = 2;
		int c = a - b;
		System.out.println(c);
	}

	public int multiple(int a, int b) {
		return a * b;
	}

	public int division() {
		int a = 10;
		int b = 2;
		return a / b;
	}
}
