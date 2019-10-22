package com.pramati.kart.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long customerId;
	private Date dateOfPurchase;
	private Date shippingDate;
	private BigDecimal amount;
	private Long productId;
	private Long orderId;
	private String orderStatus;
	
	public Order() {
	}

	public Order(Long customerId, Date dateOfPurchase, Date shippingDate, BigDecimal amount, Long productId,
			Long orderId, String orderStatus) {
		super();
		this.customerId = customerId;
		this.dateOfPurchase = dateOfPurchase;
		this.shippingDate = shippingDate;
		this.amount = amount;
		this.productId = productId;
		this.orderId = orderId;
		this.orderStatus = orderStatus;
	}

	public String getOrderStatus() {
		return orderStatus;
	}


	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}


	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public Date getShippingDate() {
		return shippingDate;
	}

	public void setShippingDate(Date shippingDate) {
		this.shippingDate = shippingDate;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

		
}
