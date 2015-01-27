package com.globant.classes;

import java.util.List;

public class Offers implements Products {
	
	private final String description;
	private final double price;
	private final List<Items> itemsList;
	
	public Offers (String description, double price, List<Items> itemsList) {
		this.description = description;
		this.price = price;
		this.itemsList = itemsList;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double getPrice() {
		return price;
	}

	public List<Items> getItemsList() {
		return itemsList;
	}

	@Override
	public String toString() {
		return description + " ....... $ " + price
				+ "\n\t"+itemsList;
	}
	
}
