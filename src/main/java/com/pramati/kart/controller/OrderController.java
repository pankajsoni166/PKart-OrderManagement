package com.pramati.kart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pramati.kart.model.Order;
import com.pramati.kart.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/order/{orderId}")
	public List<Order> getOrderByOrderId(@PathVariable Long orderId){
		return orderService.getOrderByOrderId(orderId);
	}
	
//	@RequestMapping(method = RequestMethod.PUT, value = "/cancelOrder/{orderId}")
//	public void cancelOrder(@PathVariable Long orderId) {
//		orderService.cancelOrder(orderId);
//	}
}
