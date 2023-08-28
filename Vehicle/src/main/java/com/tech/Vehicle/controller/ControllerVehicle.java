package com.tech.Vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.Vehicle.entity.Vehicle;
import com.tech.Vehicle.service.ServiceVehicle;

@RestController
@RequestMapping(value = "/Vehicle")
public class ControllerVehicle {
	@Autowired
	ServiceVehicle serveh;

	@PostMapping(value = "/insert")
	public String addList(@RequestBody Vehicle v) {
		return serveh.addList(v);
	}

	@GetMapping(value = "/get/{id}")
	public Vehicle getList(@PathVariable int id) {
		return serveh.getList(id);
	}

	@PostMapping(value = "/listadd")
	public String listAll(@RequestBody List<Vehicle> v) {
		return serveh.listAll(v);
	}

	@DeleteMapping(value = "/delete/{id}")
	public String delete(@PathVariable int id) {
		return serveh.delete(id);
	}

	@PostMapping(value = "/update/{v}")
	public String update(@RequestBody Vehicle v) {
		return serveh.update(v);
	}

	@GetMapping(value = "filterprice/{price}")
	public List<Vehicle> filterage(@PathVariable int price) {
		return serveh.filterage(price);
	}

	@GetMapping(value = "filtercolor/{color}")
	public List<Vehicle> filtercolor(@PathVariable String color) {
		return serveh.filtercolor(color);
	}

	@GetMapping(value = "/max")
	public Vehicle maxikk() {
		return serveh.maxikk();

	}

	@GetMapping(value = "/min")
	public Vehicle minikk() {
		return serveh.minikk();
	}

	@GetMapping(value = "/secondmax")
	public Vehicle secmax() {
		return serveh.secmax();
	}
}
