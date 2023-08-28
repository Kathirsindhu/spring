package com.bank.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.bank.entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {

}
