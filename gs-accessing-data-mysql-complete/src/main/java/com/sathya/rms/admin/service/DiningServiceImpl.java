package com.sathya.rms.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.rms.admin.Data.DiningRepository;
import com.sathya.rms.admin.entity.Dining;

@Service
public class DiningServiceImpl implements DiningService {
	
	@Autowired
    private DiningRepository diningRepository;
	

	public Iterable<Dining> getAllDining() {
		return diningRepository.findAll();
	}

	@Transactional
	public Dining insertDining(Dining dining) {
		return diningRepository.save(dining);
	}

	@Transactional
	public Dining updateDining(Dining dining) {
		return diningRepository.save(dining);
	}

	
	public void deleteDining(Integer id) {
	 diningRepository.deleteById(id);

	}

}
