package com.amazon.create.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class LoginExceptionHandler {
	@ExceptionHandler(LoginException.class)
	public ResponseEntity<Object> bb(LoginException b) {
		return new ResponseEntity<>(b.getMessage(), HttpStatus.NOT_FOUND);
	}
}
