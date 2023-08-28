package com.tech.Vehicle.BikeExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tech.Vehicle.BikeException.PriceNotFoundException;

@RestControllerAdvice
public class PriceNotFoundExceptionHandler {
	@ExceptionHandler(PriceNotFoundException.class)
	public ResponseEntity<Object> priceNotFoundException(PriceNotFoundException p) {
		return new ResponseEntity<Object>(p.getMessage(), HttpStatus.NOT_FOUND);
	}

}
