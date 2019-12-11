package com.sathya.rms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.rms.data.OrderRepository;
import com.sathya.rms.entities.Orders;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
    private OrderRepository orderRepository;
	

	public Iterable<Orders> getAllOrders() {
		return orderRepository.findAll();
	}

	@Transactional
	public Orders insertOrder(Orders order) {
		return orderRepository.save(order);
	}

	@Transactional
	public Orders updateOrder(Orders order) {
		return orderRepository.save(order);
	}

	
	public void deleteOrder(Integer id) {
	 orderRepository.deleteById(id);

	}

}
