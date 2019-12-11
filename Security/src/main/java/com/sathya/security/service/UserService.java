package com.sathya.security.service;

import com.sathya.security.entity.User;

public interface UserService {
	
   public Iterable<User> getAllUser();
	
    public User insertUser(User user);
	
   public User updateUser(User user);
   
   public void deleteUser(Integer id);

}
