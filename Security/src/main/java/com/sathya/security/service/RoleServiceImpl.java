package com.sathya.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.sathya.security.data.RoleRepository;
import com.sathya.security.entity.Role;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleRepository roleRepository;

	public Iterable<Role> getAllRoles() {
		return roleRepository.findAll();
	}

	@Transactional
	public Role insertRole(Role role) {
		return roleRepository.save(role);
	}

	@Transactional
	public Role updateRole(Role role) {
		return roleRepository.save(role);
	}

	
	public void deleteRole(Integer id) {		
		roleRepository.deleteById(id);		
		}
}
