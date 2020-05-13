package com.mtbs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice 
public class MovieExceptionHandler {

	@ExceptionHandler({MovieException.class})
	public ResponseEntity<String> handleError(MovieException exception){
		System.out.println("Exception handled");
	    return new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_FOUND);
	    }
	}