package com.example.demo.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exception.InvalidFieldException;
import com.example.demo.model.ResponseDefObject;
import com.example.demo.utility.Util;

@RestControllerAdvice
public class UserExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<ResponseDefObject<String>> handleInvalidFieldException(InvalidFieldException exception) {
		return new ResponseEntity<ResponseDefObject<String>>(new ResponseDefObject<String> 
		(HttpStatus.EXPECTATION_FAILED.value(), Util.ERROR, exception.getMessage()), HttpStatus.EXPECTATION_FAILED);
	}
}
