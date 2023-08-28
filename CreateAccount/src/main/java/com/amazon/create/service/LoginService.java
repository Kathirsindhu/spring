package com.amazon.create.service;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.create.dao.Logindao;
import com.amazon.create.entity.Login;
import com.amazon.create.exception.LoginException;

@Service
public class LoginService {
	@Autowired
	Logindao logdao;

	public String logindetails(String mail, String password) throws LoginException, Exception {
		List<Login> kk = logdao.getlist();
		Stream<Login> ll = kk.stream().filter(x -> x.getMail().equals(mail) && x.getPassword().equals(kk));
		if (ll.empty()) {
			throw new LoginException("give mail id and password is wrong");
		}
		return "Login successs";
	}

}
