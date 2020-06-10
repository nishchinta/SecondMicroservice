package com.management.OrderMS.dto;



import com.management.OrderMS.entity.ProductsOrder;


public class ProductsOrderDTO {
	int orderId;
	int prodId;
	int sellerId;
	int quantity;
	String status;
	float price;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public static ProductsOrderDTO valueof(ProductsOrder prod) {
		ProductsOrderDTO productsOrderDTO=new ProductsOrderDTO();
		productsOrderDTO.setOrderId(prod.getOrderId());
		productsOrderDTO.setProdId(prod.getProdId());
		productsOrderDTO.setPrice(prod.getPrice());
		productsOrderDTO.setQuantity(prod.getQuantity());
		productsOrderDTO.setSellerId(prod.getSellerId());
		productsOrderDTO.setStatus(prod.getStatus());
		return productsOrderDTO;
	}

}
