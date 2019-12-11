package com.sathya.rms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.entities.ShiftType;
import com.sathya.rms.services.ShiftTypeService;

@RestController
@RequestMapping(path="/shiftType")
public class ShiftTypeController {
	
	@Autowired
   private ShiftTypeService shiftTypeService;
	
	@GetMapping(path="/getAllShiftType")
	public Iterable<ShiftType> getAllShiftType()
	{
		return shiftTypeService.getAllShiftType();
		}
	
	@PostMapping(path="/addShiftType")
	public ShiftType insertShiftType(@RequestBody ShiftType shiftType) {
	
		return shiftTypeService.insertShiftType(shiftType);
	}
	
	@PutMapping(path="/updateShiftType")
	public ShiftType  updateShiftType(@RequestBody ShiftType shiftType) {
		return shiftTypeService.updateShiftType(shiftType);
		
	}
	
	@DeleteMapping(path="/deleteShiftType/{id}")
	public void deleteShiftType(@PathVariable("id") Integer id) {		
		shiftTypeService.deleteShiftType(id);		
	}
}
