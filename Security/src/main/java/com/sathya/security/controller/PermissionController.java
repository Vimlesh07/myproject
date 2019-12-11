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

import com.sathya.security.entity.Permission;
import com.sathya.security.service.PermissionService;

@RestController
@RequestMapping(path ="/permissions")
public class PermissionController {
	
	@Autowired
	private PermissionService permissionService;
	
	@GetMapping(path ="/getAllPermissions")
	public Iterable<Permission> getAllPermissions(){
		return permissionService.getAllPermissions();
	}
	
	@PostMapping(path ="/addPermission")
	public Permission insertPermission(@RequestBody Permission permission){
		return permissionService.insertPermission(permission);
	}
	
	@PutMapping(path ="/updatePermission")
	public Permission updatePermission(@RequestBody Permission permission){
		return permissionService.updatePermission(permission);
	}
	
	@DeleteMapping(path ="/deletePermission/{id}")
	public void deletePermission(@PathVariable("id") Integer id){
		permissionService.deletePermission(id);;
	}

}
