package com.sathya.rms.admin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entity.City;
import com.sathya.rms.admin.service.CityService;

@RestController
@RequestMapping(path="/cities")
public class CityController {
	
	@Autowired
   private CityService cityService;
	
	@GetMapping(path="/getAllCity")
	public Iterable<City> getAllCity()
	{
		return cityService.getAllCity();
		}
	
	@PostMapping(path="/addCity")
	public City insertCity(@RequestBody City city) {
	
		return cityService.insertCity(city);
	}
	
	@PutMapping(path="/updateCity")
	public City  updateCity(@RequestBody City city) {
		return cityService.updateCity(city);
		
	}
	
	@DeleteMapping(path="/deleteCity/{id}")
	public void deleteCity(@PathVariable("id") Integer id) {
		
		cityService.deleteCity(id);		
	}
}
