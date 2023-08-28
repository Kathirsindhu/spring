package com.tech.Vehicle.BikeExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tech.Vehicle.BikeException.ModelNotFoundException;

@RestControllerAdvice
public class ModelNotFoundExceptionHandler {
	@ExceptionHandler(ModelNotFoundException.class)
	public ResponseEntity<Object> modelNotFoundException(ModelNotFoundException m) {
		return new ResponseEntity<Object>(m.getMessage(), HttpStatus.NOT_FOUND);
	}

}
