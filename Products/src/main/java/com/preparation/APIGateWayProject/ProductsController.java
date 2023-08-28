package com.preparation.APIGateWayProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductsController {
	@Autowired
	RestTemplate rest;

	@GetMapping("/getmobile")
	public String getMobile() {
		String url = "http://ProductDetailsApI/getmobiledetails";
		String res = rest.getForObject(url, String.class);
		return res;
	}
}
