package com.globant.classes;

import java.text.NumberFormat;

public class PaymentTypes {

	private final String description;
	private final double discount;
	
	public PaymentTypes (String description, double discount){
		this.description = description;
		this.discount = discount;
	}

	public String getDescription() {
		return description;
	}

	public double getDiscount() {
		return discount;
	}

	@Override
	public String toString() {
		return "Payment Type\n\tDescription: " + description + "\n\tDiscount: "
				+ NumberFormat.getPercentInstance().format(discount);
	}
	
}