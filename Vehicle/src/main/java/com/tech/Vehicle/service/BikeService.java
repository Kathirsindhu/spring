package com.tech.Vehicle.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.Vehicle.BikeException.BrandNotFoundException;
import com.tech.Vehicle.BikeException.ModelNotFoundException;
import com.tech.Vehicle.BikeException.PriceNotFoundException;
import com.tech.Vehicle.dao.BikeDao;
import com.tech.Vehicle.entity.Bike;

@Service
public class BikeService {
	@Autowired
	BikeDao bikedao;

	public String add(Bike b) {
		return bikedao.add(b);
	}

	public String listAdd(List<Bike> b) {
		return bikedao.listAdd(b);
	}

	public Bike get(int id) {
		return bikedao.get(id);
	}

	public String delete(int id) {
		return bikedao.delete(id);
	}

	public String update(Bike b) {
		return bikedao.update(b);
	}

	public List<Bike> getByBrand(String brand) throws BrandNotFoundException {
		List<Bike> k = bikedao.getAllDetails();
		List<Bike> kk = k.stream().filter(x -> x.getBrand().equals(brand)).collect(Collectors.toList());
		if (kk.isEmpty()) {
			throw new BrandNotFoundException("given brand is not in db");
		} else {
			return kk;
		}
	}

	public List<Bike> getByPrice(int price) throws PriceNotFoundException, Exception {
		List<Bike> k = bikedao.getAllDetails();
		List<Bike> kk = k.stream().distinct().filter(x -> x.getPrice() == (price)).collect(Collectors.toList());
		if (kk.isEmpty()) {
			throw new PriceNotFoundException("given price is not in db");
		} else {
			return kk;
		}
	}

	public List<Bike> getByModel(int model) throws ModelNotFoundException, Exception {
		List<Bike> kk = bikedao.getByModel(model);
		if (kk.isEmpty()) {
			throw new ModelNotFoundException("the given model is not available");
		} else {
			return bikedao.getByModel(model);
		}
	}

	public List<Bike> getFullTable() {
		return bikedao.getAllDetails();
	}
}
