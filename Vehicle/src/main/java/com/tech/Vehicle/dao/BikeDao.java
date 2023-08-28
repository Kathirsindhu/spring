package com.tech.Vehicle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.Vehicle.entity.Bike;
import com.tech.Vehicle.repository.BikeRepository;

@Repository
public class BikeDao {
	@Autowired
	BikeRepository bikerepo;

	public String add(Bike b) {
		bikerepo.save(b);
		return "Bike saved succesfully";
	}

	public String listAdd(List<Bike> b) {
		bikerepo.saveAll(b);
		return "bike list saved succefull";
	}

	public Bike get(int id) {
		return bikerepo.findById(id).get();

	}

	public String delete(int id) {
		bikerepo.deleteById(id);
		return "bike deleted success";

	}

	public String update(Bike b) {
		bikerepo.save(b);
		return "Bike updates success";
	}

	public List<Bike> getAllDetails() {
		return bikerepo.findAll();
	}
	public List<Bike> getByModel(int model) {
		return bikerepo.getByModel(model);
	}

}
