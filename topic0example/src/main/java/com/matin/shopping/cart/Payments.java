package com.matin.shopping.cart;

public class Payments {

	private final String paymentMethods[];
	private final String discountType[];
	
	public Payments(){
		paymentMethods = new String[] {"Cash","Credit Card","Paypal"};
		discountType = new String[] {"90% expensive by cash","10% by Credit Card","Cheapest is free"};
	}

	public String[] getPaymentMethods() {
		return paymentMethods;
	}

	public String[] getDiscountType() {
		return discountType;
	}


}
