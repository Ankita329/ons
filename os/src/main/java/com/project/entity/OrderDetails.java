package com.project.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_order_details")
public class OrderDetails {

	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orderdetails_seq")
	//@SequenceGenerator(sequenceName= "TBL_ORDER_DETAILS_ID_SEQ", allocationSize = 1, name="orderdetails_seq")
	@Column(name = "order_details_id")
	private int id;
	
	@Column(name = "order_quantity")
	private int quantity;
	
	@Column(name = "order_total_price")
	private double totalPrice;
	
	@Column(name = "order_status")
	private String status;
	
	
	@OneToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	@OneToMany(mappedBy = "orderDetails", cascade = CascadeType.ALL )
	private List<Product> products;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

		
}
