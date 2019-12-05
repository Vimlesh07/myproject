package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entity.Dining;

public interface DiningService {
	
public Iterable<Dining> getAllDining();
	
	public Dining insertDining(Dining dining);
	
   public Dining updateDining(Dining dining);
   
   public void deleteDining(Integer id);

}
