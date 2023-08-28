package com.tech.Vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech.Vehicle.entity.Vehicle;

public interface RepositoryVehicle extends JpaRepository<Vehicle, Integer> {

}
