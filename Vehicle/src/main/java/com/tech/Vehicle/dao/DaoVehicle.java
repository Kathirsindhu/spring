package com.tech.Vehicle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.tech.Vehicle.entity.Vehicle;
import com.tech.Vehicle.repository.RepositoryVehicle;

@RestController
public class DaoVehicle {
	@Autowired
	RepositoryVehicle repoveh;

	public String addList(Vehicle v) {
		repoveh.save(v);
		return "saved success";
	}

	public Vehicle getList(int id) {
		return repoveh.findById(id).get();

	}

	public String listAll(List<Vehicle> v) {
		repoveh.saveAll(v);
		return "list saved";
	}

	public String delete(int id) {
		repoveh.deleteById(id);
		return "deleted successfully";
	}

	public String update(Vehicle v) {
		repoveh.save(v);
		return "updates success";
	}

	public List<Vehicle> getall() {
		return repoveh.findAll();
	}

}
