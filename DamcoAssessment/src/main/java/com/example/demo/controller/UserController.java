package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.IUserService;

@RestController
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	IUserService userService;
	
	@PostMapping("/saveuser")
	public User createUser(@RequestBody User user) {
		logger.info("saveuser end point is called.");
		return userService.createUser(user);
	}
	
	@GetMapping("/getusers")
	public List<User> getUsers() {
		logger.info("getusers end point is called.");
		return userService.readUser();
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public String deleteUser(@PathVariable("id") String id) {
		logger.info("deleteuser end point is called.");
		return userService.deleteUser(id);
	}
}
