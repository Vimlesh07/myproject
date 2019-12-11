package com.sathya.security.service;

import com.sathya.security.entity.Role;

public interface RoleService {
	
   public Iterable<Role> getAllRoles();
	
    public Role insertRole(Role role);
	
   public Role updateRole(Role role);
   
   public void deleteRole(Integer id);

}
