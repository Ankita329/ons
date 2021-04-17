package com.project.test;

import org.junit.Test;

import com.project.dao.GenericDao;
import com.project.entity.Cart;
import com.project.entity.CartDetails;
import com.project.entity.User;

public class UseCartTest {

	@Test
	public void addUser() {
		GenericDao dao = new GenericDao();
		
		User user = new User();
		user.setName("Ankita");
		user.setEmail("ankita@gmail.com");
		user.setMobileNo("9422500404");
		user.setAddress("A/204,AdityaKutir");
		user.setCity("Dombivli");
		user.setPincode(421202);
		user.setPassword("123");
	
		dao.save(user);
	}
	
	@Test
	public void addUserAndCart() {
		GenericDao dao = new GenericDao();
		
		User user = new User();
		user.setName("Ankita");
		user.setEmail("ankita@gmail.com");
		user.setMobileNo("9422500404");
		user.setAddress("A/204,AdityaKutir");
		user.setCity("Dombivli");
		user.setPincode(421202);
		user.setPassword("123");
		
		Cart cart = new Cart();
		cart.setTotalItem(2);
		
		CartDetails cd = new CartDetails();
		cd.setQuantity(2);
		cd.setTotalPrice(500);
	
		
		user.setCart(cart);
		cart.setCartDetails(cd);
		dao.save(user);
	}
}
