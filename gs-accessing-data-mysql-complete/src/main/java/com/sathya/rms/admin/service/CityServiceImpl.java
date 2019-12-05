package com.sathya.rms.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.rms.admin.Data.CityRepository;
import com.sathya.rms.admin.entity.City;

@Service
public class CityServiceImpl implements CityService {
	
	@Autowired
    private CityRepository cityRepository;
	

	public Iterable<City> getAllCity() {
		return cityRepository.findAll();
	}

	@Transactional
	public City insertCity(City city) {
		return cityRepository.save(city);
	}

	@Transactional
	public City updateCity(City city) {
		return cityRepository.save(city);
	}

	
	public void deleteCity(Integer id) {
	 cityRepository.deleteById(id);

	}

}
