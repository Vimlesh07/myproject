package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entity.Designation;


public interface DesignationService {
	public Iterable<Designation> getAllDesignation();
	
	public Designation insertDesignation(Designation designation);
	
   public Designation updateDesignation(Designation designation);
   
   public void deleteDesignation(Integer id);

}
