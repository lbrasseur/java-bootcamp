package com.matin.shopping.cart;

public class ItemImplement implements Item{
	private final String itemName;
	private final float itemPrice;
	private final int itemQuant;
	private final boolean itemOffer;
	
	public ItemImplement (String itemName, float itemPrice, int itemQuant, boolean itemOffer){
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemQuant = itemQuant;
		this.itemOffer = itemOffer;
	}
	
	@Override
	public String getItemName(){
		return itemName;
	}
	
	@Override
	public float getItemPrice(){
		return itemPrice;
	}
	
	@Override
	public int getItemQuant(){
		return itemQuant;
	}
	
	@Override
	public boolean getItemOffer(){
		return itemOffer;
	}
}
