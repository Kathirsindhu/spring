package com.amazon.create.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.create.exception.LoginException;
import com.amazon.create.service.LoginService;

@RestController
@RequestMapping(value = "/login")
public class LoginController {
	@Autowired
	LoginService logser;

	@GetMapping(value = "/emailpassword/{mail}/{password}")
	public String logindetails(@PathVariable String mail, @PathVariable String password)
			throws LoginException, Exception {
		return logser.logindetails(mail, password);
	}

}
