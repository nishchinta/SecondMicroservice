package com.management.OrderMS.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.management.OrderMS.dto.OrderDTO;
import com.management.OrderMS.dto.ProductsOrderDTO;
import com.management.OrderMS.service.OrderService;


@RestController
@CrossOrigin
public class OrderController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	OrderService orderService;
	
	@GetMapping(value="/view", produces= MediaType.APPLICATION_JSON_VALUE)
	public List<OrderDTO> getorders(){
		List<OrderDTO> orderDto=orderService.getorders();
		return orderDto;
		}

	@GetMapping(value="/view/{orderid}", produces= MediaType.APPLICATION_JSON_VALUE)
	public OrderDTO getordersbyid(@PathVariable Integer orderid){
		logger.info("Request for Order view by Buyer {}", orderid);
		OrderDTO orderDto=orderService.getordersbyid(orderid);
		return orderDto;
		}
	
	@GetMapping(value="/productview", produces= MediaType.APPLICATION_JSON_VALUE)
	public List<ProductsOrderDTO> getproductorders(){
		List<ProductsOrderDTO> orderDto=orderService.getproductorders();
		return orderDto;
		}
	
	@GetMapping(value="/productview/{orderid}", produces= MediaType.APPLICATION_JSON_VALUE)
	public ProductsOrderDTO getprodordersbyid(@PathVariable Integer orderid){
		logger.info("Request for Product Ordered view by Buyer {}", orderid);
		ProductsOrderDTO orderDto=orderService.getprodordersbyid(orderid);
		return orderDto;
		}
	
	@DeleteMapping(value="/removeorder/{orderid}", consumes= MediaType.APPLICATION_JSON_VALUE)
	public String removeorder(@PathVariable Integer orderid) {
		logger.info("Request for order removal by buyer {}", orderid);
		orderService.removeorder(orderid);
		return "Deleted successfully";
		
		
	} 
	
	@DeleteMapping(value="/removeproductsorder/{orderid}", consumes= MediaType.APPLICATION_JSON_VALUE)
	public String removeProductsorder(@PathVariable Integer orderid) {
		logger.info("Request for order removal by buyer {}", orderid);
		orderService.removeProductsorder(orderid);
		return "Deleted successfully";
		
		
	} 
}
