package com.bank.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.bank.customer.dao.CustomerDao;
import com.bank.customer.entity.Customer;

public class CustomerService {
	@Autowired
	CustomerDao customerDao;

	public String enterCustomerDetails(Customer c) {
		return customerDao.enterCustomerDetails(c);
	}

	public String enterCustomerDetailsList(List<Customer> c) {
		return customerDao.enterCustomerDetailsList(c);
	}

	public Customer getDetails(int id) {
		return customerDao.getDetails(id);
	}

	public List<Customer> getDetailsList() {
		return customerDao.getDetailsList();
	}

	public String updateDetails(Customer c) {
		return customerDao.updateDetails(c);
	}

	public String deletecustomerdetails(int id) {
		return customerDao.deletecustomerdetails(id);
	}
}
