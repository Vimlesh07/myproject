package com.sathya.security.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="ROLE")
public class Role {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="ROLEID")
	private Integer roleId;
	@Column(name="ROLENAME",nullable=false)
	private String roleName;
	@Column(name="ROLEDESCRIPTION",nullable=false)
	private String roleDescription;
	
	@OneToMany(mappedBy ="role")
	private Set<Permission> permission;
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDescription() {
		return roleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

}
