package com.sathya.rms.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.rms.admin.Data.EmpShiftRepository;
import com.sathya.rms.admin.entity.EmpShift;

@Service
public class EmpShiftServiceImpl implements EmpShiftService {
	
	@Autowired
    private EmpShiftRepository empShiftRepository;
	

	public Iterable<EmpShift> getAllEmpShift() {
		return empShiftRepository.findAll();
	}

	@Transactional
	public EmpShift insertEmpShift(EmpShift empShift) {
		return empShiftRepository.save(empShift);
	}

	@Transactional
	public EmpShift updateEmpShift(EmpShift empShift) {
		return empShiftRepository.save(empShift);
	}

	
	public void deleteEmpShift(Integer id) {
	 empShiftRepository.deleteById(id);

	}

}
