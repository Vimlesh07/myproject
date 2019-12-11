package com.sathya.security.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.security.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
