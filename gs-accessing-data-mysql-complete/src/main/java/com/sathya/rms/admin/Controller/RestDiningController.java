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

import com.sathya.rms.admin.entity.RestDining;
import com.sathya.rms.admin.service.RestDiningService;

@RestController
@RequestMapping(path="/restDining")
public class RestDiningController {
	
	@Autowired
   private RestDiningService restDiningService;
	
	@GetMapping(path="/getAllRestDining")
	public Iterable<RestDining> getAllRestDining()
	{
		return restDiningService.getAllRestDining();
		}
	
	@PostMapping(path="/addRestDining")
	public RestDining insertRestDining(@RequestBody RestDining restDining) {
	
		return restDiningService.insertRestDining(restDining);
	}
	
	@PutMapping(path="/updateRestDining")
	public RestDining  updateRestDining(@RequestBody RestDining restDining) {
		return restDiningService.updateRestDining(restDining);
		
	}
	
	@DeleteMapping(path="/deleteRestDining/{id}")
	public void deleteRestDining(@PathVariable("id") Integer id) {
		
		restDiningService.deleteRestDining(id);		
	}
}
