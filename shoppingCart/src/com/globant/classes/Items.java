package com.globant.classes;

public class Items implements Products {

	private final String description;
	private final double price;
	
	public Items (String description, double price){
		this.description = description;
		this.price = price;
	}
	
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return description + " ....... $ " + price;
	}

////	@Override
//	public int compareTo(Items i1, Items i2) {
//		return new Integer((int)i1.getPrice()).compareTo(new Integer((int) i2.getPrice()));
//	}
	
}
