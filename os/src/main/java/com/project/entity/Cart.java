package com.project.entity;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_usercart")
public class Cart {

	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cart_seq")
	//@SequenceGenerator(sequenceName= "TBL_USERCART_CART_ID_SEQ", allocationSize = 1, name="cart_seq")
	@Column(name = "cart_id")
	private int id;
	
	private int totalItem;
	
	@OneToOne(cascade = CascadeType.ALL)
    private CartDetails cartDetails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}

	public CartDetails getCartDetails() {
		return cartDetails;
	}

	public void setCartDetails(CartDetails cartDetails) {
		this.cartDetails = cartDetails;
	}
	
	
}
