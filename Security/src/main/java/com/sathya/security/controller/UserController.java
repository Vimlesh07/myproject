package com.sathya.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.security.entity.User;
import com.sathya.security.service.UserService;

@RestController
@RequestMapping(path ="/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(path ="/getAllUsers")
	public Iterable<User> getAllUsers(){
		return userService.getAllUser();
	}
	
	@PostMapping(path ="/addUser")
	public User insertUser(@RequestBody User user){
		return userService.insertUser(user);
	}
	
	@PutMapping(path ="/updateUser")
	public User updateUser(@RequestBody User user){
		return userService.updateUser(user);
	}
	
	@DeleteMapping(path ="/deleteUser/{id}")
	public void deleteUser(@PathVariable("id") Integer id){
		userService.deleteUser(id);;
	}

}
