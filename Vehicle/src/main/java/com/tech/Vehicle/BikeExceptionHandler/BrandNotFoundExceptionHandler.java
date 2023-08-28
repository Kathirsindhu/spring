package com.tech.Vehicle.BikeExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tech.Vehicle.BikeException.BrandNotFoundException;

@RestControllerAdvice
public class BrandNotFoundExceptionHandler {
	@ExceptionHandler(BrandNotFoundException.class)
	public ResponseEntity<Object> bb(BrandNotFoundException b) {
		return new ResponseEntity<>(b.getMessage(), HttpStatus.NOT_FOUND);
	}

}
