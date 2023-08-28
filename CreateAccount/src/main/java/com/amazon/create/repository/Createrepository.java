package com.amazon.create.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amazon.create.entity.Createaccount;
import com.amazon.create.entity.Login;

public interface Createrepository extends JpaRepository<Createaccount, Integer> {

}
