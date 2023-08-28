package com.preparation.APIGateWayProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductDetailsController {

	@GetMapping("/getmobiledetails")
	public String getMobileDetails() {
		return "getmobiledetails";
	}
}
