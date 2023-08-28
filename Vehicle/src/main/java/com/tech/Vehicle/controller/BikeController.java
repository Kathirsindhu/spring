package com.tech.Vehicle.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.Vehicle.BikeException.BrandNotFoundException;
import com.tech.Vehicle.BikeException.ModelNotFoundException;
import com.tech.Vehicle.BikeException.PriceNotFoundException;
import com.tech.Vehicle.entity.Bike;
import com.tech.Vehicle.service.BikeService;

@RestController
@RequestMapping(value = "/bike")
public class BikeController {
	@Autowired
	BikeService bikeser;
	static Logger log = Logger.getLogger(BikeController.class);

	@PostMapping(value = "/add")
	public String add(@RequestBody Bike b) {
		PropertyConfigurator.configure("log4j.properties");
		log.info(bikeser.add(b));
		return bikeser.add(b);
	}

	@PostMapping(value = "/listadd")
	public String listAdd(@RequestBody List<Bike> b) {
		return bikeser.listAdd(b);
	}

	@GetMapping(value = "/get/{id}")
	public Bike get(@PathVariable int id) {
		PropertyConfigurator.configure("log4j.properties");
		log.info(bikeser.get(id));
		return bikeser.get(id);
	}

	@DeleteMapping(value = "/delete/{id}")
	public String delete(@PathVariable int id) {
		return bikeser.delete(id);

	}

	@PostMapping(value = "/update")
	public String update(@RequestBody Bike b) {
		return bikeser.update(b);
	}

	@GetMapping(value = "/brandfilter/{brand}")
	public List<Bike> getByBrand(@PathVariable String brand) throws BrandNotFoundException {
		return bikeser.getByBrand(brand);
	}

	@GetMapping(value = "/pricefilter/{price}")
	public List<Bike> getByPrice(@PathVariable int price) throws PriceNotFoundException, Exception {
		return bikeser.getByPrice(price);
	}

	@GetMapping(value = "/modelfilter/{model}")
	public List<Bike> getByModel(@PathVariable int model) throws ModelNotFoundException, Exception {
		return bikeser.getByModel(model);
	}

	@GetMapping(value = "/getfulltable")
	public List<Bike> getFullTable() {
		return bikeser.getFullTable();
	}

}
