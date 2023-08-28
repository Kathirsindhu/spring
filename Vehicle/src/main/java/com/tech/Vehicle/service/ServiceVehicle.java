package com.tech.Vehicle.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.tech.Vehicle.dao.DaoVehicle;
import com.tech.Vehicle.entity.Vehicle;

@RestController

public class ServiceVehicle {
	@Autowired
	DaoVehicle daoveh;

	public String addList(Vehicle v) {
		return daoveh.addList(v);
	}

	public Vehicle getList(int id) {
		return daoveh.getList(id);
	}

	public String listAll(List<Vehicle> v) {
		return daoveh.listAll(v);
	}

	public String delete(int id) {
		return daoveh.delete(id);
	}

	public String update(Vehicle v) {
		return daoveh.update(v);
	}

	public List<Vehicle> filterage(int price) {
		List<Vehicle> k = daoveh.getall();
		return k.stream().filter(x -> x.getPrice() == price).collect(Collectors.toList());
	}

	public List<Vehicle> filtercolor(String color) {
		List<Vehicle> kk = daoveh.getall();
		return kk.stream().filter(x -> x.getColor().equals(color)).collect(Collectors.toList());
	}

	public Vehicle maxikk() {
		List<Vehicle> kkk = daoveh.getall();
		return kkk.stream().distinct().max(Comparator.comparing(Vehicle::getPrice)).get();
	}

	public Vehicle minikk() {
		List<Vehicle> kkk = daoveh.getall();
		return kkk.stream().distinct().min(Comparator.comparing(Vehicle::getPrice)).get();
	}

	public Vehicle secmax() {
		List<Vehicle> ka = daoveh.getall();
		return ka.stream().distinct().sorted(Comparator.comparing(Vehicle::getPrice).reversed()).skip(1).findFirst()
				.get();
	}

}
