package com.preparation.onesoftproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnesoftController {
	@GetMapping("/students")
	public String student() {
		return "students";
	}

	@GetMapping("/trainers")
	public String trainer() {
		return "trainers";

	}

	@GetMapping("/manager")
	public String managers() {
		return "manager";
	}
}
