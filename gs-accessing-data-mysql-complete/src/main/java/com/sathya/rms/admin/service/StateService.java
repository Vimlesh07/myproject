package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entity.State;


public interface StateService {
	public Iterable<State> getAllState();
	
	public State insertState(State state);
	
   public State updateState(State state);
   
   public void deleteState(Integer id);

}
