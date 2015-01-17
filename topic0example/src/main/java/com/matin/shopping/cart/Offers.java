package com.matin.shopping.cart;

import java.util.List;

public class Offers {

	private List<Offers> itemsOffer;
	private int nroOffer;
	private int offerPrice;
	
	public Offers(){
		
	}
	
	public void setItemsOffer(List<Offers> itemsOffer) {
		this.itemsOffer = itemsOffer;
	}
	
	public List<Offers> getItemsOffer() {
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

}
