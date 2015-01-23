package com.shopping.cart;

public interface Item {
	
	//Add a new item to the item list.
	void addItemtoList();
	
	//Removes an item from the list.
	void removeItemFromList();
	
	//Get Item Id
	void getItemId();
	
	//Shows all item information
	void getItemInfo();
	
	//Changes specify item description
	void changeItemDescription();
	
	//Add specify quantity to an item
	void addItemQuantity();
	
	//Changes specify item price
	void changeItemPrice();
}
