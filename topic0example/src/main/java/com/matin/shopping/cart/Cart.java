package com.matin.shopping.cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private final List<Item> items;
	private String paymentForm;
	private boolean isOffer;
	private boolean isDiscount;
	private float finalPrice;
	private int nroTrans;
	private String transDate;

	public Cart() {
		items = new ArrayList<>();
	}

	public List<Item> getItems() {
		return items;
	}

}
