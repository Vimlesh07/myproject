package com.sathya.rms.services;

import com.sathya.rms.entities.Orders;

public interface OrderService {
	
public Iterable<Orders> getAllOrders();
	
	public Orders insertOrder(Orders Order);
	
   public Orders updateOrder(Orders order);
   
   public void deleteOrder(Integer id);

}
