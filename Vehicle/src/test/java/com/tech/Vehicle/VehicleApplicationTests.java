package com.tech.Vehicle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import com.tech.Vehicle.BikeException.BrandNotFoundException;
import com.tech.Vehicle.controller.BikeController;
import com.tech.Vehicle.entity.Bike;

@SpringBootTest
class VehicleApplicationTests {
	@Autowired
	BikeController b;

	@Test
	void contextLoads() {
	}

	@Test
	public void testPost(Bike ba) throws BrandNotFoundException {
		assertEquals("Bike saved succesfull", b.add(ba));
	}
}
