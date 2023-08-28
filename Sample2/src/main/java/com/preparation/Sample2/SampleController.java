package com.preparation.Sample2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@Value("${checking.thisvalue}")
	private String a;

	@GetMapping("/get")
	public String gtetThis() {
		return "current environ " + a;
	}
}
