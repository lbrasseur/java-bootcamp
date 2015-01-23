package com.matin.shopping.cart;

public class ItemFactory {
	public Item createItem(String itemName, float itemPrice, int itemQuant, boolean itemOffer){
		return new ItemImplement(itemName, itemPrice, itemQuant, itemOffer);
	}
}