package com.matin.shopping.cart;

import java.util.List;
import java.util.ArrayList;

public class Offers {

	private List<Item> itemsOffer = new ArrayList<>();
	private int nroOffer;
	private int offerPrice;
	
	public Offers(){
		
	}
	
	public void setItemsOffer(List<Item> itemsOffer) {
		this.itemsOffer = itemsOffer;
	}
	
	public List<Item> getItemsOffer() {
		return itemsOffer;
	}

	public int getNroOffer() {
		return nroOffer;
	}

	public void setNroOffer(int nroOffer) {
		this.nroOffer = nroOffer;
	}

	public int getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(int offerPrice) {
		this.offerPrice = offerPrice;
	}

	public void addItemsOffer(Item item){
		itemsOffer.add(item);
	}
}
