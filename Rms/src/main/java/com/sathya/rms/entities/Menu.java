package com.sathya.rms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MENU")
public class Menu {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String item;
	private Integer halfPrice;
	private Integer fullPrice;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Integer getHalfPrice() {
		return halfPrice;
	}
	public void setHalfPrice(Integer halfPrice) {
		this.halfPrice = halfPrice;
	}
	public Integer getFullPrice() {
		return fullPrice;
	}
	public void setFullPrice(Integer fullPrice) {
		this.fullPrice = fullPrice;
	}

}
