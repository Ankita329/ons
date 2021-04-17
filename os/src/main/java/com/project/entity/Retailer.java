package com.project.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_retailer")
public class Retailer {

	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "retailer_seq")
	//@SequenceGenerator(sequenceName= "TBL_RETAILER_RETAILER_ID_SEQ", allocationSize = 1, name="retailer_seq")
	@Column(name = "retailer_id")
	private int id;
	
	@Column(name = "business_name")
	private String name;
	
	@Column(name = "retailer_email")
	private String email;
	
	@Column(name = "retailer_mobile_no")
	private int number;
	
	@OneToMany(mappedBy = "retailer", cascade = CascadeType.ALL)
	@Column(name = "product_id")
	private List<Product> products;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
}
