package com.sathya.security.entity;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="USERTB")
public class User { 
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name ="ID")
	private Integer id;
	@Column(name="USERNAME", unique=true,nullable=false)
	private String username;
	@Column(name="EMAILID",unique=true,nullable=false)
	private String emailId;
	@Column(name="PASSWORD",nullable=false)
	private String password;
	@Column(name="PHONENUMBER",unique=true,nullable=false)
	private Integer phoneNumber;
	@Column(name="FIRSTNAME",nullable=false)
	private String firstName;
	@Column(name="LASTNAME")
	private String lastName;
	@Column(name="ADDRESS1",nullable=false)
	private String address1;
	@Column(name="ADDRESS2")
	private String address2;
	@Column(name="COUNTRY",nullable=false)
	private String country;
	@Column(name="STATE",nullable=false)
	private String state;
	@Column(name="ZIP",nullable=false)
	private String zip;
	@Column(name="CREATEDON",nullable=false)
	private Date createdOn;
	@Column(name="ROLE",nullable=false)
	private String role;
	@Column(name="AVATAR",nullable=false)
	private String avatar;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

}
