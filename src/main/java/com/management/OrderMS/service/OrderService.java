package com.management.OrderMS.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.OrderMS.dto.OrderDTO;
import com.management.OrderMS.dto.ProductsOrderDTO;
import com.management.OrderMS.entity.Order;
import com.management.OrderMS.entity.ProductsOrder;
import com.management.OrderMS.repository.OrderRepository;
import com.management.OrderMS.repository.ProductsOrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;

	@Autowired
	ProductsOrderRepository productsorderRepository;
	

	public List<OrderDTO> getorders() {
		List<OrderDTO> l=new ArrayList<OrderDTO>();
		List<Order> ord=orderRepository.findAll();
		for(Order ord1: ord) {
		OrderDTO Ord2=OrderDTO.valueof(ord1);
		l.add(Ord2);
		}
		return l;
	}


	public OrderDTO getordersbyid(Integer id) {
		Order ord=orderRepository.getOne(id);
		OrderDTO Ord1=OrderDTO.valueof(ord);
		return Ord1;
	}


	public List<ProductsOrderDTO> getproductorders() {
		List<ProductsOrderDTO> l=new ArrayList<ProductsOrderDTO>();
		List<ProductsOrder> ord=productsorderRepository.findAll();
		for(ProductsOrder ord1: ord) {
		ProductsOrderDTO Ord2=ProductsOrderDTO.valueof(ord1);
		l.add(Ord2);
		}
		return l;
	}


	public ProductsOrderDTO getprodordersbyid(Integer orderid) {
		ProductsOrder ord=productsorderRepository.getOne(orderid);
		ProductsOrderDTO Ord1=ProductsOrderDTO.valueof(ord);
		return Ord1;
	}


	public void removeorder(Integer orderid) {
		Order ord=orderRepository.findByOrderId(orderid);
		orderRepository.delete(ord);
		
	}


	public void removeProductsorder(Integer orderid) {
		ProductsOrder ord=productsorderRepository.findByOrderId(orderid);
		productsorderRepository.delete(ord);
	}
	}
		
		
	


