package com.amazon.create.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.amazon.create.entity.Createaccount;
import com.amazon.create.entity.Login;
import com.amazon.create.service.CreateService;
import com.tech.Vehicle.entity.Bike;

@RestController
@RequestMapping(value = "/create")
public class CreateController {
	@Autowired
	CreateService creser;

	@PostMapping(value = "/signup")
	public String signupdetails(@RequestBody Createaccount l) {
		return creser.signupdetails(l);
	}

	@GetMapping(value = "/getmyaccdetail/{id}")
	public Createaccount getaccdetails(@PathVariable int id) {
		return creser.getaccdetails(id);
	}

	@PutMapping(value = "/updateaccount/{id}")
	public String updatepassword(@RequestBody Createaccount c, @PathVariable int id) {
		return creser.updatepassword(c, id);
	}

	RestTemplate r = new RestTemplate();

	@GetMapping(value = "/getbikedetailsviacreate")
	public List<Bike> getFullTable() {
		String url = "http://localhost:8080/bike/getfulltable";
		ResponseEntity<List<Bike>> re = r.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Bike>>() {

				});
		List<Bike> value = re.getBody();
		value.stream().forEach(x -> {
			int a = x.getPrice() + (x.getPrice() * 5 / 100);
			x.setPrice(a);
		});
		return value;

	}

}
