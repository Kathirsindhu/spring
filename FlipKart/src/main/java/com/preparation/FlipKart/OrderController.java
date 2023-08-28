package com.preparation.FlipKart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@Autowired
	OrderService ordser;

	@PostMapping("/insert")
	public String insertObject(@RequestBody OrderEntity o) {
		return ordser.insertObject(o);
	}

	@GetMapping("/get")
	public List<String> get() {
		return ordser.get();
	}
}
