package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entity.Location;

public interface LocationService {
	
public Iterable<Location> getAllLocation();
	
	public Location insertLocation(Location location);
	
   public Location updateLocation(Location location);
   
   public void deleteLocation(Integer id);

}
