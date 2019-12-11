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

import com.sathya.security.entity.Role;
import com.sathya.security.service.RoleService;

@RestController
@RequestMapping(path ="/roles")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@GetMapping(path ="/getAllRoles")
	public Iterable<Role> getAllRoles(){
		return roleService.getAllRoles();
	}
	
	@PostMapping(path ="/addRole")
	public Role insertRole(@RequestBody Role role){
		return roleService.insertRole(role);
	}
	
	@PutMapping(path ="/updateRole")
	public Role updateRole(@RequestBody Role role){
		return roleService.updateRole(role);
	}
	
	@DeleteMapping(path ="/deleteRole/{id}")
	public void deleteRole(@PathVariable("id") Integer id){
		roleService.deleteRole(id);;
	}

}
