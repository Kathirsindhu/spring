package com.bank.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bank.bank.dao.BankDao;
import com.bank.bank.entity.Bank;

@Service
public class BankService {
	@Autowired
	BankDao bankDao;

	public String insertBankdetails(Bank b) {
		return bankDao.insertBankdetails(b);
	}

	public String insertBankDetailAsList(List<Bank> b) {
		return bankDao.insertBankDetailAsList(b);
	}

	public Bank getDetails(int id) {
		return bankDao.getDetails(id);
	}

	public List<Bank> getDetailsList() {
		return bankDao.getDetailsList();
	}
	public String updatedetails(Bank b) {
		return bankDao.updateDetails(b);
	}
	public String deleteDetails(int id) {
		return bankDao.deleteDetails(id);
	}
}
