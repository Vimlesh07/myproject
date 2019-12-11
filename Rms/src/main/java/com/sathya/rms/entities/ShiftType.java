package com.sathya.rms.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SHIFTTYPE")
public class ShiftType {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String stype;
	
	private Date s_start;
	
	private Date s_end;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStype() {
		return stype;
	}

	public void setStype(String stype) {
		this.stype = stype;
	}

	public Date getS_start() {
		return s_start;
	}

	public void setS_start(Date s_start) {
		this.s_start = s_start;
	}

	public Date getS_end() {
		return s_end;
	}

	public void setS_end(Date s_end) {
		this.s_end = s_end;
	}

	

}
