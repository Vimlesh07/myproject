package com.sathya.rms.admin.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.rms.admin.Data.StateRepository;
import com.sathya.rms.admin.entity.State;
@Service
public class StateServiceImpl implements StateService {
	@Autowired
	StateRepository stateRepository;

	public Iterable<State> getAllState() {
		return stateRepository.findAll();
	}

	@Transactional
	public State insertState(State state) {
		return stateRepository.save(state);
	}

     @Transactional
	public State updateState(State state) {
		return stateRepository.save(state);
	}

	
	public void deleteState(Integer id) {
		stateRepository.deleteById(id);
		
	}

}
