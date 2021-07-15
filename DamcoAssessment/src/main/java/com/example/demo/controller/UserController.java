package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ResponseDefObject;
import com.example.demo.model.User;
import com.example.demo.service.IUserService;
import com.example.demo.utility.Util;

@RestController
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	IUserService userService;
	
	@PostMapping("/saveuser")
	public ResponseEntity<ResponseDefObject<User>> createUser(@RequestBody User user) {
		try {
			logger.info("saveuser end point is called.");
			User savedUser = userService.createUser(user);
			return new ResponseEntity<ResponseDefObject<User>>(new ResponseDefObject<User> 
			(HttpStatus.CREATED.value(), Util.SUCCESS, savedUser), HttpStatus.ACCEPTED);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return new ResponseEntity<ResponseDefObject<User>>(new ResponseDefObject<User> 
			(HttpStatus.EXPECTATION_FAILED.value(), Util.ERROR, e.getMessage()), HttpStatus.EXPECTATION_FAILED);
		}
	}
	
	@PostMapping("/updateuser")
	public ResponseEntity<ResponseDefObject<User>> updateUser(@RequestBody User user) {
		try {
			logger.info("updateuser end point is called.");
			User savedUser = userService.createUser(user);
			return new ResponseEntity<ResponseDefObject<User>>(new ResponseDefObject<User> 
			(HttpStatus.CREATED.value(), Util.SUCCESS, savedUser), HttpStatus.ACCEPTED);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return new ResponseEntity<ResponseDefObject<User>>(new ResponseDefObject<User> 
			(HttpStatus.EXPECTATION_FAILED.value(), Util.ERROR, e.getMessage()), HttpStatus.EXPECTATION_FAILED);
		}
	}
	
	@GetMapping("/getusers")
	public ResponseEntity<ResponseDefObject<List<User>>> getUsers() {
		try {
			logger.info("getusers end point is called.");
			List<User> savedUsersList = userService.readUser();
			return new ResponseEntity<ResponseDefObject<List<User>>>(new ResponseDefObject<List<User>> 
			(HttpStatus.CREATED.value(), Util.SUCCESS, savedUsersList), HttpStatus.ACCEPTED);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return new ResponseEntity<ResponseDefObject<List<User>>>(new ResponseDefObject<List<User>> 
			(HttpStatus.EXPECTATION_FAILED.value(), Util.ERROR, e.getMessage()), HttpStatus.EXPECTATION_FAILED);
		}
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public ResponseEntity<ResponseDefObject<String>> deleteUser(@PathVariable("id") String id) {
		try {
			logger.info("deleteuser end point is called.");
			String str = userService.deleteUser(id);
			return new ResponseEntity<ResponseDefObject<String>>(new ResponseDefObject<String> 
			(HttpStatus.CREATED.value(), Util.SUCCESS, str), HttpStatus.ACCEPTED);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return new ResponseEntity<ResponseDefObject<String>>(new ResponseDefObject<String> 
			(HttpStatus.EXPECTATION_FAILED.value(), Util.ERROR, e.getMessage()), HttpStatus.EXPECTATION_FAILED);
		}
	}
}
