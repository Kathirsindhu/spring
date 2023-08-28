package com.hello.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetHello {
	@GetMapping("value = /gethello")
	public String getHello() {
		return "hello";
	}

}
