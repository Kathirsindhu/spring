package com.amazon.create.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.create.dao.Createdao;
import com.amazon.create.entity.Createaccount;
import com.amazon.create.entity.Login;

@Service
public class CreateService {
	@Autowired
	Createdao credao;

	public String signupdetails(Createaccount l) {
		return credao.signupdetails(l);
	}

	public Createaccount getaccdetails(int id) {
		return credao.getaccdetails(id);
	}

	public String updatepassword(Createaccount c , int id) {
		Createaccount c1 = credao.getaccdetails(id);
		c.setId(c1.getId());
		c.setName(c1.getName());
		c.setMail(c1.getMail());
		c.setMobile(c1.getMobile());
		return credao.updatePassword(c,id);
	}
}
