package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entity.City;

public interface CityService {
	
public Iterable<City> getAllCity();
	
	public City insertCity(City city);
	
   public City updateCity(City city);
   
   public void deleteCity(Integer id);

}
