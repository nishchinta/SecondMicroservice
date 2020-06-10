package com.management.OrderMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.OrderMS.entity.Order;



public interface OrderRepository extends JpaRepository<Order, Integer> {
	Order getOne(Integer orderId);

	Order findByOrderId(Integer orderid);
}
