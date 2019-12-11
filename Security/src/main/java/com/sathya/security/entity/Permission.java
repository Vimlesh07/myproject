package com.sathya.security.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name ="PERMISSION")
public class Permission {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
 	@Column(name="PERMISSIONID")
	private Integer permissionId;
	@Column(name="PERMISSIONNAME",nullable=false)
	private String permissionName;
	@Column(name="PERMISSIONDESCRIPTION",nullable=false)
	private String permissionDescription;
	@Transient
	private Integer roleId;
	
	@ManyToOne
	@JoinColumn(name="roleId")
	private Role role;
	
	public Integer getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	public String getPermissionDescription() {
		return permissionDescription;
	}
	public void setPermissionDescription(String permissionDescription) {
		this.permissionDescription = permissionDescription;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

}
 