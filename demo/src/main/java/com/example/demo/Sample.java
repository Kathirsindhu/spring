package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin")
public class Sample {
	@GetMapping(value = "/setHi")
	public String sethello() {
		return "Helloworl";
	}

	@GetMapping(value = "/myname")
	public String myname() {
		return "Kathiravan";
	}

	@GetMapping(value = "/total/{a}/{b}")
	public int add(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}

	@GetMapping(value = "/odd/{a}")
	public String oddeven(@PathVariable int a) {
		if (a % 2 == 0) {
			return "Even number";
		} else {
			return "odd number";
		}
	}

	@GetMapping(value = "/square/{a}")
	public int square(@PathVariable int a) {
		return a * a;
	}

	@GetMapping(value = "/polindrome/{a}")
	public String palin(@PathVariable String a) {
		char[] c = a.toCharArray();
		String b = "";
		for (int i = c.length - 1; i >= 0; i--) {
			b = b + c[i];
		}
		if (b.equals(b)) {
			return " Given word is palindrome";
		} else {
			return " given word is not palindrome";
		}
	}

	@GetMapping(value = "/prime/{a}")
	public String prime(@PathVariable int a) {
		boolean b = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				b = false;
			}
		}
		if (b == true) {
			return "its a prime number";
		} else {
			return "its noy a prime number";
		}
	}

	@GetMapping(value = "/squarevalue/{a}")
	public String sq(@PathVariable int a) {
		int b = 0;
		boolean c = false;
		for (int i = 0; i < a; i++) {
			if ((i * i) == a) {
				b = i;
				c = true;
			}
		}
		if (c == true) {
			return a + " is a square of " + b;
		} else {
			return "its not a square value";
		}
	}

}
