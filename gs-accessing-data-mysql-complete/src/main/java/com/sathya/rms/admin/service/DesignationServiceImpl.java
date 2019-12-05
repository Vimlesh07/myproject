package com.sathya.rms.admin.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.rms.admin.Data.DesignationRepository;
import com.sathya.rms.admin.entity.Designation;
@Service
public class DesignationServiceImpl implements DesignationService {
	@Autowired
	DesignationRepository designationRepository;

	public Iterable<Designation> getAllDesignation() {
		return designationRepository.findAll();
	}

	@Transactional
	public Designation insertDesignation(Designation designation) {
		return designationRepository.save(designation);
	}

     @Transactional
	public Designation updateDesignation(Designation designation) {
		return designationRepository.save(designation);
	}

	
	public void deleteDesignation(Integer id) {
		designationRepository.deleteById(id);
		
	}

}
