package com.hello.hello;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GetHello {
	@GetMapping(value = "/getHello")
	public String getHello1() {
		return "hello";
	}

	RestTemplate rest = new RestTemplate();

	@GetMapping(value = "/gethaiviahello")
	public String gethiviahello() {
		String url = "http://localhost:8080/getHai";
		ResponseEntity<String> response = rest.exchange(url, HttpMethod.GET, null, String.class);
		String value = response.getBody();
		return value;
	}

	@GetMapping(value = "/mynamevia")
	public String myName() {
		String url = "http://localhost:8080/myname";
		ResponseEntity<String> res = rest.exchange(url, HttpMethod.GET, null, String.class);
		String v = res.getBody();
		return v;
	}

	@GetMapping(value = "/gethaiviahelloo")
	public String gethiviahellotoday() {
		String url = "http://localhost:8080/getHai";
		String v = rest.getForObject(url, String.class);
		return v;
	}

}
