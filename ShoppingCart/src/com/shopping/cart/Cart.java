package com.shopping.cart;

public interface Cart {

	//Create the cart
	void createCrat();
	
	//Delete Cart
	void deleteCart();
	
	//Get the final price for all the items
	void getFinalPrice();
	
	//Get the sum of all the items
	void getItemQuantity();
	
	//Ask if the cart is empty
	void isEmpty();
	
	//Ask is cart already checked out
	void checkout();
	
}
