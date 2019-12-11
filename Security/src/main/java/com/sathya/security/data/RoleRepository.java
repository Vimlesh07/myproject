package com.sathya.security.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.security.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {

}
