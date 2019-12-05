package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entity.ShiftType;

public interface ShiftTypeService {
	
    public Iterable<ShiftType> getAllShiftType();
	
	public ShiftType insertShiftType(ShiftType shiftType);
	
    public ShiftType updateShiftType(ShiftType shiftType);
   
    public void deleteShiftType(Integer id);

}
