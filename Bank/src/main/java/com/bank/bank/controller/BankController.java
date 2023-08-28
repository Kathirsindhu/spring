package com.bank.bank.controller;

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

import com.bank.bank.entity.Bank;
import com.bank.bank.service.BankService;

@RestController
@RequestMapping(value = "/bank")
public class BankController {
	@Autowired
	BankService bankService;

	@PostMapping(value = "/insert")
	public String insertBankdetails(@RequestBody Bank b) {
		return bankService.insertBankdetails(b);
	}

	@PostMapping(value = "/insertlist")
	public String insertBankDetailAsList(@RequestBody List<Bank> b) {
		return bankService.insertBankDetailAsList(b);
	}

	@GetMapping(value = "/getdetails/{id}")
	public Bank getDetails(@PathVariable int id) {
		return bankService.getDetails(id);
	}

	@GetMapping(value = "/getdetaillist")
	public List<Bank> getDetailsList() {
		return bankService.getDetailsList();
	}

	@PutMapping(value = "/updatebankdetails/{b}")
	public String updateDetails(@RequestBody Bank b) {
		return updateDetails(b);
	}

	@DeleteMapping(value = "/deletedetails/{id}")
	public String deleteDetails(@PathVariable int id) {
		return bankService.deleteDetails(id);
	}

}
