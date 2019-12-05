package com.sathya.rms.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.rms.admin.Data.RestDiningRepository;
import com.sathya.rms.admin.entity.RestDining;

@Service
public class RestDiningServiceImpl implements RestDiningService {
	
	@Autowired
    private RestDiningRepository restDiningRepository;
	

	public Iterable<RestDining> getAllRestDining() {
		return restDiningRepository.findAll();
	}

	@Transactional
	public RestDining insertRestDining(RestDining restDining) {
		return restDiningRepository.save(restDining);
	}

	@Transactional
	public RestDining updateRestDining(RestDining restDining) {
		return restDiningRepository.save(restDining);
	}

	
	public void deleteRestDining(Integer id) {
	 restDiningRepository.deleteById(id);

	}

}
