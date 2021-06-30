package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface IUserService {
	
	public User createUser(User user);
	public List<User> readUser();
	public String deleteUser(String id);
}
