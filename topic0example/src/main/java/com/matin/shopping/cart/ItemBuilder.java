package com.matin.shopping.cart;

public class ItemBuilder {
	private String itemName;
	private float itemPrice;
	private int itemQuant;
	private boolean itemOffer;
	
	public ItemBuilder theitemName (String itemName){
		this.itemName = itemName;
		return this;
	}
	
	public ItemBuilder theitemPrice (float itemPrice){
		this.itemPrice = itemPrice;
		return this;
	}
	
	public ItemBuilder theitemQuant (int itemQuant){
		this.itemQuant = itemQuant;
		return this;
	}
	
	public ItemBuilder theitemOffer (boolean itemOffer){
		this.itemOffer = itemOffer;
		return this;
	}
	
	public Item build() {
		return new ItemFactory().createItem(itemName, itemPrice, itemQuant, itemOffer);
	}
}
