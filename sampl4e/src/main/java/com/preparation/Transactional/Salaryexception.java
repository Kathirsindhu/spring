package com.preparation.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Salaryexception {
	@ExceptionHandler(ExceptionGlobal.class)
	public ResponseEntity<Object> get(ExceptionGlobal ee) {
		return new ResponseEntity<Object>(ee.getMessage(), HttpStatus.NOT_FOUND);

	}
}
