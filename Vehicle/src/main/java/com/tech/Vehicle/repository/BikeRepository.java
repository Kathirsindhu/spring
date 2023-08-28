package com.tech.Vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tech.Vehicle.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, Integer> {
	@Query(value = "select * from test_db.bike_details where model like '%?%'", nativeQuery = true)
	public List<Bike> getByModel(int model);

}
