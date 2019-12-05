package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entity.Restaurant;

public interface RestaurantService {
	
public Iterable<Restaurant> getAllRestaurant();
	
	public Restaurant insertRestaurant(Restaurant restaurant);
	
   public Restaurant updateRestaurant(Restaurant restaurant);
   
   public void deleteRestaurant(Integer id);

}
