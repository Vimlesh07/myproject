package com.sathya.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.sathya.security.data.PermissionRepository;
import com.sathya.security.entity.Permission;

@Service
public class PermissionServiceImpl implements PermissionService {
	
	@Autowired
	private PermissionRepository permissionRepository;

	public Iterable<Permission> getAllPermissions() {
		return permissionRepository.findAll();
	}

	@Transactional
	public Permission insertPermission(Permission permission) {
		return permissionRepository.save(permission);
	}

	@Transactional
	public Permission updatePermission(Permission permission) {
		return permissionRepository.save(permission);
	}

	
	public void deletePermission(Integer id) {		
		permissionRepository.deleteById(id);		
		}
}
