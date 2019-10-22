package com.pramati.kart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pramati.kart.model.Order;
import com.pramati.kart.repository.OrderRepository;

@Service
public class OrderService {
	
	public static String CANCELLED = "cancelled";
	
	@Autowired
	private OrderRepository orderRepository;
	
	
	public List<Order> getOrderByOrderId(Long orderId) {
		return orderRepository.findOrderByOrderId(orderId);
	}
	
	
//	public void cancelOrder(Long orderId) {
//		orderRepository.setOrderStatusByOrderId(CANCELLED, orderId);
//		
//	}
	
	
}
