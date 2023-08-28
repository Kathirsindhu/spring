package com.bank.bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bank.bank.entity.Bank;
import com.bank.bank.repository.BankRepository;

@Repository
public class BankDao {
	@Autowired
	BankRepository bankrepo;

	public String insertBankdetails(Bank b) {
		bankrepo.save(b);
		return "bank details saved";
	}

	public String insertBankDetailAsList(List<Bank> b) {
		bankrepo.saveAll(b);
		return "Bank details list saved succesfully";
	}

	public Bank getDetails(int id) {
		return bankrepo.findById(id).get();
	}

	public List<Bank> getDetailsList() {
		return bankrepo.findAll();
	}

	public String updateDetails(Bank b) {
		bankrepo.save(b);
		return "details updated successfully";
	}

	public String deleteDetails(int id) {
		bankrepo.deleteById(id);
		return "details deleted successfully";
	}

}
