package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entity.EmpShift;

public interface EmpShiftService {
	
public Iterable<EmpShift> getAllEmpShift();
	
	public EmpShift insertEmpShift(EmpShift empShift);
	
   public EmpShift updateEmpShift(EmpShift empShift);
   
   public void deleteEmpShift(Integer id);

}
