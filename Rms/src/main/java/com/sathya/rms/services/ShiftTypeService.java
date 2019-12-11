package com.sathya.rms.services;

import com.sathya.rms.entities.ShiftType;

public interface ShiftTypeService {
	
    public Iterable<ShiftType> getAllShiftType();
	
	public ShiftType insertShiftType(ShiftType shiftType);
	
    public ShiftType updateShiftType(ShiftType shiftType);
   
    public void deleteShiftType(Integer id);

}
