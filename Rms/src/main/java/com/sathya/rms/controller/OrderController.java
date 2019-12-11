package com.sathya.rms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.entities.Orders;
import com.sathya.rms.services.OrderService;

@RestController
@RequestMapping(path="/orders")
public class OrderController {
	
	@Autowired
   private OrderService orderService;
	
	@GetMapping(path="/getAllOrders")
	public Iterable<Orders> getAllOrders()
	{
		return orderService.getAllOrders();
		}
	
	@PostMapping(path="/addOrder")
	public Orders insertOrder(@RequestBody Orders order) {
	
		return orderService.insertOrder(order);
	}
	
	@PutMapping(path="/updateOrder")
	public Orders  updateOrder(@RequestBody Orders order) {
		return orderService.updateOrder(order);
		
	}
	
	@DeleteMapping(path="/deleteOrder/{id}")
	public void deleteOrder(@PathVariable("id") Integer id) {
		
		orderService.deleteOrder(id);		
	}
}
