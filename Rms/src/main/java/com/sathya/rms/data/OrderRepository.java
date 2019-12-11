package com.sathya.rms.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.entities.Orders;


public interface OrderRepository extends CrudRepository<Orders,Integer> {

}
