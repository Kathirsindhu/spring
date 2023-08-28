package com.amazon.create.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.amazon.create.entity.Login;

public interface Loginrepository extends JpaRepository<Login, Integer> {
	@Query(value = "select * from amazon_login where mail like %?%;"
			+ "select * from amazon_login where like %?%", nativeQuery = true)
	public List<Login> logindetails(String mail, String password);

}
