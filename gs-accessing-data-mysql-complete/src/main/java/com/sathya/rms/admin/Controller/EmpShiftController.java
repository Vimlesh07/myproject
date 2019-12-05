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

import com.sathya.rms.admin.entity.EmpShift;
import com.sathya.rms.admin.service.EmpShiftService;

@RestController
@RequestMapping(path="/empShift")
public class EmpShiftController {
	
	@Autowired
   private EmpShiftService empShiftService;
	
	@GetMapping(path="/getAllEmpShift")
	public Iterable<EmpShift> getAllEmpShift()
	{
		return empShiftService.getAllEmpShift();
		}
	
	@PostMapping(path="/addEmpShift")
	public EmpShift insertEmpShift(@RequestBody EmpShift empShift) {
	
		return empShiftService.insertEmpShift(empShift);
	}
	
	@PutMapping(path="/updateEmpShift")
	public EmpShift  updateEmpShift(@RequestBody EmpShift empShift) {
		return empShiftService.updateEmpShift(empShift);
		
	}
	
	@DeleteMapping(path="/deleteEmpShift/{id}")
	public void deleteEmpShift(@PathVariable("id") Integer id) {
		
		empShiftService.deleteEmpShift(id);		
	}
}
