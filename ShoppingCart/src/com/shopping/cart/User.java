package com.shopping.cart;

public interface User {

	//Add a new user
	void addUser();
	
	//Remove a user
	void removeUser();
	
	//Change the User Password
	void changeUserPassword();
	
	//Change User E-mail
	void changeUserMail();

	//Change the User name
	void changeUserName();
	
	//If not checked out save the cart state
	void saveUserCart();
}
