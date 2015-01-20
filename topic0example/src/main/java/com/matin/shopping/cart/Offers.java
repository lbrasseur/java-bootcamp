package com.matin.shopping.cart;

import java.util.List;
import java.util.ArrayList;

public class Offers {

	private List<Item> itemsOffer = new ArrayList<>();
	private float offerPrice;
	
	public Offers(){
		
	}
	
	public void setItemsOffer(List<Item> itemsOffer) {
		this.itemsOffer = itemsOffer;
	}
	
	public List<Item> getItemsOffer() {
		return itemsOffer;
	}

	public float getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(float offerPrice) {
		this.offerPrice = offerPrice;
	}

	public void addItemsOffer(Item item){
		itemsOffer.add(item);
	}
}
