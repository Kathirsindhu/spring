package com.example.demo;

public class UseSamplee {
	public static void main(String[] args) {
		Samplee s = (a, b) -> {
			if (a > b) {
				return a;
			} else {
				return b;
			}
		};
		s.findHigh(10, 15);
	}
}
