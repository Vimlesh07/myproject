package com.sathya.rms.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.rms.admin.Data.RestaurantRepository;
import com.sathya.rms.admin.entity.Restaurant;

@Service
public class RestaurantServiceImpl implements RestaurantService {
	
	@Autowired
    private RestaurantRepository restaurantRepository;
	

	public Iterable<Restaurant> getAllRestaurant() {
		return restaurantRepository.findAll();
	}

	@Transactional
	public Restaurant insertRestaurant(Restaurant restaurant) {
		return restaurantRepository.save(restaurant);
	}

	@Transactional
	public Restaurant updateRestaurant(Restaurant restaurant) {
		return restaurantRepository.save(restaurant);
	}

	
	public void deleteRestaurant(Integer id) {
	 restaurantRepository.deleteById(id);

	}

}
