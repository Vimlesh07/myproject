package com.sathya.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.sathya.security.data.UserRepository;
import com.sathya.security.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	public Iterable<User> getAllUser() {
		return userRepository.findAll();
	}

	@Transactional
	public User insertUser(@RequestBody User user) {
		return userRepository.save(user);
	}

	@Transactional
	public User updateUser(@RequestBody User user) {
		return userRepository.save(user);
	}

	
	public void deleteUser(Integer id) {		
		userRepository.deleteById(id);		
		}
}
