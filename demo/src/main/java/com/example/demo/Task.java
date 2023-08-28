package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task {
	@GetMapping(value = "/evenprint/{a}")
	public List<Integer> even(@PathVariable int a) {
		List<Integer> kk = new ArrayList<>();
		for (int i = 0; i < a; i++) {
			if (i % 2 == 0) {
				kk.add(i);
			}
		}
		return kk;
	}

	@GetMapping(value = "/accessCheck")
	public String getAccess(@RequestParam String username, @RequestParam String password) {
		if (username.equals("mark") && password.equals("antony")) {
			return "access grand";
		} else {
			return "access denied";
		}
	}

	@GetMapping(value = "/setcar")
	public Car getCar(@RequestBody Car c1) {
		return c1;
	}

	@GetMapping(value = "/list")
	public List<Car> caar(@RequestBody List<Car> cars) {
		return cars.stream().filter((x) -> x.getPrice() > 20000).collect(Collectors.toList());
	}

	@GetMapping(value = "/ccm")
	public List<Car> map(@RequestBody List<Car> maap) {
		List<Car> kkk = maap.stream().filter((x) -> x.getCc() > 200).collect(Collectors.toList());
		kkk.forEach((x) -> {
			int a = x.getPrice() + x.getPrice() * 5 / 100;
			x.setPrice(a);

		});
		return kkk;

	}
}
