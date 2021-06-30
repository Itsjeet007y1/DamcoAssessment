package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

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
		userRepository.deleteById(id);
		return "User with id: " + id + " deleted successfully.";
	}

}
