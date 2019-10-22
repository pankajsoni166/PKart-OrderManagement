package com.pramati.kart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pramati.kart.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
	public List<Order> findOrderByOrderId(Long orderId);
	
//	@Modifying
//	@Query("update orders set order_status = ?1 where order_id = ?2")
//	void setOrderStatusByOrderId(String status, Long orderId);
}
