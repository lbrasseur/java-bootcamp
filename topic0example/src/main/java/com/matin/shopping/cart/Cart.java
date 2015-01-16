package com.matin.shopping.cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private final List<Item> items;

	public Cart() {
		items = new ArrayList<>();
	}

	public List<Item> getItems() {
		return items;
	}

}
