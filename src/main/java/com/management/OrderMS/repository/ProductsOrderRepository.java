package com.management.OrderMS.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.management.OrderMS.entity.ProductsOrder;

public interface ProductsOrderRepository extends JpaRepository<ProductsOrder, Integer> {
	ProductsOrder getOne(Integer orderId);

	ProductsOrder findByOrderId(Integer orderid);

}
