package com.sathya.security.service;

import com.sathya.security.entity.Permission;

public interface PermissionService {
	
   public Iterable<Permission> getAllPermissions();
	
    public Permission insertPermission(Permission permission);
	
   public Permission updatePermission(Permission permission);
   
   public void deletePermission(Integer id);

}
