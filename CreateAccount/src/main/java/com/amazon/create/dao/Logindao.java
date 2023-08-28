package com.amazon.create.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazon.create.entity.Login;
import com.amazon.create.repository.Loginrepository;

@Repository
public class Logindao {
	@Autowired
	Loginrepository logrepo;
	public List<Login> getlist() {
		return logrepo.findAll();
	}
	public String logindetails(String mail,String password) {
		logrepo.logindetails(mail, password);
		return "login success";
	}
	
}
