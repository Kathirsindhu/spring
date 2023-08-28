package com.bank.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.customer.entity.Customer;
import com.bank.customer.service.CustomerService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@PostMapping(value = "/insert")
	public String enterCustomerDetails(@RequestBody Customer c) {
		return customerService.enterCustomerDetails(c);
	}

	@PostMapping(value = "/insertlist")
	public String enterCustomerDetailsList(@RequestBody List<Customer> c) {
		return customerService.enterCustomerDetailsList(c);
	}
	@GetMapping(value = "/getdetails/{id}")
	public Customer getDetails(@PathVariable int id) {
		return customerService.getDetails(id);
		
	}
	@GetMapping(value = "/getdetailslist")
	public List<Customer> getDetailsList() {
		return customerService.getDetailsList();
	}
	@PutMapping(value = "/updatecustomerdetails/{c}")
	public String updateDetails(@RequestBody Customer c) {
		return customerService.updateDetails(c);
	}
	@DeleteMapping(value = "/deletecustomer/{id}")
	public String deletecustomerdetails(@PathVariable int id) {
		return customerService.deletecustomerdetails(id);
	}
}
