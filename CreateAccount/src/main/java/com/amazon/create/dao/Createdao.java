package com.amazon.create.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazon.create.entity.Createaccount;
import com.amazon.create.entity.Login;
import com.amazon.create.repository.Createrepository;

@Repository
public class Createdao {
	@Autowired
	Createrepository crerepo;

	public String signupdetails(Createaccount l) {
		crerepo.save(l);
		return "list saved";
	}

	public Createaccount getaccdetails(int id) {
		return crerepo.findById(id).get();

	}

	public String updatePassword(Createaccount c,int id) {
		crerepo.save(c);
		return "Password updated";
	}
}
