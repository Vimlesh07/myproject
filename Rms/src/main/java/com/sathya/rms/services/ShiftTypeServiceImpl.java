package com.sathya.rms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.rms.data.ShiftTypeRepository;
import com.sathya.rms.entities.ShiftType;

@Service
public class ShiftTypeServiceImpl implements ShiftTypeService {
	
	@Autowired
    private ShiftTypeRepository shiftTypeRepository;
	

	public Iterable<ShiftType> getAllShiftType() {
		return shiftTypeRepository.findAll();
	}

	@Transactional
	public ShiftType insertShiftType(ShiftType shiftType) {
		return shiftTypeRepository.save(shiftType);
	}

	@Transactional
	public ShiftType updateShiftType(ShiftType shiftType) {
		return shiftTypeRepository.save(shiftType);
	}

	
	public void deleteShiftType(Integer id) {
	 shiftTypeRepository.deleteById(id);

	}

}
