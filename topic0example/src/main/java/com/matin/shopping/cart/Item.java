package com.matin.shopping.cart;

public class Item {
	private String itemName;
	private float itemPrice;
	private int itemQuant;
	private boolean itemOffer;
	private int itemId;
	
	public Item(String itemName, float itemPrice, int itemQuant, boolean itemOffer, int itemId){
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemQuant = itemQuant;
		this.itemOffer = itemOffer;
		this.itemId = itemId;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public float getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public int getItemQuant() {
		return itemQuant;
	}
	public void setItemQuant(int itemQuant) {
		this.itemQuant = itemQuant;
	}
	
	public boolean isItemOffer() {
		return itemOffer;
	}
	public void setItemOffer(boolean itemOffer) {
		this.itemOffer = itemOffer;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
}