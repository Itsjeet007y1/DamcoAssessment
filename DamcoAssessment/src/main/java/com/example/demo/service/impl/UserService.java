package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.IUserService;

@Service
public class UserService implements IUserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> readUser() {
		return userRepository.findAll();
	}

	@Override
	public String deleteUser(String id) {
		int userId = userRepository.deleteByUserId(id);
		return "User with id: " + userId + " deleted successfully.";
	}

}
