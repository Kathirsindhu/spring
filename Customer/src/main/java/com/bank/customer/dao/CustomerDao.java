package com.bank.customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.bank.customer.entity.Customer;
import com.bank.customer.repository.CustomerRepository;

public class CustomerDao {
	@Autowired
	CustomerRepository customerrepo;

	public String enterCustomerDetails(Customer c) {
		customerrepo.save(c);
		return "Customer details saved";
	}

	public String enterCustomerDetailsList(List<Customer> c) {
		customerrepo.saveAll(c);
		return "Custumer details list saved";
	}

	public Customer getDetails(int id) {
		return customerrepo.findById(id).get();
	}

	public List<Customer> getDetailsList() {
		return customerrepo.findAll();
	}

	public String updateDetails(Customer c) {
		customerrepo.save(c);
		return "customer details updated successfully";
	}

	public String deletecustomerdetails(int id) {
		customerrepo.deleteById(id);
		return "Customer details deleted successfully";
	}
}
