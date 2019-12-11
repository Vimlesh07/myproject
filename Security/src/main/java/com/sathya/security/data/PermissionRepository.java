package com.sathya.security.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.security.entity.Permission;


public interface PermissionRepository extends CrudRepository<Permission, Integer> {

}
